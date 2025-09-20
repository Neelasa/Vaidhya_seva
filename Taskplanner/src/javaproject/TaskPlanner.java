package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskPlanner extends JFrame {
    private TaskManager taskManager;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;

    public TaskPlanner() {
        taskManager = new TaskManager();
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);

        setTitle("Task Planner");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set up UI components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel titleLabel = new JLabel("Title:");
        JTextField taskTitle = new JTextField(20);
        JLabel descriptionLabel = new JLabel("Description:");
        JTextField taskDescription = new JTextField(20);
        JLabel dueDateLabel = new JLabel("Due Date (yyyy-mm-dd):");
        JTextField taskDueDate = new JTextField(20);
        JButton addButton = new JButton("Add Task");
        JButton removeButton = new JButton("Remove Task");
        JButton completeButton = new JButton("Mark as Complete");

        panel.add(titleLabel);
        panel.add(taskTitle);
        panel.add(descriptionLabel);
        panel.add(taskDescription);
        panel.add(dueDateLabel);
        panel.add(taskDueDate);
        panel.add(addButton);
        panel.add(removeButton);
        panel.add(completeButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = taskTitle.getText();
                String description = taskDescription.getText();
                String dueDate = taskDueDate.getText();

                if (!isValidDate(dueDate)) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid due date in the format yyyy-mm-dd.");
                    return;
                }

                Task task = new Task(title, description, dueDate);
                taskManager.addTask(task);
                refreshTaskList();
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskManager.removeTask(taskManager.getTasks().get(selectedIndex));
                    refreshTaskList();
                }
            }
        });

        completeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskManager.updateTaskStatus(taskManager.getTasks().get(selectedIndex), true);
                    refreshTaskList();
                }
            }
        });

        taskList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    Task selectedTask = taskManager.getTasks().get(selectedIndex);
                    JOptionPane.showMessageDialog(null, "Description: " + selectedTask.getDescription() + "\nDue Date: " + selectedTask.getDueDate());
                }
            }
        });

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(taskList), BorderLayout.CENTER);
    }

    private boolean isValidDate(String date) {
        String regex = "^(\\d{4})-(\\d{2})-(\\d{2})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        return matcher.matches();
    }

    private void refreshTaskList() {
        taskListModel.clear();
        taskManager.getTasks().sort((t1, t2) -> t1.getDueDate().compareTo(t2.getDueDate()));
        for (Task task : taskManager.getTasks()) {
            taskListModel.addElement(task.getTitle() + (task.isCompleted() ? " (Completed)" : ""));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TaskPlanner().setVisible(true));
    }
}

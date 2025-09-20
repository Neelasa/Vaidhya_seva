package Doctor.view;

import Doctor.bean.LeaveBean;
import Doctor.dao.AdminDao;
import Doctor.dao.PatientDao;
import Doctor.dao.ReporterDao;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class DoctorView {

    public static void main(String[] args) {
        String[] options = {"Doctor Management", "Patient Management", "Reporter Panel", "Exit"};
        AdminDao adminDao = new AdminDao();
        PatientDao patientDao = new PatientDao();
        ReporterDao reporterDao = new ReporterDao();

        // This loop keeps the main menu active
        while (true) {
            int choice = JOptionPane.showOptionDialog(
                    null,
                    "Select a module to proceed",
                    "Hospital Admin Panel",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    options,
                    options[0]);

            switch (choice) {
                case 0:
                    // This calls the AdminDao menu and waits for it to finish
                    adminDao.handleDoctorOperations();
                    break;
                case 1:
                    patientDao.handlePatientOperations();
                    break;
                case 2:
                   ArrayList<LeaveBean> al= reporterDao.viewAllLeaves();
                   String str="";
                   for(LeaveBean lb:al)
                   {
                	   str+=lb.getDocorID()+" "+lb.getLeaveForm()+" "+lb.getLeaveTo()+"\n";
                   }
                   JOptionPane.showMessageDialog(null, str);
                    break;
                case 3:
                case JOptionPane.CLOSED_OPTION:
                    // This is the correct way to exit the program
                    JOptionPane.showMessageDialog(null, "Exiting system. Goodbye!");
                    System.exit(0);
                default:
                    // Handles invalid choices
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
}
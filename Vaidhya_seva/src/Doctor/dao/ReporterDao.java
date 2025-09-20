package Doctor.dao;

import Doctor.bean.LeaveBean;
import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class ReporterDao {

    static final String DB_URL = "jdbc:mysql://localhost:3306/vaidhya_seva";
    static final String USER = "root";
    static final String PASS = "HAREKRISHNA";

    // Get database connection
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage());
            return null;
        }
    }

    // Get all leaves filtered by status (0 = available, 1 = on leave)
    public static ArrayList<LeaveBean> allDoctorsLeave(int status) {
        ArrayList<LeaveBean> list = new ArrayList<>();
        String sql = "SELECT * FROM `leave` WHERE Status = ?";

        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, status);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    LeaveBean lb = new LeaveBean();
                    lb.setLeaveID(rs.getString("LeaveId"));
                    lb.setDoctorID(rs.getString("DoctorId"));
                    lb.setLeaveForm(rs.getString("Leave_From"));
                    lb.setLeaveTo(rs.getString("Leave_To"));
                    lb.setReason(rs.getString("Reason"));
                    lb.setStatus(rs.getInt("Status"));
                    list.add(lb);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching leaves: " + e.getMessage());
        }

        return list;
    }

    // ✅ Insert a new leave
    public static void insertLeave(LeaveBean lb) {
        String sql = "INSERT INTO `leave` (LeaveId, DoctorId, Leave_From, Leave_To, Reason, Status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, lb.getLeaveID());
            ps.setString(2, (String) lb.getDoctorID());
            ps.setString(3, lb.getLeaveForm());
            ps.setString(4, lb.getLeaveTo());
            ps.setString(5, lb.getReason());
            ps.setInt(6, lb.getStatus());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Leave inserted successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Insert leave failed: " + e.getMessage());
        }
    }

    //  View all leaves
    public static ArrayList<LeaveBean> viewAllLeaves() {
        ArrayList<LeaveBean> list = new ArrayList<>();
        String sql = "SELECT * FROM `leave`";

        try (Connection con = getCon(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                LeaveBean lb = new LeaveBean();
                lb.setLeaveID(rs.getString("LeaveId"));
                lb.setDoctorID(rs.getString("DoctorId"));
                lb.setLeaveForm(rs.getString("Leave_From"));
                lb.setLeaveTo(rs.getString("Leave_To"));
                lb.setReason(rs.getString("Reason"));
                lb.setStatus(rs.getInt("Status"));
                list.add(lb);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error fetching all leaves: " + e.getMessage());
        }

        return list;
    }

	public void handleReporterOperations() {
		// TODO Auto-generated method stub
		
	}
}
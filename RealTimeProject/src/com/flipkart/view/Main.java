package com.flipkart.view;

import javax.swing.JOptionPane;
import com.flipkart.bean.UserBean;
import com.flipkart.dao.UserDao;

public class Main {

	public static void main(String []args)
	{
		UserDao.getCon();
		String username = JOptionPane.showInputDialog("Enter Username:");
		String role=JOptionPane.showInputDialog("Enter role");
		String password=JOptionPane.showInputDialog("Enter password");

		UserBean ub=new UserBean();

		ub.setName(username);

		ub.setRole(role);

		ub.setPassword(password);

		if(UserDao.checkUser(ub).equals("Admin"))

		{

	 JOptionPane.showMessageDialog(null, ub.getRole());

		}

		else if(UserDao.checkUser(ub).equals("Customer"))

		{

	 JOptionPane.showMessageDialog(null, ub.getRole());

		}
		else

		{

	 JOptionPane.showMessageDialog(null, UserDao.checkUser(ub));

		}
		
	}
	
}

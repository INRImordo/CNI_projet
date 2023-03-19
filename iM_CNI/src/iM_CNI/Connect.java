package iM_CNI;

import java.sql.*;

import javax.swing.JOptionPane;

public class Connect {
	PreparedStatement pst;
	ResultSet rs;
	/*
	 * 		initialiser la connection
	 */
	Connection con;
	public Connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3308/inri", "inri", "inri" );
			
			
			//JOptionPane.showMessageDialog(null, "connection OK");
			
			
			
		} catch (ClassNotFoundException | SQLException e) {

			JOptionPane.showMessageDialog(null, "echec connection" +e);
		}
		
	}
	
}
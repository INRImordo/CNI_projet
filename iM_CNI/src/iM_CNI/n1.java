package iM_CNI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class n1 {

	private JFrame frmImCni;
	private JLabel m;
	private JPasswordField password;
	

	PreparedStatement pst;
	ResultSet rs;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					n1 window = new n1();
					window.frmImCni.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public n1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmImCni = new JFrame();
		frmImCni.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\INRI\\Downloads\\IMG_ICON\\im_logo.ico"));
		frmImCni.setTitle("iM CNI");
		frmImCni.setBounds(100, 100, 1080, 650);
		frmImCni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmImCni.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel footer = new JPanel();
		footer.setBackground(SystemColor.activeCaption);
		panel.add(footer, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("INRI MORDO | 2023");
		footer.add(lblNewLabel);
		
		JPanel header = new JPanel();
		header.setBackground(SystemColor.activeCaption);
		panel.add(header, BorderLayout.NORTH);
		
		JLabel i = new JLabel("i");
		i.setForeground(new Color(255, 0, 0));
		i.setFont(new Font("Tahoma", Font.PLAIN, 16));
		header.add(i);
		
		m = new JLabel("M");
		m.setFont(new Font("Tahoma", Font.BOLD, 16));
		header.add(m);
		
		JPanel body = new JPanel();
		body.setBackground(Color.LIGHT_GRAY);
		panel.add(body, BorderLayout.CENTER);
		body.setLayout(new BorderLayout(0, 0));
		
		JPanel bodyConn = new JPanel();
		body.add(bodyConn, BorderLayout.CENTER);
		bodyConn.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Notre but est de vous faciliter la vie, Plus besoin de marcher avec vos CNI juste un téléphone suffit");
		lblNewLabel_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(165, 42, 42));
		bodyConn.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel bodyConn1 = new JPanel();
		bodyConn1.setBorder(new MatteBorder(1, 3, 3, 3, (Color) new Color(0, 0, 0)));
		bodyConn.add(bodyConn1, BorderLayout.CENTER);
		bodyConn1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setVgap(50);
		bodyConn1.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1_1 = new JLabel("All the world will have ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_1.setFont(new Font("Square721 BT", Font.BOLD, 22));
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("a National");
		lblNewLabel_2.setForeground(new Color(165, 42, 42));
		lblNewLabel_2.setFont(new Font("Square721 BT", Font.BOLD, 22));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("map");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_1_1.setFont(new Font("Square721 BT", Font.BOLD, 22));
		panel_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		bodyConn1.add(panel_1_1, BorderLayout.CENTER);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("C");
		lblNewLabel_1_1_1_1.setBounds(468, 5, 21, 38);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_1_1_1.setFont(new Font("Square721 BT", Font.BOLD, 30));
		panel_1_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("onnexion");
		lblNewLabel_1_1_2.setBounds(494, 10, 98, 28);
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1_2.setForeground(new Color(47, 79, 79));
		lblNewLabel_1_1_2.setFont(new Font("Square721 BT", Font.BOLD, 22));
		panel_1_1.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOM  ou ID :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(336, 120, 83, 22);
		panel_1_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PASSWORD :");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3_1.setBounds(336, 173, 83, 22);
		panel_1_1.add(lblNewLabel_3_1);
		
		JFormattedTextField id = new JFormattedTextField();
		id.setBounds(429, 112, 253, 30);
		panel_1_1.add(id);
		
		password = new JPasswordField();
		password.setBounds(429, 175, 253, 22);
		panel_1_1.add(password);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idd = id.getText();
				
				@SuppressWarnings("deprecation")
				String pass = password.getText();
				
				

				String req = "SELECT * FROM `personne` WHERE kit = ? and password = ?";
//				String req1 = "INSERT INTO personne(id, kit, password ) values('',?,?)";
				
				if(idd.isEmpty() || pass.isEmpty()) {

					JOptionPane.showMessageDialog(null, "Vérifiez si les champs ont bien été remplis");
				}else {
					Connect x = new Connect();
					
					try {
						pst=x.con.prepareStatement(req);
						pst.setString(1, idd);
						pst.setString(2, pass);
						
						rs = pst.executeQuery();
						if(!rs.isBeforeFirst()) {

							JOptionPane.showMessageDialog(null, "recherche loss");
							id.setText("");
							password.setText("");
						}else {
							while (rs.next()) {
								frmImCni.dispose();
								
								//Acceuil1.main(null);
								
								Acceuil window = new Acceuil();
								window.getFrame().setVisible(true);
								window.getTextField_nom().setText(rs.getString(4));
								window.getTextField_prenom().setText(rs.getString(5));
								window.getTextField_sex().setText(rs.getString(6));
								window.getTextField_nee().setText(rs.getString(8));
								window.getTextField_a().setText(rs.getString(9));
								window.getTextField_taille().setText(rs.getString(10));
								window.getTextField_np().setText(rs.getString(11));
								window.getTextField_ndlm().setText(rs.getString(12));
								window.getTextField_taf().setText(rs.getString(13));
								window.getTextField_delivre().setText(rs.getString(14));
								window.getTextField_expiration().setText(rs.getString(15));
								window.getTextField_par().setText(rs.getString(16));
							
								
							}
							
							
							
							
							
						}
						
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					
				}
				
				
			}
		});
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.setBounds(737, 303, 107, 21);
		panel_1_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		body.add(panel_2, BorderLayout.SOUTH);
	}
	}

package iM_CNI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;

import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;

public class Acceuil {

	private JFrame frame;
	private JTextField textField_ndlm;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_np;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JPanel panel_M;
	private JPanel panel_P;
	private JTextField textField_nom;
	private JTextField textField_prenom;
	private JTextField textField_sex;
	private JTextField textField_tel;
	private JTextField textField_taf;
	private JTextField textField_nee;
	private JTextField textField_a;
	private JTextField textField_taille;
	private JTextField textField_sp;
	private JTextField textField_kit;
	private JTextField textField_numCni;
	private JTextField textField_delivre;
	private JTextField textField_par;
	private JTextField textField_expiration;
	private JPanel panel;
	private JPanel panel_1_1;
	private JPanel panel_3;
	private JButton btnInformationsSurLe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acceuil window = new Acceuil();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public JTextField getTextField_nom() {
		return textField_nom;
	}


	public void setTextField_nom(JTextField textField_nom) {
		this.textField_nom = textField_nom;
	}


	public JTextField getTextField_prenom() {
		return textField_prenom;
	}


	public void setTextField_prenom(JTextField textField_prenom) {
		this.textField_prenom = textField_prenom;
	}


	public JTextField getTextField_sex() {
		return textField_sex;
	}


	public void setTextField_sex(JTextField textField_sex) {
		this.textField_sex = textField_sex;
	}


	public JTextField getTextField_tel() {
		return textField_tel;
	}


	public void setTextField_tel(JTextField textField_tel) {
		this.textField_tel = textField_tel;
	}


	public JTextField getTextField_taf() {
		return textField_taf;
	}


	public void setTextField_taf(JTextField textField_taf) {
		this.textField_taf = textField_taf;
	}


	public JTextField getTextField_nee() {
		return textField_nee;
	}


	public void setTextField_nee(JTextField textField_nee) {
		this.textField_nee = textField_nee;
	}


	public JTextField getTextField_a() {
		return textField_a;
	}


	public void setTextField_a(JTextField textField_a) {
		this.textField_a = textField_a;
	}


	public JTextField getTextField_taille() {
		return textField_taille;
	}


	public void setTextField_taille(JTextField textField_taille) {
		this.textField_taille = textField_taille;
	}


	public JTextField getTextField_sp() {
		return textField_sp;
	}


	public void setTextField_sp(JTextField textField_sp) {
		this.textField_sp = textField_sp;
	}


	public JTextField getTextField_kit() {
		return textField_kit;
	}


	public void setTextField_kit(JTextField textField_kit) {
		this.textField_kit = textField_kit;
	}


	public JTextField getTextField_numCni() {
		return textField_numCni;
	}


	public void setTextField_numCni(JTextField textField_numCni) {
		this.textField_numCni = textField_numCni;
	}


	public JTextField getTextField_delivre() {
		return textField_delivre;
	}


	public void setTextField_delivre(JTextField textField_delivre) {
		this.textField_delivre = textField_delivre;
	}


	public JTextField getTextField_par() {
		return textField_par;
	}


	public void setTextField_par(JTextField textField_par) {
		this.textField_par = textField_par;
	}


	public JTextField getTextField_expiration() {
		return textField_expiration;
	}


	public void setTextField_expiration(JTextField textField_expiration) {
		this.textField_expiration = textField_expiration;
	}


	public void setBtnInformationsSurLe(JButton btnInformationsSurLe) {
		this.btnInformationsSurLe = btnInformationsSurLe;
	}


	/**
	 * Create the application.
	 */
	public Acceuil() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("iM CNI ACCEUIL");
		frame.setBounds(100, 100, 1080, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame. setResizable(false);
		
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel footer = new JPanel();
		footer.setBackground(SystemColor.activeCaption);
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("©®INRI MORDO | 2023");
		footer.add(lblNewLabel);
		
		panel_M = new JPanel();
		frame.getContentPane().add(panel_M, BorderLayout.CENTER);
		panel_M.setLayout(null);
		
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setBounds(0, 0, 1066, 35);
		panel_M.add(panel_3_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("INFORMATIONS SUR LA MERE");
		lblNewLabel_1_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_1_1.setFont(new Font("Square721 BT", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_3_2_1.add(lblNewLabel_1_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(0, 35, 1066, 527);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(0, 128, 128), new Color(0, 139, 139), new Color(47, 79, 79)));
		panel_M.add(panel_1_1_1);
		
		JLabel lblKit_1 = new JLabel("NOM DE LA MERE :");
		lblKit_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblKit_1.setBounds(309, 125, 148, 13);
		panel_1_1_1.add(lblKit_1);
		
		JLabel lblDelivreLe_1 = new JLabel("DATE DE NAISSANCE :");
		lblDelivreLe_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblDelivreLe_1.setBounds(292, 205, 175, 13);
		panel_1_1_1.add(lblDelivreLe_1);
		
		JLabel lblPar_1 = new JLabel("TELEPHONE :");
		lblPar_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblPar_1.setBounds(370, 251, 97, 13);
		panel_1_1_1.add(lblPar_1);
		
		textField_ndlm = new JTextField();
		textField_ndlm.setEnabled(false);
		textField_ndlm.setColumns(10);
		textField_ndlm.setBounds(467, 112, 251, 26);
		panel_1_1_1.add(textField_ndlm);
		
		textField_15 = new JTextField();
		textField_15.setEnabled(false);
		textField_15.setColumns(10);
		textField_15.setBounds(467, 154, 251, 26);
		panel_1_1_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setEnabled(false);
		textField_16.setColumns(10);
		textField_16.setBounds(467, 192, 251, 26);
		panel_1_1_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setEnabled(false);
		textField_17.setColumns(10);
		textField_17.setBounds(467, 235, 251, 26);
		panel_1_1_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setEnabled(false);
		textField_18.setColumns(10);
		textField_18.setBackground(new Color(0, 191, 255));
		textField_18.setBounds(292, 274, 426, 26);
		panel_1_1_1.add(textField_18);
		
		JLabel lblSexe_1_1_1 = new JLabel("PRENOM MERE :");
		lblSexe_1_1_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblSexe_1_1_1.setBounds(331, 167, 131, 13);
		panel_1_1_1.add(lblSexe_1_1_1);
		
		panel_P = new JPanel();
		panel_P.setLayout(null);
		frame.getContentPane().add(panel_P, BorderLayout.CENTER);
		
		JPanel panel_3_2_1_1 = new JPanel();
		panel_3_2_1_1.setBounds(0, 0, 1066, 35);
		panel_P.add(panel_3_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("INFORMATIONS SUR LE PERE");
		lblNewLabel_1_1_1_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1_1_1_1.setFont(new Font("Square721 BT", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBackground(Color.LIGHT_GRAY);
		panel_3_2_1_1.add(lblNewLabel_1_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(0, 128, 128), new Color(0, 139, 139), new Color(47, 79, 79)));
		panel_1_1_1_1.setBounds(0, 35, 1066, 527);
		panel_P.add(panel_1_1_1_1);
		
		JLabel lblKit_1_1 = new JLabel("NOM DU PERE :");
		lblKit_1_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblKit_1_1.setBounds(336, 125, 131, 13);
		panel_1_1_1_1.add(lblKit_1_1);
		
		JLabel lblDelivreLe_1_1 = new JLabel("DATE DE NAISSANCE :");
		lblDelivreLe_1_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblDelivreLe_1_1.setBounds(292, 205, 175, 13);
		panel_1_1_1_1.add(lblDelivreLe_1_1);
		
		JLabel lblPar_1_1 = new JLabel("TELEPHONE :");
		lblPar_1_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblPar_1_1.setBounds(360, 248, 97, 13);
		panel_1_1_1_1.add(lblPar_1_1);
		
		textField_np = new JTextField();
		textField_np.setEnabled(false);
		textField_np.setColumns(10);
		textField_np.setBounds(467, 112, 251, 26);
		panel_1_1_1_1.add(textField_np);
		
		textField_20 = new JTextField();
		textField_20.setEnabled(false);
		textField_20.setColumns(10);
		textField_20.setBounds(467, 154, 251, 26);
		panel_1_1_1_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setEnabled(false);
		textField_21.setColumns(10);
		textField_21.setBounds(467, 192, 251, 26);
		panel_1_1_1_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setEnabled(false);
		textField_22.setColumns(10);
		textField_22.setBounds(467, 235, 251, 26);
		panel_1_1_1_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setEnabled(false);
		textField_23.setColumns(10);
		textField_23.setBackground(new Color(0, 191, 255));
		textField_23.setBounds(292, 274, 426, 26);
		panel_1_1_1_1.add(textField_23);
		
		JLabel lblSexe_1_1_1_1 = new JLabel("PRENOM PERE :");
		lblSexe_1_1_1_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblSexe_1_1_1_1.setBounds(331, 167, 131, 13);
		panel_1_1_1_1.add(lblSexe_1_1_1_1);
		
		JPanel panel_if = new JPanel();
		panel_if.setLayout(null);
		frame.getContentPane().add(panel_if, BorderLayout.CENTER);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(192, 192, 192), new Color(128, 128, 128)));
		panel.setBounds(66, 81, 466, 468);
		panel_if.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(0, 128, 128), new Color(0, 139, 139), new Color(47, 79, 79)));
		panel_1.setBounds(10, 10, 446, 224);
		panel.add(panel_1);
		
		JLabel lblNom = new JLabel("NOM :");
		lblNom.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblNom.setBounds(211, 25, 45, 13);
		panel_1.add(lblNom);
		
		JPanel panel_IMG = new JPanel();
		panel_IMG.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
		panel_IMG.setBounds(0, 10, 148, 204);
		panel_1.add(panel_IMG);
		panel_IMG.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\INRI\\Downloads\\IMG_ICON\\1077012.png"));
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_IMG.add(lblNewLabel_2, BorderLayout.CENTER);
		
		JLabel lblPrenom = new JLabel("PRENOM :");
		lblPrenom.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblPrenom.setBounds(185, 67, 71, 13);
		panel_1.add(lblPrenom);
		
		JLabel lblSexe = new JLabel("SEXE :");
		lblSexe.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblSexe.setBounds(205, 105, 51, 13);
		panel_1.add(lblSexe);
		
		JLabel lblAge = new JLabel("TELEPHONE :");
		lblAge.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblAge.setBounds(158, 148, 98, 13);
		panel_1.add(lblAge);
		
		JLabel lblProfession = new JLabel("PROFESSON :");
		lblProfession.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblProfession.setBounds(160, 187, 96, 13);
		panel_1.add(lblProfession);
		
		textField_nom = new JTextField();
		textField_nom.setEnabled(false);
		textField_nom.setColumns(10);
		textField_nom.setBounds(266, 12, 170, 26);
		panel_1.add(textField_nom);
		
		textField_prenom = new JTextField();
		textField_prenom.setEnabled(false);
		textField_prenom.setColumns(10);
		textField_prenom.setBounds(266, 54, 170, 26);
		panel_1.add(textField_prenom);
		
		textField_sex = new JTextField();
		textField_sex.setEnabled(false);
		textField_sex.setColumns(10);
		textField_sex.setBounds(266, 92, 170, 26);
		panel_1.add(textField_sex);
		
		textField_tel = new JTextField();
		textField_tel.setEnabled(false);
		textField_tel.setColumns(10);
		textField_tel.setBounds(266, 135, 170, 26);
		panel_1.add(textField_tel);
		
		textField_taf = new JTextField();
		textField_taf.setEnabled(false);
		textField_taf.setColumns(10);
		textField_taf.setBounds(266, 174, 170, 26);
		panel_1.add(textField_taf);
		
		JLabel lblNeeLe = new JLabel("NÉE LE :");
		lblNeeLe.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblNeeLe.setBounds(56, 262, 65, 13);
		panel.add(lblNeeLe);
		
		JLabel lblA = new JLabel("À :");
		lblA.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblA.setBounds(92, 306, 19, 13);
		panel.add(lblA);
		
		JLabel lblTaille = new JLabel("TAILLE :");
		lblTaille.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblTaille.setBounds(56, 349, 55, 13);
		panel.add(lblTaille);
		
		JLabel lblSP = new JLabel("S P :");
		lblSP.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblSP.setBounds(78, 391, 33, 13);
		panel.add(lblSP);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(341, 404, 115, 54);
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\INRI\\Downloads\\IMG_ICON\\FINGER - Copie.png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_4, BorderLayout.CENTER);
		
		textField_nee = new JTextField();
		textField_nee.setEnabled(false);
		textField_nee.setColumns(10);
		textField_nee.setBounds(131, 249, 170, 26);
		panel.add(textField_nee);
		
		textField_a = new JTextField();
		textField_a.setEnabled(false);
		textField_a.setColumns(10);
		textField_a.setBounds(131, 293, 170, 26);
		panel.add(textField_a);
		
		textField_taille = new JTextField();
		textField_taille.setEnabled(false);
		textField_taille.setColumns(10);
		textField_taille.setBounds(131, 336, 170, 26);
		panel.add(textField_taille);
		
		textField_sp = new JTextField();
		textField_sp.setEnabled(false);
		textField_sp.setColumns(10);
		textField_sp.setBounds(131, 378, 170, 26);
		panel.add(textField_sp);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(341, 404, 115, 54);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\INRI\\Downloads\\IMG_ICON\\FINGER - Copie.png"));
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(192, 192, 192), new Color(0, 128, 128), new Color(0, 139, 139), new Color(47, 79, 79)));
		panel_1_1.setBounds(568, 81, 446, 224);
		panel_if.add(panel_1_1);
		
		JLabel lblKit = new JLabel("KIT :");
		lblKit.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblKit.setBounds(145, 25, 30, 13);
		panel_1_1.add(lblKit);
		
		JLabel lblDelivreLe = new JLabel("DELIVRE LE :");
		lblDelivreLe.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblDelivreLe.setBounds(88, 105, 97, 13);
		panel_1_1.add(lblDelivreLe);
		
		JLabel lblPar = new JLabel("PAR :");
		lblPar.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblPar.setBounds(147, 151, 38, 13);
		panel_1_1.add(lblPar);
		
		JLabel lblDateDexpiration = new JLabel("DATE D'EXPIRATION :");
		lblDateDexpiration.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblDateDexpiration.setBounds(39, 187, 152, 13);
		panel_1_1.add(lblDateDexpiration);
		
		textField_kit = new JTextField();
		textField_kit.setEnabled(false);
		textField_kit.setColumns(10);
		textField_kit.setBounds(185, 12, 251, 26);
		panel_1_1.add(textField_kit);
		
		textField_numCni = new JTextField();
		textField_numCni.setEnabled(false);
		textField_numCni.setColumns(10);
		textField_numCni.setBounds(185, 54, 251, 26);
		panel_1_1.add(textField_numCni);
		
		textField_delivre = new JTextField();
		textField_delivre.setEnabled(false);
		textField_delivre.setColumns(10);
		textField_delivre.setBounds(185, 92, 251, 26);
		panel_1_1.add(textField_delivre);
		
		textField_par = new JTextField();
		textField_par.setEnabled(false);
		textField_par.setColumns(10);
		textField_par.setBounds(185, 135, 251, 26);
		panel_1_1.add(textField_par);
		
		textField_expiration = new JTextField();
		textField_expiration.setEnabled(false);
		textField_expiration.setColumns(10);
		textField_expiration.setBounds(185, 174, 251, 26);
		panel_1_1.add(textField_expiration);
		
		JLabel lblSexe_1_1 = new JLabel("N° DE LA CNI :");
		lblSexe_1_1.setFont(new Font("Square721 BT", Font.PLAIN, 14));
		lblSexe_1_1.setBounds(72, 67, 108, 13);
		panel_1_1.add(lblSexe_1_1);
		
		Button button = new Button("EXIT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		button.setForeground(new Color(160, 82, 45));
		button.setFont(new Font("Courier New", Font.BOLD, 14));
		button.setBackground(new Color(169, 169, 169));
		button.setBounds(916, 511, 50, 21);
		panel_if.add(button);
		
		panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 128, 128)));
		panel_3.setBounds(0, 0, 1066, 35);
		panel_if.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("MES INFORMATIONS");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setFont(new Font("Square721 BT", Font.BOLD, 20));
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		frame.getContentPane().add(panel_4, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("MES INFORMATIONS");
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setBorder(new TitledBorder(new CompoundBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 128), new Color(0, 191, 255)), null), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 191, 255)));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_if.setVisible(true);
				
				panel_P.setVisible(false);
				panel_M.setVisible(false);
			}
		});
		panel_4.add(btnNewButton);
		
		btnInformationsSurLe = new JButton("INFORMATIONS SUR LE PERE");
		btnInformationsSurLe.setForeground(new Color(255, 255, 204));
		btnInformationsSurLe.setBackground(new Color(128, 0, 0));
		btnInformationsSurLe.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 128), new Color(0, 255, 255)));
		btnInformationsSurLe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					frame.getContentPane().add(panel_P);
					panel_P.setVisible(true);
					
					panel_if.setVisible(false);
					panel_M.setVisible(false);
			}
		});
		panel_4.add(btnInformationsSurLe);
		
		JButton btnInformationsSurLa = new JButton("INFORMATIONS SUR LA MERE");
		btnInformationsSurLa.setBackground(new Color(128, 128, 0));
		btnInformationsSurLa.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 128), new Color(0, 191, 255)));
		btnInformationsSurLa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().add(panel_M);
				panel_M.setVisible(true);

				panel_P.setVisible(false);
				panel_if.setVisible(false);
			}
		});
		panel_4.add(btnInformationsSurLa);
	}
	
	
	public JTextField getTextField_ndlm() {
		return textField_ndlm;
	}


	public void setTextField_ndlm(JTextField textField_ndlm) {
		this.textField_ndlm = textField_ndlm;
	}


	public JTextField getTextField_np() {
		return textField_np;
	}


	public void setTextField_np(JTextField textField_np) {
		this.textField_np = textField_np;
	}


	/*
	 * 	methodes
	 */
	public void remplir(JTextField a) {
		n1 n = new n1();
		try {
			if(n.rs.isBeforeFirst()) {
				String affi = "1235";
				JFormattedTextField it = new JFormattedTextField();
				it.setText(affi);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	/*
	 * 	getters and setters   ------**********-*******-****************-***********-***************
	 */
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JTextField getTextField_14() {
		return textField_ndlm;
	}

	public void setTextField_14(JTextField textField_14) {
		this.textField_ndlm = textField_14;
	}

	public JTextField getTextField_15() {
		return textField_15;
	}

	public void setTextField_15(JTextField textField_15) {
		this.textField_15 = textField_15;
	}

	public JTextField getTextField_16() {
		return textField_16;
	}

	public void setTextField_16(JTextField textField_16) {
		this.textField_16 = textField_16;
	}

	public JTextField getTextField_17() {
		return textField_17;
	}

	public void setTextField_17(JTextField textField_17) {
		this.textField_17 = textField_17;
	}

	public JTextField getTextField_18() {
		return textField_18;
	}

	public void setTextField_18(JTextField textField_18) {
		this.textField_18 = textField_18;
	}

	public JTextField getTextField_19() {
		return textField_np;
	}

	public void setTextField_19(JTextField textField_19) {
		this.textField_np = textField_19;
	}

	public JTextField getTextField_20() {
		return textField_20;
	}

	public void setTextField_20(JTextField textField_20) {
		this.textField_20 = textField_20;
	}

	public JTextField getTextField_21() {
		return textField_21;
	}

	public void setTextField_21(JTextField textField_21) {
		this.textField_21 = textField_21;
	}

	public JTextField getTextField_22() {
		return textField_22;
	}

	public void setTextField_22(JTextField textField_22) {
		this.textField_22 = textField_22;
	}

	public JTextField getTextField_23() {
		return textField_23;
	}

	public void setTextField_23(JTextField textField_23) {
		this.textField_23 = textField_23;
	}

	public JTextField getTextField() {
		return textField_nom;
	}

	public void setTextField(JTextField textField) {
		this.textField_nom = textField;
	}

	public JTextField getTextField_1() {
		return textField_prenom;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_prenom = textField_1;
	}

	public JTextField getTextField_2() {
		return textField_sex;
	}

	public void setTextField_2(JTextField textField_2) {
		this.textField_sex = textField_2;
	}

	public JTextField getTextField_3() {
		return textField_tel;
	}

	public void setTextField_3(JTextField textField_3) {
		this.textField_tel = textField_3;
	}

	public JTextField getTextField_4() {
		return textField_taf;
	}

	public void setTextField_4(JTextField textField_4) {
		this.textField_taf = textField_4;
	}

	public JTextField getTextField_5() {
		return textField_nee;
	}

	public void setTextField_5(JTextField textField_5) {
		this.textField_nee = textField_5;
	}

	public JTextField getTextField_6() {
		return textField_a;
	}

	public void setTextField_6(JTextField textField_6) {
		this.textField_a = textField_6;
	}

	public JTextField getTextField_7() {
		return textField_taille;
	}

	public void setTextField_7(JTextField textField_7) {
		this.textField_taille = textField_7;
	}

	public JTextField getTextField_8() {
		return textField_sp;
	}

	public void setTextField_8(JTextField textField_8) {
		this.textField_sp = textField_8;
	}

	public JTextField getTextField_9() {
		return textField_kit;
	}

	public void setTextField_9(JTextField textField_9) {
		this.textField_kit = textField_9;
	}

	public JTextField getTextField_10() {
		return textField_numCni;
	}

	public void setTextField_10(JTextField textField_10) {
		this.textField_numCni = textField_10;
	}

	public JTextField getTextField_11() {
		return textField_delivre;
	}

	public void setTextField_11(JTextField textField_11) {
		this.textField_delivre = textField_11;
	}

	public JTextField getTextField_12() {
		return textField_par;
	}

	public void setTextField_12(JTextField textField_12) {
		this.textField_par = textField_12;
	}

	public JTextField getTextField_13() {
		return textField_expiration;
	}

	public void setTextField_13(JTextField textField_13) {
		this.textField_expiration = textField_13;
	}

	public void setPanel_M(JPanel panel_M) {
		this.panel_M = panel_M;
	}

	public void setPanel_P(JPanel panel_P) {
		this.panel_P = panel_P;
	}



	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void setPanel_1_1(JPanel panel_1_1) {
		this.panel_1_1 = panel_1_1;
	}

	public void setPanel_3(JPanel panel_3) {
		this.panel_3 = panel_3;
	}

	public JPanel getPanel_if() {
		return getPanel_if();
	}
	public JPanel getPanel_M() {
		return panel_M;
	}
	public JPanel getPanel_P() {
		return panel_P;
	}

	public JPanel getPanel() {
		return panel;
	}
	public JPanel getPanel_1_1() {
		return panel_1_1;
	}
	public JPanel getPanel_3() {
		return panel_3;
	}

	public void setPanel_if(JPanel panel_if) {
	}
	public JButton getBtnInformationsSurLe() {
		return btnInformationsSurLe;
	}
}

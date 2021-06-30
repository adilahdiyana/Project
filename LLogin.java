package Project;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class LLogin extends JFrame {

	private JPanel contentPane;
	private JTextField UserNameTextField;
	private JTextField PasswordTextField;
	private String fmf, tcf, ddf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LLogin frame = new LLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String getFashionModernFee() {
		return this.fmf;
	}

	public String getTraditionalCustomsFee() {
		return this.tcf;
	}

	public String getDinnerDressFee() {
		return this.ddf;
	}

	/**
	 * Create the frame.
	 */
	public LLogin() {
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 998, 562); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Home");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LClothingRental frame = new LClothingRental();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(128, 0, 0)));
		panel.setBounds(0, 0, 985, 505);
		contentPane.add(panel);
		panel.setLayout(null);

		UserNameTextField = new JTextField();
		UserNameTextField.setBackground(new Color(230, 230, 250));
		UserNameTextField.setBounds(616, 116, 265, 53);
		UserNameTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(UserNameTextField);
		UserNameTextField.setColumns(10);

		PasswordTextField = new JTextField();
		PasswordTextField.setBackground(new Color(230, 230, 250));
		PasswordTextField.setBounds(616, 189, 265, 53);
		PasswordTextField.setFont(new Font("Tahoma", Font.BOLD, 20));

		PasswordTextField.setColumns(10);
		panel.add(PasswordTextField);

		JComboBox UserComboBox = new JComboBox();
		UserComboBox.setBackground(new Color(255, 192, 203));
		UserComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		UserComboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Customer", "Admin"}));
		UserComboBox.setBounds(616, 285, 265, 46);
		panel.add(UserComboBox);

		JButton LoginButton = new JButton("LOGIN");
		LoginButton.setBackground(new Color(250, 235, 215));
		LoginButton.setBounds(646, 364, 115, 53);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
					if (UserNameTextField.getText().equals("adilah") && PasswordTextField.getText().equals("ad")
							&& UserComboBox.getSelectedItem().equals("Admin")) {
						JOptionPane.showMessageDialog(null, "LLogin Succesful!");
						LAdminCompany a = new LAdminCompany(); // calling another frame/window
						a.setModalExclusionType(null);
						a.setVisible(true);
						dispose();

					}
					for (int i = 0; i < LUserRegistration.table.getRowCount(); i++) {

						if (UserNameTextField.getText().equals(LUserRegistration.table.getValueAt(i, 0))
								&& PasswordTextField.getText().equals(LUserRegistration.table.getValueAt(i, 1))
								&& UserComboBox.getSelectedItem().equals("Customer")) {
							JOptionPane.showMessageDialog(null, "LLogin Succesful!");
							LCustomerRegistration gm = new LCustomerRegistration(); // calling another frame/window
							gm.setModalExclusionType(null);
							gm.setVisible(true);
							dispose();
						}
					}
					if (UserComboBox.getSelectedItem().equals("Select User")) {
						JOptionPane.showMessageDialog(null, "Please select the correct user!");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter the correct user and password!");
				}

			}
		});
		LoginButton.setFont(new Font("STXinwei", Font.BOLD, 18));
		panel.add(LoginButton);

		JButton ResetButton = new JButton("RESET");
		ResetButton.setBackground(new Color(250, 235, 215));
		ResetButton.setBounds(727, 430, 115, 53);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNameTextField.setText("");
				PasswordTextField.setText("");
			}
		});
		ResetButton.setFont(new Font("STXinwei", Font.BOLD, 18));
		panel.add(ResetButton);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(28, 97, 489, 307);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\rentpic.png"));

		JLabel TitleLabel = new JLabel("Clothing Rental Business");
		TitleLabel.setForeground(new Color(255, 255, 255));
		TitleLabel.setFont(new Font("Script MT Bold", Font.BOLD, 40));
		TitleLabel.setBounds(259, 10, 696, 76);
		panel.add(TitleLabel);

		JButton registerButton = new JButton("REGISTER");
		registerButton.setBackground(new Color(250, 235, 215));
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LUserRegistration gm = new LUserRegistration(); // calling another frame/window
				gm.setModalExclusionType(null);
				gm.setVisible(true);
				dispose();
			}
		});
		registerButton.setFont(new Font("STXinwei", Font.BOLD, 18));
		registerButton.setBounds(783, 364, 135, 53);
		panel.add(registerButton);

		JLabel lblUserName = new JLabel("Username");
		lblUserName.setBackground(new Color(0, 0, 0));
		lblUserName.setForeground(new Color(0, 0, 0));
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUserName.setBounds(527, 129, 125, 31);
		panel.add(lblUserName);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(527, 202, 115, 31);
		panel.add(lblPassword);

		JLabel lblUser = new JLabel("User");
		lblUser.setForeground(new Color(0, 0, 0));
		lblUser.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUser.setBounds(527, 293, 115, 31);
		panel.add(lblUser);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\clothpic.jpeg"));
		lblNewLabel.setBounds(10, 10, 965, 485);
		panel.add(lblNewLabel);
	}

	public LLogin(String fmf, String tcf, String ddf) {
		this.fmf = fmf;
		this.tcf = tcf;
		this.ddf= ddf;

		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 998, 562); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Home");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Home");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LClothingRental frame = new LClothingRental();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		mnNewMenu.add(mntmNewMenuItem_7);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 204));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(244, 164, 96)));
		panel.setBounds(0, 0, 985, 505);
		contentPane.add(panel);
		panel.setLayout(null);

		UserNameTextField = new JTextField();
		UserNameTextField.setBounds(690, 107, 265, 53);
		UserNameTextField.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(UserNameTextField);
		UserNameTextField.setColumns(10);

		PasswordTextField = new JTextField();
		PasswordTextField.setBounds(690, 189, 265, 53);
		PasswordTextField.setFont(new Font("Tahoma", Font.BOLD, 20));

		PasswordTextField.setColumns(10);
		panel.add(PasswordTextField);

		JComboBox UserComboBox = new JComboBox();
		UserComboBox.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		UserComboBox.setModel(new DefaultComboBoxModel(new String[] { "Select User", "Participant", "Admin" }));
		UserComboBox.setBounds(690, 285, 265, 46);
		panel.add(UserComboBox);

		JButton LoginButton = new JButton("LOGIN");
		LoginButton.setBounds(676, 364, 115, 53);
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {// 2.2 Exception Handling
					if (UserNameTextField.getText().equals("adilah") && PasswordTextField.getText().equals("ad")
							&& UserComboBox.getSelectedItem().equals("Admin")) {
						JOptionPane.showMessageDialog(null, "LLogin Succesful!");
						LAdminCompany a = new LAdminCompany(); // calling another frame/window
						a.setModalExclusionType(null);
						a.setVisible(true);
						dispose();

					}

					if (UserNameTextField.getText().equals("alex") && PasswordTextField.getText().equals("12345")
							&& UserComboBox.getSelectedItem().equals("Customer")) {
						JOptionPane.showMessageDialog(null, "LLogin Succesful!");
						LCustomerRegistration gm = new LCustomerRegistration(getFashionModernFee(), getTraditionalCustomsFee(),
								getDinnerDressFee()); // calling another frame/window
						gm.setModalExclusionType(null);
						gm.setVisible(true);
						dispose();
					}

					if (UserComboBox.getSelectedItem().equals("Select User")) {
						JOptionPane.showMessageDialog(null, "Please select the correct user!");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Please enter the correct user and password!");
				}

			}
		});
		LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(LoginButton);

		JButton ResetButton = new JButton("RESET");
		ResetButton.setBounds(529, 364, 115, 53);
		ResetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserNameTextField.setText("");
				PasswordTextField.setText("");
			}
		});
		ResetButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panel.add(ResetButton);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 46, 533, 475);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\rentpic.png"));

		JLabel TitleLabel = new JLabel("Ultimate Gamer Center System");
		TitleLabel.setForeground(Color.WHITE);
		TitleLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 40));
		TitleLabel.setBounds(200, 21, 696, 76);
		panel.add(TitleLabel);

		JButton registerButton = new JButton("REGISTER");
		registerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LUserRegistration gm = new LUserRegistration(); // calling another frame/window
				gm.setModalExclusionType(null);
				gm.setVisible(true);
				dispose();
			}
		});
		registerButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		registerButton.setBounds(821, 364, 135, 53);
		panel.add(registerButton);

		JLabel lblUserName = new JLabel("USERNAME");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUserName.setBounds(487, 126, 125, 31);
		panel.add(lblUserName);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(487, 211, 115, 31);
		panel.add(lblPassword);

		JLabel lblUser_1 = new JLabel("USER");
		lblUser_1.setForeground(Color.WHITE);
		lblUser_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUser_1.setBounds(496, 296, 115, 31);
		panel.add(lblUser_1);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\rentpic.png"));
		lblNewLabel.setBounds(10, 10, 965, 485);
		panel.add(lblNewLabel);
	}
}

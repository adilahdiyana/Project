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

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class LUserRegistration extends JFrame {

	private JPanel contentPane;
	private JTable model;
	private JFrame frame;
	private JTextField emailTextField;
	private JTextField UserTextField;
	private JTextField PasswordTextField;
	private JTextField confirmTextField;
	static JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LUserRegistration frame = new LUserRegistration();
					frame.setVisible(true);
				} catch (Exception arg0) {
					arg0.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LUserRegistration() {
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel.setBounds(0, 0, 975, 568);
		contentPane.add(panel);
		panel.setLayout(null);
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

		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_1_1_1_1.setBackground(new Color(250, 240, 230));
		panel_1_1_1_1.setBounds(63, 488, 869, 70);
		panel.add(panel_1_1_1_1);

		JButton btnAddRecord = new JButton("Register");
		btnAddRecord.setBackground(new Color(250, 235, 215));
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (PasswordTextField.getText().equals(confirmTextField.getText())) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] { UserTextField.getText(), PasswordTextField.getText(),
						emailTextField.getText(), 
				});
				}
				else {
					JOptionPane.showMessageDialog(null, "Please confirm again your password!",
							"Registration System", JOptionPane.OK_OPTION);
				}
				}
		});
		btnAddRecord.setBounds(10, 18, 171, 35);
		panel_1_1_1_1.add(btnAddRecord);
		btnAddRecord.setFont(new Font("STXinwei", Font.PLAIN, 25));

		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(250, 235, 215));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserTextField.setText("");
				PasswordTextField.setText("");
				confirmTextField.setText("");
				emailTextField.setText("");
				
			}
		});
		btnReset.setBounds(226, 18, 108, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("STXinwei", Font.PLAIN, 25));

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(250, 235, 215));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (table.getSelectedRow() == -1) {
					if (table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete!", "Registration System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete!", "Registration System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(391, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("STXinwei", Font.PLAIN, 25));

		JButton btnLogin = new JButton("LLogin");
		btnLogin.setBackground(new Color(250, 235, 215));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LLogin frame = new LLogin();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		btnLogin.setBounds(730, 18, 129, 35);
		panel_1_1_1_1.add(btnLogin);
		btnLogin.setFont(new Font("STXinwei", Font.PLAIN, 25));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(250, 235, 215));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LClothingRental frame = new LClothingRental();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(571, 19, 111, 35);
		panel_1_1_1_1.add(btnBack);
		btnBack.setFont(new Font("STXinwei", Font.PLAIN, 25));
		
		emailTextField = new JTextField();
		emailTextField.setBackground(new Color(230, 230, 250));
		emailTextField.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		emailTextField.setColumns(10);
		emailTextField.setBounds(211, 329, 156, 30);
		panel.add(emailTextField);
		
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setForeground(new Color(0, 0, 0));
		lblUserName.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblUserName.setBounds(24, 146, 139, 30);
		panel.add(lblUserName);
		
		UserTextField = new JTextField();
		UserTextField.setBackground(new Color(230, 230, 250));
		UserTextField.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		UserTextField.setColumns(10);
		UserTextField.setBounds(211, 146, 156, 30);
		panel.add(UserTextField);
		
		JLabel lblPassword_1 = new JLabel("Password");
		lblPassword_1.setForeground(new Color(0, 0, 0));
		lblPassword_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblPassword_1.setBounds(24, 205, 139, 30);
		panel.add(lblPassword_1);
		
		PasswordTextField = new JTextField();
		PasswordTextField.setBackground(new Color(230, 230, 250));
		PasswordTextField.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		PasswordTextField.setColumns(10);
		PasswordTextField.setBounds(211, 206, 156, 30);
		panel.add(PasswordTextField);
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password");
		lblConfirmPassword.setForeground(new Color(0, 0, 0));
		lblConfirmPassword.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblConfirmPassword.setBounds(24, 266, 172, 30);
		panel.add(lblConfirmPassword);
		
		confirmTextField = new JTextField();
		confirmTextField.setBackground(new Color(230, 230, 250));
		confirmTextField.setFont(new Font("Sitka Text", Font.PLAIN, 14));
		confirmTextField.setColumns(10);
		confirmTextField.setBounds(211, 267, 156, 30);
		panel.add(confirmTextField);
		
		JLabel lblEmail_1 = new JLabel("Email");
		lblEmail_1.setForeground(new Color(0, 0, 0));
		lblEmail_1.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblEmail_1.setBounds(24, 305, 149, 54);
		panel.add(lblEmail_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(503, 106, 429, 372);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Password", "Email"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lbluserRegis = new JLabel("User registration");
		lbluserRegis.setForeground(new Color(0, 0, 0));
		lbluserRegis.setFont(new Font("Script MT Bold", Font.PLAIN, 35));
		lbluserRegis.setBackground(new Color(204, 204, 255));
		lbluserRegis.setBounds(571, 46, 361, 50);
		panel.add(lbluserRegis);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\regpic.jfif"));
		lblNewLabel.setBounds(10, 10, 955, 548);
		panel.add(lblNewLabel);
	}
}

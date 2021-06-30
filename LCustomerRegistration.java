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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;

public class LCustomerRegistration extends JFrame {

	private JPanel contentPane;
	JTable CustomerTable;
	JTextField name;
	JTextField email;
	JTextField quantityrent;
	JFrame frame;
	private JTextField totalPricetextField;
	private static String FashionModernFee;
	private static String TraditionalCustomsFee;
	private static String DinnerDressFee;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LCustomerRegistration frame = new LCustomerRegistration();
					frame.setVisible(true);
				} catch (Exception arg0) {
					arg0.printStackTrace();
				}
			}
		});
	}
	
	public String getFashionModernFee() {
		return FashionModernFee;
	} 
	
	public String getTraditionalCustomsFee() {
		return TraditionalCustomsFee;
	}
	
	public String getDinnerDressFee() {
		return DinnerDressFee;
	}

	
	public double totalPrice(double registerFee) { //overloading with 1 argument
		double fee=registerFee;
		return fee;
	}
	//calculate price with discount
	public double totalPrice(double registerFee,double discount) { //overloading with 2 argument
		double fee=registerFee;
		
		 fee=fee*(1-discount);
		return fee;
	}


	/**
	 * Create the frame.
	 */
	
	public LCustomerRegistration() {
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 610);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		 
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(null);
		panel.setBounds(10, 10, 1011, 567);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(15, 28, 325, 411);
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 81, 30);
		panel_1.add(lblNewLabel);

		name = new JTextField();
		name.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		name.setBounds(159, 11, 156, 30);
		panel_1.add(name);
		name.setColumns(10);

		JLabel lblcloth = new JLabel("Type of cloth");
		lblcloth.setForeground(new Color(0, 0, 0));
		lblcloth.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblcloth.setBounds(75, 101, 156, 30);
		panel_1.add(lblcloth);

		email = new JTextField();
		email.setBackground(new Color(230, 230, 250));
		email.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		email.setColumns(10);
		email.setBounds(159, 173, 156, 30);
		panel_1.add(email);

		JLabel emailcust = new JLabel("Email");
		emailcust.setForeground(new Color(0, 0, 0));
		emailcust.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		emailcust.setBounds(10, 161, 149, 54);
		panel_1.add(emailcust);

		quantityrent = new JTextField();
		quantityrent.setBackground(new Color(230, 230, 250));
		quantityrent.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		quantityrent.setColumns(10);
		quantityrent.setBounds(75, 255, 156, 30);
		panel_1.add(quantityrent);

		JLabel quantity = new JLabel("Quantity of cloth\r\n");
		quantity.setForeground(new Color(0, 0, 0));
		quantity.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		quantity.setBounds(75, 223, 295, 35);
		panel_1.add(quantity);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(0, 0, 0));
		lblGender.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblGender.setBounds(10, 57, 95, 30);
		panel_1.add(lblGender);

		JComboBox Gender = new JComboBox();
		Gender.setFont(new Font("STXinwei", Font.PLAIN, 16));
		Gender.setModel(new DefaultComboBoxModel(new String[] {"Select", "Female", "Male"}));
		Gender.setBounds(159, 56, 156, 35);
		panel_1.add(Gender);

		JLabel lblDayRegister = new JLabel("Registration Day");
		lblDayRegister.setBackground(new Color(240, 240, 240));
		lblDayRegister.setForeground(new Color(0, 0, 0));
		lblDayRegister.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDayRegister.setBounds(75, 294, 163, 54);
		panel_1.add(lblDayRegister);

		JComboBox registerDay = new JComboBox();
		registerDay.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Weekday", "Weekend"}));
		registerDay.setFont(new Font("STXinwei", Font.PLAIN, 16));
		registerDay.setBounds(64, 340, 192, 35);
		panel_1.add(registerDay);

		JComboBox typecloth = new JComboBox();
		typecloth.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fashion Modern", "Traditional Customs", "Dinner Dress"}));
		typecloth.setFont(new Font("STXinwei", Font.PLAIN, 16));
		typecloth.setBounds(49, 133, 225, 30);
		panel_1.add(typecloth);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBackground(new Color(250, 240, 230));
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\regpic.jfif"));
		lblNewLabel_2.setBounds(0, 0, 335, 411);
		panel_1.add(lblNewLabel_2);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_1_2.setBackground(new Color(250, 240, 230));
		panel_1_2.setBounds(362, 60, 626, 333);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 606, 269);
		panel_1_2.add(scrollPane);

		CustomerTable = new JTable();
		CustomerTable.setFont(new Font("Tahoma", Font.BOLD, 10));
		CustomerTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Name", "Gender",
				"Type of cloth", "Email", "Quantity rent", "Registration Day", "Price (RM)" }));
		CustomerTable.getColumnModel().getColumn(1).setPreferredWidth(65);
	    CustomerTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		CustomerTable.getColumnModel().getColumn(4).setPreferredWidth(81);
		CustomerTable.getColumnModel().getColumn(5).setPreferredWidth(99);
		CustomerTable.getColumnModel().getColumn(5).setMinWidth(18);
		CustomerTable.getColumnModel().getColumn(6).setPreferredWidth(86);
		scrollPane.setViewportView(CustomerTable);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_1_1_1_1.setBackground(new Color(250, 240, 230));
		panel_1_1_1_1.setBounds(34, 449, 942, 70);
		panel.add(panel_1_1_1_1);

		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(250, 235, 215));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				Gender.setSelectedItem("Make a selection!");
				typecloth.setSelectedItem("Make a selection!");
				email.setText("");
				quantityrent.setText("");
				registerDay.setSelectedItem("Select registration day!");
				totalPricetextField.setText("");

			}
		});
		btnReset.setBounds(212, 18, 129, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("STXinwei", Font.PLAIN, 23));

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(250, 235, 215));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
				if (CustomerTable.getSelectedRow() == -1) {
					if (CustomerTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete!", "Customer Registration System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete!", "Customer Registration System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(CustomerTable.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(404, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("STXinwei", Font.PLAIN, 23));

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setBackground(new Color(250, 235, 215));
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LClothingRental frame = new LClothingRental();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Log Out!",
						"Customer Registration System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnLogOut.setBounds(789, 18, 129, 35);
		panel_1_1_1_1.add(btnLogOut);
		btnLogOut.setFont(new Font("STXinwei", Font.PLAIN, 23));
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(250, 235, 215));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
				int i = CustomerTable.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(name.getText(), i, 0);
					model.setValueAt(Gender.getSelectedItem(), i, 1);
					model.setValueAt(typecloth.getSelectedItem(), i, 2);
					model.setValueAt(email.getText(), i, 3);
					model.setValueAt(quantityrent.getText(), i, 4);
					model.setValueAt(registerDay.getSelectedItem(), i, 5);
					

					JOptionPane.showMessageDialog(null, "Update Successfully!");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setFont(new Font("STXinwei", Font.PLAIN, 23));
		btnUpdate.setBounds(609, 18, 129, 35);
		panel_1_1_1_1.add(btnUpdate);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.setBackground(new Color(250, 235, 215));
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try { //2.2 Exception Handling
					File file = new File("C:\\Users\\Lenovo\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Desktop\\PROG2\\CustomerList.txt");
					if (!file.exists()) {	//2.3 File IO
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(
							"\n__________________________________________________________________________________________________________________________________\n");
					for (int i = 0; i < CustomerTable.getRowCount(); i++) {
						for (int j = 0; j < CustomerTable.getColumnCount(); j++) {
							bw.write(CustomerTable.getModel().getValueAt(i, j) + "		|");
						}
						bw.write(
								"\n__________________________________________________________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported!");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("STXinwei", Font.PLAIN, 23));
		btnUpload.setBounds(140, 289, 129, 35);
		panel_1_2.add(btnUpload);
				JButton btnAddRecord = new JButton("Apply");
				btnAddRecord.setBackground(new Color(250, 235, 215));
				btnAddRecord.setBounds(31, 18, 129, 35);
				panel_1_1_1_1.add(btnAddRecord);
				btnAddRecord.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int quantityRent;
						double answer;
						double registrationFee = 0;
						if (typecloth.getSelectedItem().equals("Fashion Modern")) {
						registrationFee = totalPrice(95);
						}
						if (typecloth.getSelectedItem().equals("Traditional Customs")) {
							registrationFee = totalPrice(90);
							}
						if (typecloth.getSelectedItem().equals("Dinner Dress")) {
							registrationFee = totalPrice(85);
							}
						quantityRent = Integer.parseInt(quantityrent.getText());
						 if (registerDay.getSelectedItem().equals("Weekend")) {
							 
							 LDiscount ds=new WeekendDiscountRate();
							registrationFee = totalPrice(registrationFee,ds.discountRate());

						}
						answer = quantityRent * registrationFee;
						String price = Double. toString(answer);
						DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
						model.addRow(new Object[] { name.getText(), Gender.getSelectedItem(), typecloth.getSelectedItem(),
								email.getText(), quantityrent.getText(), registerDay.getSelectedItem(), price,

						});

					}
				});
				btnAddRecord.setFont(new Font("STXinwei", Font.PLAIN, 23));
		JButton btnPrint = new JButton("Print");
		btnPrint.setBackground(new Color(250, 235, 215));
		btnPrint.setBounds(376, 289, 129, 35);
		panel_1_2.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CustomerTable.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("STXinwei", Font.PLAIN, 23));
		
		JLabel lblNewLabel_1 = new JLabel("Customer Registration");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(new Color(204, 204, 255));
		lblNewLabel_1.setBounds(578, 10, 384, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\kualalumpurpic.jfif"));
		lblNewLabel_4.setBounds(490, 0, 442, 64);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBackground(new Color(250, 240, 230));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\clothpic.jpeg"));
		lblNewLabel_3.setBounds(-11, 0, 1022, 567);
		panel.add(lblNewLabel_3);
		
	}
	
	public LCustomerRegistration(String FashionModernFee,String TraditionalCustomsFee,String DinnerDressFee) {
		LCustomerRegistration.FashionModernFee = FashionModernFee;
		LCustomerRegistration.TraditionalCustomsFee = TraditionalCustomsFee;
		LCustomerRegistration.DinnerDressFee = DinnerDressFee;
		
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1023, 625);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(null);
		panel.setBounds(10, 10, 1011, 567);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1.setBackground(new Color(204, 204, 255));
		panel_1.setBounds(15, 28, 325, 411);
		panel.add(panel_1);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 81, 30);
		panel_1.add(lblNewLabel);

		name = new JTextField();
		name.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		name.setBounds(159, 11, 156, 30);
		panel_1.add(name);
		name.setColumns(10);

		JLabel lbltypecloth = new JLabel("Type of cloth");
		lbltypecloth.setForeground(new Color(255, 255, 255));
		lbltypecloth.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lbltypecloth.setBounds(75, 101, 156, 30);
		panel_1.add(lbltypecloth);

		email = new JTextField();
		email.setFont(new Font("Sitka Text", Font.PLAIN, 24));
		email.setColumns(10);
		email.setBounds(159, 173, 156, 30);
		panel_1.add(email);

		JLabel lblemailcust = new JLabel("Email");
		lblemailcust.setForeground(new Color(255, 255, 255));
		lblemailcust.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblemailcust.setBounds(10, 161, 149, 54);
		panel_1.add(lblemailcust);

		quantityrent = new JTextField();
		quantityrent.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		quantityrent.setColumns(10);
		quantityrent.setBounds(75, 255, 156, 30);
		panel_1.add(quantityrent);

		JLabel lblquantityrent = new JLabel("Quantity of cloth rent");
		lblquantityrent.setForeground(new Color(255, 255, 255));
		lblquantityrent.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblquantityrent.setBounds(10, 223, 295, 35);
		panel_1.add(lblquantityrent);

		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(new Color(255, 255, 255));
		lblGender.setFont(new Font("Sitka Text", Font.PLAIN, 20));
		lblGender.setBounds(10, 57, 95, 30);
		panel_1.add(lblGender);

		JComboBox Gender = new JComboBox();
		Gender.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		Gender.setModel(new DefaultComboBoxModel(new String[] { "Select", "Female", "Male" }));
		Gender.setBounds(159, 56, 156, 35);
		panel_1.add(Gender);

		JLabel lblDayRegister = new JLabel("Registration Day");
		lblDayRegister.setForeground(new Color(255, 255, 255));
		lblDayRegister.setFont(new Font("Sitka Text", Font.PLAIN, 19));
		lblDayRegister.setBounds(75, 294, 163, 54);
		panel_1.add(lblDayRegister);

		JComboBox registerDay = new JComboBox();
		registerDay.setModel(new DefaultComboBoxModel(
				new String[] { "Select", "Weekday", "Weekend" }));
		registerDay.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		registerDay.setBounds(64, 340, 192, 35);
		panel_1.add(registerDay);

		JComboBox typecloth = new JComboBox();
		typecloth.setModel(new DefaultComboBoxModel(new String[] { "Select", "Fashion Modern",
				"Traditional Customs", "Dinner Dress" }));
		typecloth.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		typecloth.setBounds(49, 133, 225, 30);
		panel_1.add(typecloth);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\regpic.jfif"));
		lblNewLabel_2.setBounds(0, 0, 335, 411);
		panel_1.add(lblNewLabel_2);

		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_2.setBackground(new Color(204, 204, 255));
		panel_1_2.setBounds(362, 60, 626, 333);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 606, 269);
		panel_1_2.add(scrollPane);

		CustomerTable = new JTable();
		CustomerTable.setFont(new Font("Tahoma", Font.BOLD, 10));
		CustomerTable.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Name", "Gender",
				"Type of cloth", "Email", "Quantity of cloth", "Registration Day", "Price (RM)" }));
		CustomerTable.getColumnModel().getColumn(1).setPreferredWidth(65);
		CustomerTable.getColumnModel().getColumn(2).setPreferredWidth(82);
		CustomerTable.getColumnModel().getColumn(4).setPreferredWidth(81);
		CustomerTable.getColumnModel().getColumn(5).setPreferredWidth(99);
		CustomerTable.getColumnModel().getColumn(5).setMinWidth(18);
		CustomerTable.getColumnModel().getColumn(6).setPreferredWidth(86);
		scrollPane.setViewportView(CustomerTable);

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) Color.MAGENTA));
		panel_1_1_1_1.setBackground(new Color(204, 204, 255));
		panel_1_1_1_1.setBounds(34, 449, 942, 70);
		panel.add(panel_1_1_1_1);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name.setText("");
				Gender.setSelectedItem("Make a selection");
				typecloth.setSelectedItem("Make a selection");
				email.setText("");
				quantityrent.setText("");
				registerDay.setSelectedItem("Select registration day");
				totalPricetextField.setText("");

			}
		});
		btnReset.setBounds(212, 18, 129, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
				if (CustomerTable.getSelectedRow() == -1) {
					if (CustomerTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete!", "Customer Registration System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Customer Registration System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(CustomerTable.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(404, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LClothingRental frame = new LClothingRental();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Log Out!",
						"Customer Registration System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btnLogOut.setBounds(789, 18, 129, 35);
		panel_1_1_1_1.add(btnLogOut);
		btnLogOut.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
				int i = CustomerTable.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(name.getText(), i, 0);
					model.setValueAt(Gender.getSelectedItem(), i, 1);
					model.setValueAt(typecloth.getSelectedItem(), i, 2);
					model.setValueAt(email.getText(), i, 3);
					model.setValueAt(quantityrent.getText(), i, 4);
					model.setValueAt(registerDay.getSelectedItem(), i, 5);
					

					JOptionPane.showMessageDialog(null, "Update Successfully!");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnUpdate.setBounds(609, 18, 129, 35);
		panel_1_1_1_1.add(btnUpdate);
		
		JButton btnUpload = new JButton("Upload");
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					File file = new File("C:\\Users\\Lenovo\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Desktop\\PROG2\\CustomerList.txt");
					if (!file.exists()) {
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					
					bw.write(
							"\n__________________________________________________________________________________________________________________________________\n");
					for (int i = 0; i < CustomerTable.getRowCount(); i++) {
						for (int j = 0; j < CustomerTable.getColumnCount(); j++) {
							bw.write(CustomerTable.getModel().getValueAt(i, j) + "		|");
						}
						bw.write(
								"\n__________________________________________________________________________________________________________________________________\n");
					}
					bw.close();
					fw.close();
					JOptionPane.showMessageDialog(null, "Data Exported!");
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnUpload.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnUpload.setBounds(140, 289, 129, 35);
		panel_1_2.add(btnUpload);
				JButton btnAddRecord = new JButton("Apply");
				btnAddRecord.setBounds(31, 18, 129, 35);
				panel_1_1_1_1.add(btnAddRecord);
				btnAddRecord.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int quantityRent;
						double answer;
						double registrationFee = 0;
						if (typecloth.getSelectedItem().equals("Fashion Modern)")) {
						registrationFee = Double.parseDouble(getFashionModernFee());
						}
						if (typecloth.getSelectedItem().equals("Traditional Customs")) {
							registrationFee = Double.parseDouble(getTraditionalCustomsFee());
							}
						if (typecloth.getSelectedItem().equals("Dinner Dress")) {
							registrationFee =  Double.parseDouble(getDinnerDressFee());
							}
						quantityRent = Integer.parseInt(quantityrent.getText());
						 if (registerDay.getSelectedItem().equals("Weekend")) {
							 
							 LDiscount ds=new WeekendDiscountRate();
							registrationFee = registrationFee*(1-ds.discountRate());

						}
						answer = quantityRent * registrationFee;
						String price = Double. toString(answer);
						DefaultTableModel model = (DefaultTableModel) CustomerTable.getModel();
						model.addRow(new Object[] { name.getText(), Gender.getSelectedItem(), typecloth.getSelectedItem(),
								email.getText(), quantityrent.getText(), registerDay.getSelectedItem(), price,

						});

					}
				});
				btnAddRecord.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(376, 289, 129, 35);
		panel_1_2.add(btnPrint);
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					CustomerTable.print();
				} catch (java.awt.print.PrinterException e) {
					System.err.format("No printer found!", e.getMessage());
				}
			}
		});
		btnPrint.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("Customer Registration");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(new Color(204, 204, 255));
		lblNewLabel_1.setBounds(535, 0, 384, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\kualalumpurpic.jfif"));
		lblNewLabel_4.setBounds(490, -46, 442, 110);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\clothpic.jpeg"));
		lblNewLabel_3.setBounds(0, 0, 1001, 557);
		panel.add(lblNewLabel_3);
		
		
	}
}

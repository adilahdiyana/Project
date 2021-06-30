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
import javax.swing.ImageIcon;


public class LFinance extends JFrame {

	private JPanel contentPane;
	private JTable FinanceTable;
	private JTable model;
	private JTextField QweekdaysTextField;
	private JFrame frame;
	private JTextField QWeekendTextField;
	private JTextField PriceTextField;
	private JTextField FeesTextField;
	private JTextField totalEmpSalarytextField;
	private double netProfit= 0;
	private JTextField textField;
	private JTextField textField_1;
	private String totalEmSalary,prize;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LEmployee frame = new LEmployee();
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
	
	public LFinance(String s) {
		this.totalEmSalary=s;
		
		setTitle("Clothing Rental Bussiness");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1027, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel.setBounds(0, 0, 1007, 543);
		contentPane.add(panel);
		panel.setLayout(null);
		
				
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(21, 10, 421, 398);
		panel.add(panel_1);

		JLabel lblPQuantityWeekday = new JLabel("Quantity of customer registration in weekdays for rent");
		lblPQuantityWeekday.setForeground(new Color(0, 0, 0));
		lblPQuantityWeekday.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblPQuantityWeekday.setBounds(10, 72, 401, 30);
		panel_1.add(lblPQuantityWeekday);

		QweekdaysTextField = new JTextField();
		QweekdaysTextField.setBackground(new Color(230, 230, 250));
		QweekdaysTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		QweekdaysTextField.setBounds(113, 96, 156, 30);
		panel_1.add(QweekdaysTextField);
		QweekdaysTextField.setColumns(10);
		
		JLabel lblQuantityOfRegistration = new JLabel("Quantity of customer registration in weekend for rent");
		lblQuantityOfRegistration.setForeground(new Color(0, 0, 0));
		lblQuantityOfRegistration.setFont(new Font("Sitka Text", Font.PLAIN, 15));
		lblQuantityOfRegistration.setBounds(10, 136, 401, 30);
		panel_1.add(lblQuantityOfRegistration);
		
		QWeekendTextField = new JTextField();
		QWeekendTextField.setBackground(new Color(230, 230, 250));
		QWeekendTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		QWeekendTextField.setColumns(10);
		QWeekendTextField.setBounds(113, 161, 156, 30);
		panel_1.add(QWeekendTextField);
		
		JLabel lblPriceAmount = new JLabel("Price amount (RM)");
		lblPriceAmount.setForeground(new Color(0, 0, 0));
		lblPriceAmount.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblPriceAmount.setBounds(20, 211, 150, 30);
		panel_1.add(lblPriceAmount);
		
		PriceTextField = new JTextField();
		PriceTextField.setBackground(new Color(230, 230, 250));
		PriceTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		PriceTextField.setColumns(10);
		PriceTextField.setBounds(255, 210, 156, 30);
		panel_1.add(PriceTextField);
		
		JLabel lblExpenses = new JLabel("Total Expenses (RM)");
		lblExpenses.setForeground(new Color(0, 0, 0));
		lblExpenses.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblExpenses.setBounds(20, 256, 225, 30);
		panel_1.add(lblExpenses);
		
		FeesTextField = new JTextField();
		FeesTextField.setBackground(new Color(230, 230, 250));
		FeesTextField.setFont(new Font("Sitka Text", Font.PLAIN, 22));
		FeesTextField.setColumns(10);
		FeesTextField.setBounds(255, 255, 156, 30);
		panel_1.add(FeesTextField);
		
		totalEmpSalarytextField = new JTextField();
		totalEmpSalarytextField.setBackground(new Color(230, 230, 250));
		totalEmpSalarytextField.setFont(new Font("Sitka Banner", Font.PLAIN, 22));
		totalEmpSalarytextField.setColumns(10);
		totalEmpSalarytextField.setBounds(255, 300, 156, 30);
		totalEmpSalarytextField.setText("<dynamic>");
		panel_1.add(totalEmpSalarytextField);
		
		JLabel lblEmployeeSalary = new JLabel("Total LEmployee Salary (RM)");
		lblEmployeeSalary.setForeground(new Color(0, 0, 0));
		lblEmployeeSalary.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		lblEmployeeSalary.setBounds(20, 301, 229, 30);
		panel_1.add(lblEmployeeSalary);
		
		JButton btnNetProfit = new JButton("Calculate Net Profit (RM)");
		btnNetProfit.setBackground(new Color(250, 235, 215));
		btnNetProfit.setBounds(10, 347, 243, 41);
		panel_1.add(btnNetProfit);
		btnNetProfit.setFont(new Font("STXinwei", Font.PLAIN, 19));
		
		JLabel lblEventCat = new JLabel("Type of Cloth");
		lblEventCat.setForeground(new Color(0, 0, 0));
		lblEventCat.setBounds(20, 32, 150, 30);
		panel_1.add(lblEventCat);
		lblEventCat.setFont(new Font("Sitka Text", Font.PLAIN, 17));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(250, 235, 215));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fashion Modern", "Traditional Customs", "Dinner Dress"}));
		comboBox.setBounds(146, 32, 172, 24);
		panel_1.add(comboBox);
		
		
	
			
		btnNetProfit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				
			    // iterate over all columns
			    for (int i = 0 ; i < model.getRowCount() ; i++) {
			        // null or not Integer will throw exception
			        String s = String.valueOf(model.getValueAt(i, 8));
			        
			        netProfit += Double.parseDouble(s);
			    }
			    textField_1 = new JTextField();
				textField_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
				textField_1.setEditable(false);
				textField_1.setBounds(223, 355, 162, 30);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
				String output=String.valueOf(netProfit);
				textField_1.setText(output);
			}
			});
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(139, 0, 0)));
		panel_1_2.setBackground(new Color(250, 240, 230));
		panel_1_2.setBounds(452, 105, 549, 340);
		panel.add(panel_1_2);
		panel_1_2.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 529, 269);
		panel_1_2.add(scrollPane);

		FinanceTable = new JTable();
		FinanceTable.setFont(new Font("Tahoma", Font.BOLD, 10));
		FinanceTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Type of cloth", "Quantity Weekdays", "Quantity Weekend", "Price amount", "Expenses", "Total Salary", "Cost", "Earning", "Profit"
			}
		));
		FinanceTable.getColumnModel().getColumn(0).setPreferredWidth(131);
		FinanceTable.getColumnModel().getColumn(1).setPreferredWidth(102);
		FinanceTable.getColumnModel().getColumn(2).setPreferredWidth(98);
		FinanceTable.getColumnModel().getColumn(3).setPreferredWidth(82);
		FinanceTable.getColumnModel().getColumn(4).setPreferredWidth(54);
		FinanceTable.getColumnModel().getColumn(5).setPreferredWidth(81);
		FinanceTable.getColumnModel().getColumn(6).setPreferredWidth(57);
		FinanceTable.getColumnModel().getColumn(7).setMinWidth(18);
		scrollPane.setViewportView(FinanceTable);
		
	

		JButton btnUpload = new JButton("Upload");
		btnUpload.setBackground(new Color(250, 235, 215));
		btnUpload.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {//2.2 Exception Handling
					File file = new File("C:\\Users\\Lenovo\\OneDrive - UNIVERSITY UTARA MALAYSIA\\Desktop\\PROG2\\LFinance.txt");
					if (!file.exists()) {	//2.3 File IO
						file.createNewFile();
					}
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
				
					bw.write(
							"\n__________________________________________________________________________________________________________________________________\n");
					for (int i = 0; i < FinanceTable.getRowCount(); i++) {
						for (int j = 0; j < FinanceTable.getColumnCount(); j++) {
							bw.write(FinanceTable.getModel().getValueAt(i, j) + "		|");
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
		
				JButton btnPrint = new JButton("Print");
				btnPrint.setBackground(new Color(250, 235, 215));
				btnPrint.setBounds(336, 289, 129, 35);
				panel_1_2.add(btnPrint);
				btnPrint.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						try {//2.2 Exception Handling
							FinanceTable.print();
						} catch (java.awt.print.PrinterException e) {
							System.err.format("No printer found!", e.getMessage());
						}
					}
				});
				btnPrint.setFont(new Font("STXinwei", Font.PLAIN, 23));

		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setLayout(null);
		panel_1_1_1_1.setBorder(new MatteBorder(5, 5, 5, 5, (Color) new Color(128, 0, 0)));
		panel_1_1_1_1.setBackground(new Color(250, 240, 230));
		panel_1_1_1_1.setBounds(21, 456, 957, 70);
		panel.add(panel_1_1_1_1);

		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.setBackground(new Color(250, 235, 215));
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				double registerFee = 0;
				 LDiscount dd=new WeekendDiscountRate();
				LCustomerRegistration pr=new LCustomerRegistration();
				
				if(comboBox.getSelectedItem().equals("Fashion Modern")) 
					if (pr.getFashionModernFee()==null) {
						registerFee=15;
					}
					else {registerFee=Double.parseDouble(pr.getFashionModernFee());
				}
					
					if(comboBox.getSelectedItem().equals("Traditional Customs")) 
					if (pr.getTraditionalCustomsFee()==null) {
						registerFee=10;
					}
					else {registerFee=Double.parseDouble(pr.getTraditionalCustomsFee());
					}
				
				 if(comboBox.getSelectedItem().equals("Dinner Dress")) 
					if (pr.getDinnerDressFee()==null) {
						registerFee=5;
					}else {registerFee=Double.parseDouble(pr.getDinnerDressFee());
					}
				
				int customerWd= Integer.parseInt(QweekdaysTextField.getText());
				int customertWk= Integer.parseInt(QWeekendTextField.getText());
				
				double answerEarn=(customerWd*registerFee)+(customertWk*(registerFee*(1-dd.discountRate())));
				String earning=Double.toString(answerEarn);
				
				double price= Integer.parseInt(PriceTextField.getText());
				double fee= Integer.parseInt(FeesTextField.getText());
				double totalEmpSalary= Double.parseDouble(totalEmpSalarytextField.getText());
				String totalSalary = Double.toString(totalEmpSalary);
				double answerCost= price+fee+totalEmpSalary;
				String cost=Double.toString(answerCost);
				
				double answerProfit= answerEarn-answerCost;
				String profit= Double.toString(answerProfit);
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				model.addRow(new Object[] { comboBox.getSelectedItem(),QweekdaysTextField.getText(),QWeekendTextField.getText(), PriceTextField.getText(), FeesTextField.getText(),
						totalSalary,cost,earning,profit,

				});
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnAddRecord.setBounds(10, 18, 171, 35);
		panel_1_1_1_1.add(btnAddRecord);
		btnAddRecord.setFont(new Font("STXinwei", Font.PLAIN, 22));

		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(250, 235, 215));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setSelectedItem("Select type of cloth!");
				QweekdaysTextField.setText("");
				QWeekendTextField.setText("");
				PriceTextField.setText("");
				FeesTextField.setText("");
				
				
			}
		});
		btnReset.setBounds(362, 18, 108, 35);
		panel_1_1_1_1.add(btnReset);
		btnReset.setFont(new Font("STXinwei", Font.PLAIN, 23));

		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(250, 235, 215));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				if (FinanceTable.getSelectedRow() == -1) {
					if (FinanceTable.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No data to delete!", "Customer Registration System",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "Select a row to delete!", "Customer Registration System",
								JOptionPane.OK_OPTION);
					}
				} else {
					model.removeRow(FinanceTable.getSelectedRow());
				}
			}
		});
		btnDelete.setBounds(501, 18, 129, 35);
		panel_1_1_1_1.add(btnDelete);
		btnDelete.setFont(new Font("STXinwei", Font.PLAIN, 23));

		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 235, 215));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit!",
						"Colthing Rental Business", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(818, 18, 129, 35);
		panel_1_1_1_1.add(btnExit);
		btnExit.setFont(new Font("STXinwei", Font.PLAIN, 23));

		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(new Color(250, 235, 215));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel) FinanceTable.getModel();
				int i = FinanceTable.getSelectedRow();
				if (i >= 0) // if single row is selected than update
				{
					model.setValueAt(comboBox.getSelectedItem(), i, 0);
					model.setValueAt(QweekdaysTextField.getText(), i, 1);
					model.setValueAt(QWeekendTextField.getText(), i, 2);
					model.setValueAt(PriceTextField.getText(), i, 3);
					model.setValueAt(FeesTextField.getText(), i, 4);
					model.setValueAt(totalEmpSalarytextField.getText(), i, 5);
					
					JOptionPane.showMessageDialog(null, "Update Successfully!");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First!");
				}
			}
		});
		btnUpdate.setBounds(207, 18, 133, 35);
		panel_1_1_1_1.add(btnUpdate);
		btnUpdate.setFont(new Font("STXinwei", Font.PLAIN, 23));
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(250, 235, 215));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LEmployee frame = new LEmployee();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnBack.setFont(new Font("STXinwei", Font.PLAIN, 23));
		btnBack.setBounds(658, 18, 129, 35);
		panel_1_1_1_1.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("LFinance Information");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Script MT Bold", Font.PLAIN, 35));
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(576, 45, 361, 50);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(250, 240, 230));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\financepic.jfif"));
		lblNewLabel.setBounds(0, 0, 1017, 526);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(21, 10, 421, 398);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\clothpic.jpeg"));
		
		
		
		
		
	}
}

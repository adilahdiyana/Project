package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.AncestorListener;

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
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class LClothUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFee;
	private String discount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LClothUpdate frame = new LClothUpdate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LClothUpdate() {
		LClothDetail d = new LClothDetail();
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 570); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(128, 0, 0)));
		panel.setBounds(0, 0, 985, 530);
		contentPane.add(panel);
		panel.setLayout(null);

		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 192, 203));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select ", "Fashion Modern", "Traditional Customs", "Dinner Dress"}));
		comboBox.setBounds(555, 206, 313, 29);
		panel.add(comboBox);

		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane.setBounds(532, 245, 428, 215);
		panel.add(textPane);

		JLabel clothupdate = new JLabel("Update Cloth Info :");
		clothupdate.setForeground(new Color(0, 0, 0));
		clothupdate.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		clothupdate.setBounds(363, 205, 180, 29);
		panel.add(clothupdate);

		JButton clothdetail = new JButton("Cloth Detail");
		clothdetail.setBackground(new Color(250, 235, 215));
		clothdetail.setFont(new Font("STXinwei", Font.BOLD, 17));
		clothdetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				d.setVisible(true);

			}
		});
		clothdetail.setBounds(679, 479, 140, 29);
		panel.add(clothdetail);

		JButton btnpass = new JButton("UPDATE");
		btnpass.setBackground(new Color(250, 235, 215));
		btnpass.setFont(new Font("STXinwei", Font.BOLD, 17));
		btnpass.setBounds(542, 479, 119, 29);
		panel.add(btnpass);

		textFieldFee = new JTextField();
		textFieldFee.setBackground(new Color(230, 230, 250));
		textFieldFee.setColumns(10);
		textFieldFee.setBounds(293, 266, 140, 29);
		panel.add(textFieldFee);

		JLabel lblUpdateFee = new JLabel("Update Registration Fee (RM) :");
		lblUpdateFee.setForeground(Color.WHITE);
		lblUpdateFee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblUpdateFee.setBounds(34, 264, 251, 29);
		panel.add(lblUpdateFee);

		JLabel lblOriginalRegistrationFee = new JLabel("Original Registration Fee : ");
		lblOriginalRegistrationFee.setForeground(Color.WHITE);
		lblOriginalRegistrationFee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOriginalRegistrationFee.setBounds(34, 322, 231, 48);
		panel.add(lblOriginalRegistrationFee);

		JLabel lblOriginalRegistrationFeeFM = new JLabel("Fashion Modern : RM15");
		lblOriginalRegistrationFeeFM.setForeground(new Color(0, 0, 0));
		lblOriginalRegistrationFeeFM.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOriginalRegistrationFeeFM.setBounds(330, 322, 231, 48);
		panel.add(lblOriginalRegistrationFeeFM);

		JLabel lblOriginalRegistrationFeeTC = new JLabel("Traditional Customs RM10");
		lblOriginalRegistrationFeeTC.setForeground(new Color(0, 0, 0));
		lblOriginalRegistrationFeeTC.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOriginalRegistrationFeeTC.setBounds(330, 380, 231, 48);
		panel.add(lblOriginalRegistrationFeeTC);

		JLabel lblOriginalRegistrationFeeDD = new JLabel("Dinner Dress RM5");
		lblOriginalRegistrationFeeDD.setForeground(new Color(0, 0, 0));
		lblOriginalRegistrationFeeDD.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOriginalRegistrationFeeDD.setBounds(330, 438, 231, 48);
		panel.add(lblOriginalRegistrationFeeDD);

		JButton back = new JButton("BACK");
		back.setBackground(new Color(250, 235, 215));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LAdminCompany frame = new LAdminCompany();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				dispose();
			}
		});
		back.setFont(new Font("STXinwei", Font.BOLD, 17));
		back.setBounds(847, 479, 113, 29);
		panel.add(back);

		JLabel ClothUpdate = new JLabel("Cloth Information Update");
		ClothUpdate.setForeground(Color.WHITE);
		ClothUpdate.setFont(new Font("Script MT Bold", Font.PLAIN, 30));
		ClothUpdate.setBackground(new Color(204, 204, 255));
		ClothUpdate.setBounds(596, 59, 512, 51);
		panel.add(ClothUpdate);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\clothpic.jpeg"));
		lblNewLabel_1.setBounds(10, 10, 965, 510);
		panel.add(lblNewLabel_1);

		btnpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
					if (comboBox.getSelectedItem().equals("Fashion Modern")) {
						d.setFashionModernDetail(textPane.getText());
						d.setFashionModernFee(textFieldFee.getText());

					} else if (comboBox.getSelectedItem().equals("Traditional Customs")) {
						d.setTraditionalCustomsDetail(textPane.getText());
						d.setDinnerDressFee(textFieldFee.getText());

					} else if (comboBox.getSelectedItem().equals("Dinner Dress")) {
						d.setDinnerDressDetail(textPane.getText());
						d.setDinnerDressFee(textFieldFee.getText());

					}
					JOptionPane.showMessageDialog(null, "Update Succesful!");

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
					if (comboBox.getSelectedItem().equals("Fashion Modern")) {
						textPane.setText(
								"\n1. Stock for rent are very limited "
										+ "and the size also very limited for adult."
										+ "\n2. Available size for kids and adults."
										+ "\n3. Cloth for ladies and gentlemen."
										+ "\n4. All size are available (S/M/L/XL/XXL/XXXL)."
										+ "\n5. Fee of registration for rent is RM15."
										+ "\n=====================================================================");

					} else if (comboBox.getSelectedItem().equals("Traditional Customs")) {
						textPane.setText(
								"\n1. Stock for rent are very limited "
										+ "which is for both ladies and gentlemen."
										+ "\n2. Size are very limited because each size have only one cloth."
										+ "\n3. Available for kids and adults!"
										+ "\n4. All size still available "
										+ "and next month we will restock new cloth for rent."
										+ "\n5. Fee of registration for rent is RM10."
										+ "\n=====================================================================");

					} else if (comboBox.getSelectedItem().equals("Dinner Dress")) {
						textPane.setText("\n1. Each cloth are very limited for rent"
								+ " especially for gentlemen."
								+ "\n2. We have many stocks of cloth for each size to rent."
								+ "\n3. Available for kids and adults "
								+ "or you can rent both for your family event."
								+ "\n4. All size available and we also have free size."
								+ "\n5. Fee of registration for rent is RM5."
								+ "\n=====================================================================");

					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		});

	}
}

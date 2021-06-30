package Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.event.AncestorListener;

import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class LClothDetail extends JFrame {
	private String FashionModernDetail, TraditionalCustomsDetail, DinnerDressDetail;
	private String FashionModernFee, TraditionalCustomsFee, DinnerDressFee;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LClothDetail frame = new LClothDetail();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void setFashionModernDetail(String fmd) {
		FashionModernDetail = fmd;
	}
	
	public void setTraditionalCustomsDetail(String tcd) {
		TraditionalCustomsDetail = tcd;
	}
	public void setDinnerDressDetail(String ddd) {
		DinnerDressDetail = ddd;
	}

	public String getFashionModernDetail() {
		return FashionModernDetail;
	} 
	
	public String getTraditionalCustomsDetail() {
		return TraditionalCustomsDetail;
	}
	
	
	public String getDinnerDressDetail() {
		return DinnerDressDetail;
	}
	
	public void setFashionModernFee(String fmf) {
		FashionModernFee= fmf;
	}
	
	public void setTraditionalCustomsFee(String tcf) {
		TraditionalCustomsFee= tcf;
	}
	public void setDinnerDressFee(String ddf) {
		DinnerDressFee=ddf;
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
	
	
	/**
	 * Create the frame.
	 */
	public LClothDetail() {
		
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 593); // set for 0,0,1400,800
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

		
		JButton custRegistration = new JButton("LLogin to Rent Now!");
		custRegistration.setBackground(new Color(250, 235, 215));
		custRegistration.setBounds(50, 470, 223, 47);
		custRegistration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				LLogin par = new LLogin(getFashionModernFee(),getTraditionalCustomsFee(),getDinnerDressFee()); // calling another frame/window
				par.setModalExclusionType(null);
				par.setVisible(true);
				 dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			}
		});

		custRegistration.setFont(new Font("STXinwei", Font.BOLD, 20));
		panel.add(custRegistration);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(139, 0, 0)));
		panel_1.setBackground(new Color(250, 240, 230));
		panel_1.setBounds(329, 83, 477, 53);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblFee = new JLabel("Contact : 011-56815181");
		lblFee.setBounds(32, 65, 503, 43);
		lblFee.setFont(new Font("Sylfaen", Font.PLAIN, 25));
		panel_1.add(lblFee);

		JLabel lblCategory = new JLabel("Cloth Details");
		lblCategory.setForeground(Color.BLACK);
		lblCategory.setBackground(Color.LIGHT_GRAY);
		lblCategory.setBounds(120, 10, 503, 33);
		panel_1.add(lblCategory);
		lblCategory.setFont(new Font("NSimSun", Font.BOLD, 25));

		
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(128, 0, 0)));
		panel_1_1_2.setBackground(new Color(250, 240, 230));
		panel_1_1_2.setBounds(197, 22, 758, 53);
		panel.add(panel_1_1_2);

		JLabel titlename = new JLabel("Clothing Rental Business");
		titlename.setForeground(Color.BLACK);
		titlename.setBackground(new Color(204, 204, 255));
		titlename.setFont(new Font("Papyrus", Font.BOLD, 25));
		titlename.setBounds(174, 10, 726, 33);
		panel_1_1_2.add(titlename);


		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(250, 235, 215));
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Fashion Modern", "Traditional Customs", "Dinner Dress"}));
		comboBox.setBounds(37, 203, 202, 29);
		panel.add(comboBox);

		JTextPane textPane = new JTextPane();
		textPane.setBackground(new Color(250, 235, 215));
		textPane.setFont(new Font("Times New Roman", Font.BOLD, 12));
		textPane.setBounds(23, 245, 290, 215);
		panel.add(textPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(655, 245, 223, 231);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(250, 240, 230));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\clothpic.jpeg"));
		lblNewLabel_1.setBounds(10, 10, 965, 510);
		panel.add(lblNewLabel_1);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { // 2.2 Exception Handling
				if (comboBox.getSelectedItem().equals("Fashion Modern")) {
					if (getFashionModernDetail()==null) {
						textPane.setText("====================================================================="
								+ "\n Registration fee= RM 15.00"
								+ "\n====================================================================="
								+"\n1. Stock for rent are very limited "
								+ "and the size also very limited for adult."
								+ "\n2. Available size for kids and adults."
								+ "\n3. Cloth for ladies and gentlemen.!"
								+ "\n4. All size are available (S/M/L/XL/XXL/XXXL)."
								+ "\n5. Very suitable!."
								+ "\n=====================================================================");
					}
					else {textPane.setText("====================================================================="
							+ "\n Registration fee= RM "+getFashionModernFee()
							+ "\n====================================================================="
							+getFashionModernDetail());
					
					}
					lblNewLabel_2.setIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\clothpic.jpeg"));
				} else if (comboBox.getSelectedItem().equals("TraditionalCustoms")) {
					if (getTraditionalCustomsDetail()==null) {
					textPane.setText("====================================================================="
							+ "\n Registration fee= RM10.00 "
							+ "\n====================================================================="
							+ "\n1. Stock for rent are very limited  "
							+ "in which is for both ladies and gentlemen."
							+ "\n2. Size are very limited because each size have only one cloth."
							+ "\n3. Available for kids and adults!"
							+ "\n4. All size still available  "
							+ "and next month we will restock new cloth for rent."
							+ "\n5. Very suitable for all!"
							+ "\n=====================================================================");
					}
					else {textPane.setText("====================================================================="
							+ "\n Registration fee= RM "+getTraditionalCustomsFee()
							+ "\n====================================================================="
							+getTraditionalCustomsDetail());
					
					}
					lblNewLabel_2.setIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\clothpic.jpeg"));

				} else if (comboBox.getSelectedItem().equals("Dinner Dress")) {
					if (getDinnerDressDetail()==null) {
					textPane.setText("====================================================================="
							+ "\n Registration fee= RM5.00 "
							+ "\n====================================================================="
							+ "\n1. Each cloth are very limited for rent"
							+ " especially for gentlemen."
							+ "\n2. We have many stocks of cloth for each size to rent."
							+ "\n3. Available for kids and adults "
							+ "or  you can rent both for your family event."
							+ "\n4. All size available and we also have free size."
							+ "\n5. Very suitable!"
							+ "\n=====================================================================");
					}
					else {textPane.setText("====================================================================="
							+ "\n Registration fee= RM "+getDinnerDressFee()
							+ "\n====================================================================="
							+getDinnerDressDetail());
					
					}
					lblNewLabel_2.setIcon(new ImageIcon("C:\\\\Users\\\\Lenovo\\\\Downloads\\\\clothpic.jpeg"));
				}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});

	}
}

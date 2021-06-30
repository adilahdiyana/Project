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
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class LSales extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LSales frame = new LSales();
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
	public LSales() {
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1009, 574); // set for 0,0,1400,800
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		LDiscount d= new WeekendDiscountRate();
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
		panel.setForeground(Color.WHITE);
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(null);
		panel.setBounds(0, 0, 985, 516);
		contentPane.add(panel);
		panel.setLayout(null);

		JPanel panel_1_1_1_2_1 = new JPanel();
		panel_1_1_1_2_1.setForeground(Color.WHITE);
		panel_1_1_1_2_1.setBounds(763, 301, 199, 194);
		panel_1_1_1_2_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel_1_1_1_2_1.setBackground(Color.WHITE);
		panel.add(panel_1_1_1_2_1);
		panel_1_1_1_2_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\dinnerpic.jpg"));
		lblNewLabel_1.setBounds(-18, 0, 207, 194);
		panel_1_1_1_2_1.add(lblNewLabel_1);

		JPanel panel_1_1_1_2_1_1 = new JPanel();
		panel_1_1_1_2_1_1.setBounds(723, 79, 199, 194);
		panel_1_1_1_2_1_1.setLayout(null);
		panel_1_1_1_2_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel_1_1_1_2_1_1.setBackground(new Color(204, 204, 255));
		panel.add(panel_1_1_1_2_1_1);

		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\traditionalpic.jpg"));
		lblNewLabel_1_1.setBounds(10, 10, 179, 236);
		panel_1_1_1_2_1_1.add(lblNewLabel_1_1);

		JPanel panel_1_1_1_2_1_1_1 = new JPanel();
		panel_1_1_1_2_1_1_1.setBounds(516, 267, 199, 194);
		panel_1_1_1_2_1_1_1.setLayout(null);
		panel_1_1_1_2_1_1_1.setBorder(new MatteBorder(6, 6, 6, 6, (Color) Color.BLACK));
		panel_1_1_1_2_1_1_1.setBackground(new Color(204, 204, 255));
		panel.add(panel_1_1_1_2_1_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\fashionpic.jfif"));
		lblNewLabel_1_1_1.setBounds(-27, 10, 216, 206);
		panel_1_1_1_2_1_1_1.add(lblNewLabel_1_1_1);
		
		JLabel discountoff = new JLabel("10% off for each customer!");
		discountoff.setForeground(Color.BLACK);
		discountoff.setFont(new Font("Perpetua", Font.PLAIN, 27));
		discountoff.setBounds(258, 28, 381, 44);
		panel.add(discountoff);
		
		JLabel nametopic = new JLabel("Clothing Rental Business");
		nametopic.setForeground(Color.BLACK);
		nametopic.setFont(new Font("Script MT Bold", Font.BOLD, 25));
		nametopic.setBackground(new Color(204, 204, 255));
		nametopic.setBounds(273, 0, 770, 33);
		panel.add(nametopic);
		
		JTextPane txtpnAdvertisement = new JTextPane();
		txtpnAdvertisement.setText("======================================================================\r\nHi, welcome to our beloved customer!  \r\nAre you finding a shope to rent your cloth for your special events?\r\nSo come to our shope and get your discounts from us!\r\nEach customer who rent our cloth also get a free gift!\r\nThe registration fee is RM 5-15 for each person depends on the type of cloth you rent.\r\n\r\nSpecial weekend price 10% off for each customer who rent. You can register at our shop anytime you feel free on weekend.\r\n\r\nHurry up and grab the discounts!\r\n\r\nKindly contact us at 011-56815181 for more details.\r\n=====================================================================");
		txtpnAdvertisement.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtpnAdvertisement.setBounds(32, 261, 457, 234);
		panel.add(txtpnAdvertisement);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\regpic.jfif"));
		lblNewLabel_2.setBounds(165, 10, 810, 509);
		panel.add(lblNewLabel_2);

	}
}

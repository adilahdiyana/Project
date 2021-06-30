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
import java.awt.SystemColor;

public class LClothingRental extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LClothingRental frame = new LClothingRental();
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
	public LClothingRental() {
		setTitle("Clothing Rental Business");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1024, 581); //set for 0,0,1400,800
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

		JMenu mnNewMenu_4 = new JMenu("Rental\r\n");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuDetail = new JMenuItem("Cloth Detail");
		mnNewMenu_4.add(mntmNewMenuDetail);
		mntmNewMenuDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LClothDetail frame = new LClothDetail();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				 dispose();
			}
		});
		JMenuItem mntmNewMenuItem_6_1 = new JMenuItem("Advertisement");
		mnNewMenu_4.add(mntmNewMenuItem_6_1);
		
		 mntmNewMenuItem_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LSales frame = new LSales();
				frame.setModalExclusionType(null);
				frame.setVisible(true);
				 dispose();
			}
		});
		 JMenu mnNewMenu_4_1 = new JMenu("Account");
			menuBar.add(mnNewMenu_4_1);
			
			JMenuItem mntmLogin = new JMenuItem("LLogin");
			mnNewMenu_4_1.add(mntmLogin);
			mntmLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						LLogin frame = new LLogin();
						frame.setModalExclusionType(null);
						frame.setVisible(true);
						 dispose();
					}
				});
			JMenuItem mntmRegisterNewAccount = new JMenuItem("Register New Account");
			mnNewMenu_4_1.add(mntmRegisterNewAccount);
			mntmRegisterNewAccount.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					LUserRegistration frame = new LUserRegistration();
					frame.setModalExclusionType(null);
					frame.setVisible(true);
					 dispose();
				}
			});
			
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(128, 0, 0)));
		panel.setBounds(0, 0, 1000, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton EventDetail_1 = new JButton("Recent Cloth (new rent)");
		EventDetail_1.setBackground(new Color(250, 235, 215));
		EventDetail_1.setFont(new Font("STXinwei", Font.BOLD, 20));
		EventDetail_1.setBounds(20, 210, 285, 53);
		panel.add(EventDetail_1);
		EventDetail_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LClothDetail ed = new LClothDetail(); //calling another frame/window
				ed.setModalExclusionType(null);
	            ed.setVisible(true);
	            dispose();
			}
		});
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(666, 323, 324, 189);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\regpic.jfif"));
		
		JLabel nametitle = new JLabel("Clothing Rental Business");
		nametitle.setForeground(new Color(255, 255, 255));
		nametitle.setFont(new Font("Script MT Bold", Font.BOLD, 28));
		nametitle.setBounds(685, 260, 581, 74);
		panel.add(nametitle);
		
		JLabel lblLocation_1 = new JLabel("We are only open at Kuala Lumpur City!");
		lblLocation_1.setForeground(new Color(255, 255, 255));
		lblLocation_1.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblLocation_1.setBackground(Color.LIGHT_GRAY);
		lblLocation_1.setBounds(20, 81, 503, 33);
		panel.add(lblLocation_1);
		
		JLabel lblOperatingHour = new JLabel("We are open at 10a.m~9p.m everyday!");
		lblOperatingHour.setForeground(new Color(255, 255, 255));
		lblOperatingHour.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblOperatingHour.setBounds(20, 124, 357, 33);
		panel.add(lblOperatingHour);
		
		JLabel lblContact = new JLabel("Contact us at 011-56815181 (Manager)");
		lblContact.setForeground(new Color(255, 255, 255));
		lblContact.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		lblContact.setBounds(20, 167, 369, 33);
		panel.add(lblContact);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\rentpic.png"));
		lblNewLabel.setBounds(425, 10, 308, 133);
		panel.add(lblNewLabel);
		
		JLabel loadingtext = new JLabel("Loading...");
		loadingtext.setBackground(new Color(240, 240, 240));
		loadingtext.setForeground(new Color(230, 230, 250));
		loadingtext.setFont(new Font("Sylfaen", Font.BOLD, 20));
		loadingtext.setBounds(10, 467, 363, 74);
		panel.add(loadingtext);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Lenovo\\Downloads\\clothpic.jpeg"));
		lblNewLabel_2.setBounds(10, 10, 980, 502);
		panel.add(lblNewLabel_2);
		
	}
}

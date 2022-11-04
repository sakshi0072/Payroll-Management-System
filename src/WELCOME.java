import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WELCOME extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WELCOME frame = new WELCOME();
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
	public WELCOME() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1542, 1029);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("ATTENDANCE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ATTENDENCE a = new ATTENDENCE();
				a.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_1.setBounds(152, 311, 297, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("COMPLAINT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				COMPLAIN b = new COMPLAIN();
				b.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_2.setBounds(152, 390, 297, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("EXIT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LOGIN_1 l = new LOGIN_1();
				l.setVisible(true);
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_3.setBounds(152, 470, 297, 45);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\WhatsApp Image 2021-11-23 at 9.27.32 PM.jpeg"));
		lblNewLabel_1.setBounds(91, 232, 45, 45);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\WhatsApp Image 2021-11-23 at 9.21.44 PM.jpeg"));
		lblNewLabel_2.setBounds(91, 312, 45, 45);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\WhatsApp Image 2021-11-23 at 9.19.57 PM.jpeg"));
		lblNewLabel_3.setBounds(91, 470, 45, 45);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\logo 3.jpg"));
		lblNewLabel_4.setBounds(1127, 58, 159, 160);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Welcome To");
		lblNewLabel_5.setForeground(new Color(0, 0, 205));
		lblNewLabel_5.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_5.setBounds(875, 252, 326, 98);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("making your company great");
		lblNewLabel_6.setFont(new Font("Lucida Bright", Font.ITALIC, 20));
		lblNewLabel_6.setBounds(1181, 485, 392, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Partner with a team that's dedicated to");
		lblNewLabel_7.setFont(new Font("Lucida Bright", Font.ITALIC, 20));
		lblNewLabel_7.setBounds(833, 444, 397, 45);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Downloads\\WhatsApp Image 2021-11-23 at 9.18.59 PM (1).jpeg"));
		lblNewLabel_8.setBounds(91, 390, 45, 45);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton_4 = new JButton("EMPLOYEE DETAILS");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EpPage p = new EpPage();
				p.setVisible(true);
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnNewButton_4.setBounds(152, 231, 297, 45);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_9 = new JLabel("Stallion Enterprise");
		lblNewLabel_9.setForeground(new Color(0, 0, 205));
		lblNewLabel_9.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_9.setBounds(1053, 339, 501, 52);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Downloads\\BG.png"));
		lblNewLabel_10.setBounds(0, 0, 1542, 1029);
		contentPane.add(lblNewLabel_10);
	}
}

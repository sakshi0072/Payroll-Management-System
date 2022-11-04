import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class LOGIN_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN_1 frame = new LOGIN_1();
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
	public LOGIN_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1542, 1029);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\admin.jpg"));
		lblNewLabel.setBounds(651, 220, 50, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\password.jpeg"));
		lblNewLabel_1.setBounds(651, 328, 50, 50);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("employee Id");
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(704, 189, 98, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("password");
		lblNewLabel_3.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(704, 296, 94, 21);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.PLAIN, 20));
		textField.setBounds(701, 220, 239, 50);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("show password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);	
				}
				else {
					passwordField.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setBounds(704, 390, 140, 21);
		contentPane.add(chckbxNewCheckBox);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Calibri", Font.PLAIN, 20));
		passwordField.setBounds(701, 327, 239, 50);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root",
							"chinuu22");
					System.out.println("Connected Successfully");

					PreparedStatement pst = connection
							.prepareStatement("select * from Employee_1 where emp_Id=? and password=?");
					pst.setString(1, textField.getText());
					pst.setString(2, passwordField.getText());

					ResultSet rs = pst.executeQuery();

					int count = 0;
					while (rs.next()) {
						count = count + 1;
					}

					if (count == 1) {
						WELCOME a = new WELCOME();
						a.setVisible(true);
						setVisible(false);
						
					} else if (count > 1) {
						JOptionPane.showMessageDialog(null, "Duplicate entery found");
					} else {
						JOptionPane.showMessageDialog(null, "Incorrect LoginId and Password");
						setVisible(false);
						LOGIN_1 h = new LOGIN_1();
						h.setVisible(true);
					}
					
				} catch (Exception er) {
					System.out.println(er);
				}
			}
			
		});
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 25));
		btnNewButton.setBackground(new Color(245, 245, 245));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(689, 462, 274, 50);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Welcome to Stallion Enterprise");
		lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		lblNewLabel_4.setBounds(580, 49, 542, 59);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\white bg.jpeg"));
		lblNewLabel_5.setBounds(635, 134, 380, 433);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\pexels-jess-bailey-designs-1097930 (1).jpg"));
		lblNewLabel_6.setBounds(0, 0, 1542, 1029);
		contentPane.add(lblNewLabel_6);
	}
}

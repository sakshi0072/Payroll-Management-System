import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
public class EpPage extends JFrame {

	private JPanel contentPane;
	private JTextField NAM;
	private JTextField DESG;
	private JTextField DEPT;
	private JTextField EPID;
	private JTextField BA;
	private JTextField PF;
	private JTextField TS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EpPage frame = new EpPage();
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
	public EpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1542, 1029);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Salary Slip Template");
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 45));
		lblNewLabel.setBounds(416, 107, 494, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Details");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(660, 180, 271, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" Name :");
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(450, 286, 81, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Stallion Enterprise");
		lblNewLabel_3.setFont(new Font("Century", Font.BOLD | Font.ITALIC, 55));
		lblNewLabel_3.setBounds(304, 26, 763, 61);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Designation :");
		lblNewLabel_4.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(398, 328, 137, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Department :");
		lblNewLabel_5.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(394, 369, 137, 27);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Employee Id :");
		lblNewLabel_6.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(394, 244, 141, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Salary Details");
		lblNewLabel_7.setFont(new Font("Lucida Bright", Font.PLAIN, 30));
		lblNewLabel_7.setBounds(677, 460, 222, 36);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_9 = new JLabel("Salary Head");
		lblNewLabel_9.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(1020, 547, 128, 27);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Amount");
		lblNewLabel_10.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_10.setBounds(1220, 549, 90, 27);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(" PF Employee :");
		lblNewLabel_11.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_11.setBounds(1020, 594, 151, 36);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\logo 2.jpg"));
		lblNewLabel_12.setBounds(1280, 26, 128, 128);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Total Salary :");
		lblNewLabel_13.setFont(new Font("Lucida Bright", Font.PLAIN, 25));
		lblNewLabel_13.setBounds(625, 635, 166, 42);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_15 = new JLabel("Deduction");
		lblNewLabel_15.setFont(new Font("Lucida Bright", Font.PLAIN, 25));
		lblNewLabel_15.setBounds(1011, 500, 151, 36);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Salary Head");
		lblNewLabel_16.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_16.setBounds(295, 549, 137, 27);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_18 = new JLabel("Amount");
		lblNewLabel_18.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_18.setBounds(442, 547, 90, 31);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("Basic (A) :");
		lblNewLabel_19.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		lblNewLabel_19.setBounds(295, 597, 108, 27);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_21 = new JLabel("Earnings");
		lblNewLabel_21.setFont(new Font("Lucida Bright", Font.PLAIN, 25));
		lblNewLabel_21.setBounds(451, 500, 126, 36);
		contentPane.add(lblNewLabel_21);
		
		NAM = new JTextField();
		NAM.setBounds(563, 288, 579, 27);
		contentPane.add(NAM);
		NAM.setColumns(10);
		
		DESG = new JTextField();
		DESG.setBounds(563, 332, 579, 27);
		contentPane.add(DESG);
		DESG.setColumns(10);
		
		DEPT = new JTextField();
		DEPT.setBounds(563, 369, 579, 27);
		contentPane.add(DEPT);
		DEPT.setColumns(10);
		
		EPID = new JTextField();
		EPID.setBounds(563, 248, 579, 27);
		contentPane.add(EPID);
		EPID.setColumns(10);
		
		BA = new JTextField();
		BA.setBounds(443, 600, 128, 30);
		contentPane.add(BA);
		BA.setColumns(10);
		
		PF = new JTextField();
		PF.setBounds(1207, 591, 144, 36);
		contentPane.add(PF);
		PF.setColumns(10);
		
		TS = new JTextField();
		TS.setBounds(789, 647, 185, 27);
		contentPane.add(TS);
		TS.setColumns(10);
		
		JButton btnNewButton = new JButton("View");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","chinuu22");
					System.out.println("Connected Successfully");
					PreparedStatement pst = connection.prepareStatement("select * from emp_detail_1 where emp_id='"+EPID.getText()+"'");
					ResultSet rs = pst.executeQuery();
					
					if(rs.next()) {
						BA.setText(rs.getString("Basic"));
						PF.setText(rs.getString("PF"));
						NAM.setText(rs.getString("emp_name"));
						DESG.setText(rs.getString("desg"));
						DEPT.setText(rs.getString("dept"));
						TS.setText(rs.getString("Total_Salary"));
					}

					
					
				} catch (Exception E) {
					System.out.println(E);
				}
			}
			}
		);
		btnNewButton.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		btnNewButton.setBounds(718, 414, 113, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WELCOME w = new WELCOME();
				w.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		btnNewButton_1.setBounds(556, 706, 180, 61);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("RESET");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				EpPage g = new EpPage();
				g.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Lucida Bright", Font.BOLD, 25));
		btnNewButton_2.setBounds(814, 706, 180, 61);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\cbc3b4.png"));
		lblNewLabel_8.setBounds(0, 0, 1542, 1029);
		contentPane.add(lblNewLabel_8);
	}
}

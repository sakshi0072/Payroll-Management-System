import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.sql.*;

public class ATTENDENCE extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
private JComboBox <String> comboBox;
private JComboBox <String> comboBox_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ATTENDENCE dialog = new ATTENDENCE();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ATTENDENCE() {
		setBounds(550, 150, 411, 515);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ATTENDANCE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 30));
		lblNewLabel.setBounds(0, 0, 397, 64);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee Id");
		lblNewLabel_1.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(51, 150, 99, 21);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Half");
		lblNewLabel_2.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(61, 207, 89, 21);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Second Half");
		lblNewLabel_3.setFont(new Font("Lucida Bright", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(51, 262, 99, 21);
		contentPanel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Bright", Font.PLAIN, 12));
		textField.setBounds(195, 151, 125, 21);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		 comboBox = new JComboBox<String>();
		comboBox.setFont(new Font("Calibri", Font.PLAIN, 13));
		comboBox.setBounds(195, 211, 125, 21);
		contentPanel.add(comboBox);
		comboBox.addItem("Select");
		comboBox.addItem("Present");
		comboBox.addItem("Absent");
		
		comboBox_1 = new JComboBox<String>();
		comboBox_1.setFont(new Font("Calibri", Font.PLAIN, 13));
		comboBox_1.setBounds(195, 266, 125, 21);
		contentPanel.add(comboBox_1);
		comboBox_1.addItem("Select");
		comboBox_1.addItem("Present");
		comboBox_1.addItem("Absent");
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = textField.getText();
				String b = (String) comboBox.getSelectedItem();
				String c = (String) comboBox_1.getSelectedItem();
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","chinuu22");
					System.out.println("Connected Successfully");
					
					PreparedStatement pst = connection.prepareStatement("insert into attendance values(?,?,?)");
					
					pst.setString(1, a);
					pst.setString(2, b);
					pst.setString(3, c);
					
					
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Inserted Successfully");
					setVisible(false);
					
				}catch(Exception er) {
					System.out.println(er);
				}
			}
			}
		);
		btnNewButton.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		btnNewButton.setBounds(59, 377, 110, 45);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WELCOME w = new WELCOME();
				w.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Bright", Font.PLAIN, 20));
		btnNewButton_1.setBounds(227, 377, 110, 45);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\cbc3b4.png"));
		lblNewLabel_4.setBounds(0, 0, 415, 492);
		contentPanel.add(lblNewLabel_4);
	}
}

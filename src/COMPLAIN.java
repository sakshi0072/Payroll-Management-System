import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class COMPLAIN extends JDialog {

	private final JPanel contentPanel = new JPanel();
private JEditorPane editorPane ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			COMPLAIN dialog = new COMPLAIN();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public COMPLAIN() {
		setBounds(550, 150, 411, 515);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("COMPLAINT");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Lucida Bright", Font.BOLD, 30));
			lblNewLabel.setBounds(0, 0, 397, 69);
			contentPanel.add(lblNewLabel);
		}
		
		 editorPane = new JEditorPane();
		editorPane.setFont(new Font("Calibri", Font.PLAIN, 17));
		editorPane.setBounds(52, 87, 300, 296);
		contentPanel.add(editorPane);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = editorPane.getText();
				
				
				try {
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","chinuu22");
					System.out.println("Connected Successfully");
					
					PreparedStatement pst = connection.prepareStatement("insert into complaint_1 values(?)");
					
					pst.setString(1, a);
					
					
					
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "Inserted Successfully");
					setVisible(false);
					
				}catch(Exception er) {
					System.out.println(er);
				}
			}
			}
		);
		btnNewButton.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnNewButton.setBounds(52, 406, 108, 40);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WELCOME w = new WELCOME();
				w.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Bright", Font.BOLD, 15));
		btnNewButton_1.setBounds(234, 406, 108, 40);
		contentPanel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\chinm\\Dropbox\\PC\\Desktop\\java eclipse\\cbc3b4.png"));
		lblNewLabel_1.setBounds(0, 0, 411, 515);
		contentPanel.add(lblNewLabel_1);
	}
}

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class LoginUI {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Create the application.
	 */
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Music Rate");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserid = new JLabel("UserID:");
		lblUserid.setBounds(36, 95, 61, 16);
		frame.getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(36, 140, 69, 16);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(123, 90, 152, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(133, 135, 142, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAdminLoginPage = new JLabel("Login Page");
		lblAdminLoginPage.setBounds(163, 44, 83, 16);
		frame.getContentPane().add(lblAdminLoginPage);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(280, 183, 117, 29);
		frame.getContentPane().add(btnLogin);
	}
}

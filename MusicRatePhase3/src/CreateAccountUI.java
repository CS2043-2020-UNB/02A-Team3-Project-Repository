import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class CreateAccountUI {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the application.
	 */
	public CreateAccountUI() {
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
		
		JLabel lblUserLoginPage = new JLabel("Create Account");
		lblUserLoginPage.setBounds(171, 36, 117, 16);
		frame.getContentPane().add(lblUserLoginPage);
		
		JLabel lblUserid = new JLabel("UserID:");
		lblUserid.setBounds(52, 88, 61, 16);
		frame.getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(52, 133, 71, 16);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(125, 83, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(125, 128, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("Create");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLogin.setBounds(260, 164, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCreateAccount = new JButton("Create Account & Login");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCreateAccount.setBounds(29, 164, 181, 29);
		frame.getContentPane().add(btnCreateAccount);
	}

}

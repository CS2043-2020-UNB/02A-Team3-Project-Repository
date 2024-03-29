import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginUI {
	public int mode;
	public JFrame frame;
	private JTextField textField;
	private LoginControl control;
	private UserObject user;
	private AdminObject admin;
	/**
	 * Create the application.
	 */
	public LoginUI(DataManager dm, LoginControl control,int mode) {
		initialize();
		this.mode=mode;
		this.control=control;
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
		
		JPasswordField textField_1 = new JPasswordField();
		textField_1.setEchoChar('*');
		textField_1.setBounds(133, 135, 142, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAdminLoginPage = new JLabel("Login Page");
		lblAdminLoginPage.setBounds(163, 44, 83, 16);
		frame.getContentPane().add(lblAdminLoginPage);
		
		JLabel ac = new JLabel("");
		ac.setBounds(49, 234, 352, 26);
		frame.getContentPane().add(ac);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(mode==1) {
					admin = control.handleAdminLogin(textField.getText(), textField_1.getText());
					if(admin != null) {
						ac.setText("Admin Login Successful");
					}
					else {
						ac.setText("Admin Login Failed");
					}
					
				} 
				else{
					user = control.handleUserLogin(textField.getText(), textField_1.getText());
					if(user != null)
						ac.setText("User Login Successful");
					else {
						ac.setText("User Login Failed");
					}
				}
			}
		});
		btnLogin.setBounds(280, 183, 117, 29);
		frame.getContentPane().add(btnLogin);
	}
}

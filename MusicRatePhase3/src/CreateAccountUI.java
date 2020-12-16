import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccountUI {

	public JFrame frame;
	private JTextField textField;
	private CreateAccountControl control;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Create the application.
	 */
	public CreateAccountUI(CreateAccountControl control) {
		initialize();
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
		
		JLabel lblUserLoginPage = new JLabel("Create Account");
		lblUserLoginPage.setBounds(169, 19, 117, 16);
		frame.getContentPane().add(lblUserLoginPage);
		
		JLabel lblUserid = new JLabel("UserID:");
		lblUserid.setBounds(51, 58, 61, 16);
		frame.getContentPane().add(lblUserid);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(51, 86, 71, 16);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(125, 53, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPasswordField p = new JPasswordField();
		p.setEchoChar('*');
		p.setBounds(125, 81, 130, 26);
		frame.getContentPane().add(p);
		p.setColumns(10);
		JLabel ac = new JLabel("");
		ac.setBounds(53, 234, 352, 26);
		frame.getContentPane().add(ac);
		
		JButton btnLogin = new JButton("Create");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = p.getText();
				String ID = textField.getText();
				String name=textField_2.getText();
				String email=textField_3.getText();
				if(control.handleCreateAccount(ID, password,name,email, true))
					ac.setText("Account Successfully Created");
				else
					ac.setText("Username Exist or You are logged In");
			}
		});
		btnLogin.setBounds(260, 193, 117, 29);
		frame.getContentPane().add(btnLogin);
		
		JButton btnCreateAccount = new JButton("Create Account & Login");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = p.getText();
				String ID = textField.getText();
				String name=textField_2.getText();
				String email=textField_3.getText();
				if(control.handleCreateAccount(ID, password,name,email, true))
					ac.setText("Account Successfully Created And You are logged In");
				else
					ac.setText("Username Exist or You are logged In");
			}
		});
		btnCreateAccount.setBounds(6, 193, 181, 29);
		frame.getContentPane().add(btnCreateAccount);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(51, 114, 61, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblNewLabel = new JLabel("Email:");
		lblNewLabel.setBounds(51, 147, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(125, 109, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 142, 130, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
	}
}

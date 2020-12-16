import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveUserAccUI {

	public JFrame frame;
	private RemoveUserAccountControl rUAC;

	/**
	 * Create the application.
	 */
	public RemoveUserAccUI(DataManager dm, LoginControl control) {
		this.rUAC=new RemoveUserAccountControl(dm,control);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Remove User Account");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAreYouSure = new JLabel("Are you sure you want to remove your Account?");
		lblAreYouSure.setBounds(67, 37, 310, 16);
		frame.getContentPane().add(lblAreYouSure);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(30, 205, 386, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rUAC.handleRemoveUserAccount()) {
					lblNewLabel.setText("User successfully removed");
				}
				else {
					lblNewLabel.setText("User not logged in or does not exist");
				}
			}
		});
		btnYes.setBounds(30, 83, 117, 29);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Account not Removed.");
			}
		});
		btnNo.setBounds(260, 83, 117, 29);
		frame.getContentPane().add(btnNo);
		
	
	}

}

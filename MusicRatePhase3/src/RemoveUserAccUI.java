import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class RemoveUserAccUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public RemoveUserAccUI() {
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
		
		JButton btnYes = new JButton("Yes");
		btnYes.setBounds(30, 83, 117, 29);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.setBounds(260, 83, 117, 29);
		frame.getContentPane().add(btnNo);
	}

}

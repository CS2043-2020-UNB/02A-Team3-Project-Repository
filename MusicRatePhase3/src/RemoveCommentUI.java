import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveCommentUI {

	public JFrame frame;
	private RemoveCommentControl aControl;
	private int cID;

	

	/**
	 * Create the application.
	 */
	public RemoveCommentUI(DataManager dm,int cID) {
		this.cID=cID;
		this.aControl = new RemoveCommentControl(dm);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Remove Comment");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAreYouSure = new JLabel("Are you sure you want to remove Comment?");
		lblAreYouSure.setBounds(66, 31, 292, 16);
		frame.getContentPane().add(lblAreYouSure);
		
		JLabel x = new JLabel("");
		x.setBounds(66, 193, 334, 16);
		frame.getContentPane().add(x);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					aControl.handleRemoveComment(cID);
					x.setText("Comment successfully removed");
				}

		});
		btnYes.setBounds(52, 82, 117, 29);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x.setText("Comment not Removed");
			}
		});
		btnNo.setBounds(256, 82, 117, 29);
		frame.getContentPane().add(btnNo);
		
	}

}

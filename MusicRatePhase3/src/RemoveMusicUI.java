import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveMusicUI {

	public JFrame frame;
	private RemoveMusicControl rc;
	private int mID;
	/**
	 * Create the application.
	 */
	public RemoveMusicUI(DataManager dm, LoginControl lc, int mID) {
		this.mID = mID;
		this.rc = new RemoveMusicControl(dm, lc);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Remove Music");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAreYouSure = new JLabel("Are you sure you want to remove music?");
		lblAreYouSure.setBounds(105, 30, 266, 16);
		frame.getContentPane().add(lblAreYouSure);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(48, 234, 344, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rc.handleRemoveMusic(mID))
					lblNewLabel.setText("Music Successfully Removed from the List.");
				else
					lblNewLabel.setText("Admin Not Logged in.");
			}
		});
		btnYes.setBounds(48, 86, 117, 29);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("Music not Removed.");
			}
		});
		btnNo.setBounds(275, 86, 117, 29);
		frame.getContentPane().add(btnNo);
		
	}

}

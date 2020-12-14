import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoveMusicUI {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public RemoveMusicUI() {
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
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnYes.setBounds(48, 86, 117, 29);
		frame.getContentPane().add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNo.setBounds(275, 86, 117, 29);
		frame.getContentPane().add(btnNo);
	}

}
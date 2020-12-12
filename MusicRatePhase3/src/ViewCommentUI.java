import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCommentUI {

	public JFrame frame;


	/**
	 * Create the application.
	 */
	public ViewCommentUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("View Comment");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserid = new JLabel("UserID:");
		lblUserid.setBounds(84, 32, 61, 16);
		frame.getContentPane().add(lblUserid);
		
		JLabel lblComment = new JLabel("Comment:");
		lblComment.setBounds(84, 60, 77, 16);
		frame.getContentPane().add(lblComment);
		
		JButton btnRemoveComment = new JButton("Remove Comment");
		btnRemoveComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RemoveCommentUI window = new RemoveCommentUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnRemoveComment.setBounds(245, 94, 147, 29);
		frame.getContentPane().add(btnRemoveComment);
	}

}

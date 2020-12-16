import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCommentUI {

	public JFrame frame;
	private DataManager dm;
	private ViewCommentControl vMC;
	private CommentObject cObj;

	/**
	 * Create the application.
	 */
	public ViewCommentUI(DataManager dm,LoginControl lc,CommentObject cObj) {
		this.cObj=cObj;
		this.dm=dm;
		this.vMC=new ViewCommentControl(lc);
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
		
		JLabel lblComment = new JLabel("Comment:");
		lblComment.setBounds(44, 20, 77, 16);
		frame.getContentPane().add(lblComment);
		JLabel cmntL = new JLabel(cObj.comment);
		cmntL.setBounds(44, 56, 384, 159);
		frame.getContentPane().add(cmntL);
		
		JLabel cL = new JLabel("");
		cL.setBounds(44, 256, 384, 16);
		frame.getContentPane().add(cL);
		
		JButton btnRemoveComment = new JButton("Remove Comment");
		btnRemoveComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							if(!vMC.handleViewComment()) {
								cL.setText("Admin Not Logged in for remove comment");
							}
							else {
								RemoveCommentUI window = new RemoveCommentUI(dm,cObj.cID);
								window.frame.setVisible(true);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnRemoveComment.setBounds(281, 227, 147, 29);
		frame.getContentPane().add(btnRemoveComment);
		
	}

}

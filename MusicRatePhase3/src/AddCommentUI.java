import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCommentUI {

	public JFrame frame;
	private JTextField textField;

	

	/**
	 * Create the application.
	 */
	public AddCommentUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Add Comment");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterYourComment = new JLabel("Enter your Comment");
		lblEnterYourComment.setBounds(153, 20, 142, 16);
		frame.getContentPane().add(lblEnterYourComment);
		
		textField = new JTextField();
		textField.setBounds(6, 62, 438, 108);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAddComment = new JButton("Add Comment");
		btnAddComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddComment.setBounds(327, 232, 117, 29);
		frame.getContentPane().add(btnAddComment);
	}

}

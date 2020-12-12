import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddRatingUI {

	public JFrame frame;
	private JTextField textField;


	/**
	 * Create the application.
	 */
	public AddRatingUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Add Rating");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterYourRating = new JLabel("Enter your Rating (1-5)");
		lblEnterYourRating.setBounds(141, 32, 154, 16);
		frame.getContentPane().add(lblEnterYourRating);
		
		textField = new JTextField();
		textField.setBounds(174, 60, 80, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnAddRating = new JButton("Add Rating");
		btnAddRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddRating.setBounds(270, 106, 117, 29);
		frame.getContentPane().add(btnAddRating);
	}

}

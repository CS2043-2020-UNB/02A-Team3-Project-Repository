import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddRatingUI {

	public JFrame frame;
	private JTextField textField;
	private AddRatingControl ac;
	private int mID;
	private JLabel x;


	/**
	 * Create the application.
	 */
	public AddRatingUI(DataManager dm, LoginControl lc, int mID) {
		this.mID=mID;
		this.ac=new AddRatingControl(dm,lc);
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
		
		x = new JLabel("");
		x.setBounds(49, 194, 364, 16);
		frame.getContentPane().add(x);
		
		JButton btnAddRating = new JButton("Add Rating");
		btnAddRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rate;
				try {
					rate = Integer.parseInt(textField.getText());
					if(rate<1 || rate>5)
						throw new Exception();
					if(ac.handleAddRating(mID, rate)) {
						x.setText("Rating successfully added");
					}
					else 
						x.setText("User not logged in or rating has been added already.");
				}
				catch(Exception f) {
					x.setText("Please enter a valid rating");
				}
			}
		});
		btnAddRating.setBounds(270, 106, 117, 29);
		frame.getContentPane().add(btnAddRating);
		
	}

}

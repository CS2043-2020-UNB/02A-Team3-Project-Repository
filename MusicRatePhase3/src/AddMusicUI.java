import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class AddMusicUI {

	public JFrame frame;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the application.
	 */
	public AddMusicUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Add Music");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMusicTitle = new JLabel("Music Title:");
		lblMusicTitle.setBounds(80, 62, 83, 16);
		frame.getContentPane().add(lblMusicTitle);
		
		JLabel lblArtist = new JLabel("Artist:");
		lblArtist.setBounds(80, 92, 45, 16);
		frame.getContentPane().add(lblArtist);
		
		JLabel lblExternalLink = new JLabel("External Link:");
		lblExternalLink.setBounds(80, 120, 93, 16);
		frame.getContentPane().add(lblExternalLink);
		
		textField_1 = new JTextField();
		textField_1.setBounds(235, 57, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(235, 87, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(235, 115, 130, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAddMusic = new JButton("Add Music");
		btnAddMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnAddMusic.setBounds(292, 163, 117, 29);
		frame.getContentPane().add(btnAddMusic);
	}

}

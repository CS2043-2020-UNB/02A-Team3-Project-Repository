import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class SearchMusicUI {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;



	/**
	 * Create the application.
	 */
	public SearchMusicUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Search Music");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEnterMusicTititle = new JLabel("Enter Music Title:");
		lblEnterMusicTititle.setBounds(6, 6, 119, 16);
		frame.getContentPane().add(lblEnterMusicTititle);
		
		textField = new JTextField();
		textField.setBounds(137, 1, 227, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearch.setBounds(366, 1, 78, 29);
		frame.getContentPane().add(btnSearch);
		
		JButton btnViewMusic = new JButton("View Music");
		btnViewMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ViewMusicUI window = new ViewMusicUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnViewMusic.setBounds(273, 215, 117, 29);
		frame.getContentPane().add(btnViewMusic);
		
		JLabel lblIndexNumber = new JLabel("Index Number:");
		lblIndexNumber.setBounds(49, 220, 98, 16);
		frame.getContentPane().add(lblIndexNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 215, 78, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

}

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class SearchMusicUI {

	public JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private DataManager dm;
	private LoginControl lc;
	private SearchMusicControl sc;

	/**
	 * Create the application.
	 */
	public SearchMusicUI(DataManager dm, LoginControl lc) {
		this.dm = dm;
		this.lc = lc;
		this.sc = new SearchMusicControl(dm);
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(49, 253, 341, 16);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(137, 1, 227, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lc.getAdmin()!=null || lc.getUser()!=null) {
					sc.handleSearchMusic(textField.getText());
					lblNewLabel.setText("Search Successful");
				}
				else
					lblNewLabel.setText("Unsuccessful Search");
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

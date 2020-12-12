import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

public class MusicListUI {

	public JFrame frame;
	private JTextField textField;


	/**
	 * Create the application.
	 */
	public MusicListUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Music List");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMusicNumber = new JLabel("Index Number:");
		lblMusicNumber.setBounds(60, 223, 104, 16);
		frame.getContentPane().add(lblMusicNumber);
		
		textField = new JTextField();
		textField.setBounds(176, 218, 57, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
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
		btnViewMusic.setBounds(276, 218, 117, 29);
		frame.getContentPane().add(btnViewMusic);
		
		JLabel lblIndex = new JLabel("Index");
		lblIndex.setBounds(6, 6, 61, 16);
		frame.getContentPane().add(lblIndex);
		
		JLabel lblMusicTitile = new JLabel("Music Title");
		lblMusicTitile.setBounds(60, 6, 74, 16);
		frame.getContentPane().add(lblMusicTitile);
	}

}

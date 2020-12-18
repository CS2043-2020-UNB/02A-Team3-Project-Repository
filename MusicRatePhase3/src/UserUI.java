import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class UserUI {

	public JFrame frame;
	private DataManager dm=new DataManager();
	private LoginControl control= new LoginControl(dm);
	private CreateAccountControl cControl=new CreateAccountControl(dm,control);

	/**
	 * Create the application.
	 */
	public UserUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("User");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSelectTheSuitable = new JLabel("Select the suitable option");
		lblSelectTheSuitable.setBounds(128, 22, 169, 16);
		frame.getContentPane().add(lblSelectTheSuitable);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							LoginUI window = new LoginUI(dm,control,2);
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton.setBounds(138, 50, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							CreateAccountUI window = new CreateAccountUI(cControl);
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnCreateAccount.setBounds(128, 85, 140, 29);
		frame.getContentPane().add(btnCreateAccount);
		
		JButton btnSearchMusic = new JButton("Search Music");
		btnSearchMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							SearchMusicUI window = new SearchMusicUI(dm,control);
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnSearchMusic.setBounds(138, 126, 117, 29);
		frame.getContentPane().add(btnSearchMusic);
		
		JButton btnNewButton_1 = new JButton("View MusicList");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MusicListUI window = new MusicListUI(dm,control);
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_1.setBounds(138, 166, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Remove Account");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RemoveUserAccUI window = new RemoveUserAccUI(dm,control);
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setBounds(128, 207, 140, 29);
		frame.getContentPane().add(btnNewButton_2);
	}

}

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUI window = new MainUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private MainUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Music Rate");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AdminUI window = new AdminUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAdmin.setBounds(24, 147, 117, 29);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							UserUI window = new UserUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnUser.setBounds(290, 147, 117, 29);
		frame.getContentPane().add(btnUser);
		
		JLabel lblYouAre = new JLabel("You are?");
		lblYouAre.setBounds(191, 116, 92, 16);
		frame.getContentPane().add(lblYouAre);
		
		JLabel lblWelcomeToMusic = new JLabel("Welcome to Music Rate!");
		lblWelcomeToMusic.setBounds(144, 52, 172, 16);
		frame.getContentPane().add(lblWelcomeToMusic);
		
		JLabel Txt = new JLabel("Please close the window you are using to go back");
		Txt.setBounds(56, 179, 341, 47);
		frame.getContentPane().add(Txt);
		
		JLabel lblNewLabel = new JLabel("Please close this window to exit the app");
		lblNewLabel.setBounds(89, 238, 266, 16);
		frame.getContentPane().add(lblNewLabel);
	}
}

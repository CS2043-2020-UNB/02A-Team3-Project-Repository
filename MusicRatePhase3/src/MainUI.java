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
			}
		});
		btnAdmin.setBounds(25, 170, 117, 29);
		frame.getContentPane().add(btnAdmin);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUser.setBounds(297, 170, 117, 29);
		frame.getContentPane().add(btnUser);
		
		JLabel lblYouAre = new JLabel("You are?");
		lblYouAre.setBounds(191, 116, 92, 16);
		frame.getContentPane().add(lblYouAre);
		
		JLabel lblWelcomeToMusic = new JLabel("Welcome to Music Rate!");
		lblWelcomeToMusic.setBounds(144, 52, 172, 16);
		frame.getContentPane().add(lblWelcomeToMusic);
	}
}

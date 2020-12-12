import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.EventQueue;

public class ViewMusicUI {

	public JFrame frame;
	private JTextField textField;


	/**
	 * Create the application.
	 */
	public ViewMusicUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("View Music");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMusicTitle = new JLabel("Music Title:");
		lblMusicTitle.setBounds(60, 27, 85, 16);
		frame.getContentPane().add(lblMusicTitle);
		
		JLabel lblArtist = new JLabel("Artist:");
		lblArtist.setBounds(60, 55, 61, 16);
		frame.getContentPane().add(lblArtist);
		
		JLabel lblNewLabel = new JLabel("Rating:");
		lblNewLabel.setBounds(60, 85, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblExternalLink = new JLabel("External Link:");
		lblExternalLink.setBounds(60, 113, 100, 16);
		frame.getContentPane().add(lblExternalLink);
		
		JButton btnAddRating = new JButton("Add Rating");
		btnAddRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AddRatingUI window = new AddRatingUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAddRating.setBounds(43, 141, 117, 29);
		frame.getContentPane().add(btnAddRating);
		
		JButton btnAddComment = new JButton("Add Comment");
		btnAddComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AddCommentUI window = new AddCommentUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnAddComment.setBounds(179, 141, 117, 29);
		frame.getContentPane().add(btnAddComment);
		
		JButton btnRemoveMusic = new JButton("Remove Music");
		btnRemoveMusic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RemoveMusicUI window = new RemoveMusicUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnRemoveMusic.setBounds(308, 141, 117, 29);
		frame.getContentPane().add(btnRemoveMusic);
		
		JButton btnViewComment = new JButton("View Comment");
		btnViewComment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ViewCommentUI window = new ViewCommentUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnViewComment.setBounds(293, 209, 132, 29);
		frame.getContentPane().add(btnViewComment);
		
		JLabel lblIndexNumber = new JLabel("Index Number:");
		lblIndexNumber.setBounds(43, 214, 93, 16);
		frame.getContentPane().add(lblIndexNumber);
		
		textField = new JTextField();
		textField.setBounds(168, 209, 93, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.EventQueue;

public class ViewMusicUI {

	public JFrame frame;
	private JTextField textField;
	private LoginControl lc;
	private MusicObject mObj;
	private DataManager dm;
	private ViewMusicControl vMC;


	/**
	 * Create the application.
	 */
	public ViewMusicUI(LoginControl lc,DataManager dm, MusicObject mObj) {
		this.lc = lc;
		this.dm=dm;
		this.mObj=mObj;
		this.vMC=new ViewMusicControl(dm);
		this.mObj.mCmnt=this.dm.getComments(mObj.mID);
		this.mObj.mRatings=this.dm.getMusicRating(mObj.mID);
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
		
		JLabel lblMusicTitle = new JLabel("Music Title: "+mObj.mTitle);
		lblMusicTitle.setBounds(60, 27, 365, 16);
		frame.getContentPane().add(lblMusicTitle);
		
		JLabel lblArtist = new JLabel("Artist: " + mObj.mArtist);
		lblArtist.setBounds(60, 55, 372, 16);
		frame.getContentPane().add(lblArtist);
		
		JLabel lblNewLabel = new JLabel("Rating: " + mObj.mRatings);
		lblNewLabel.setBounds(60, 85, 365, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblExternalLink = new JLabel("External Link: " + mObj.mLink);
		lblExternalLink.setBounds(60, 113, 365, 16);
		frame.getContentPane().add(lblExternalLink);
		
		String s="";
		for (int i=0; i<mObj.mCmnt.size(); i++) {
			s+= (i+1) + "\t" + mObj.mCmnt.get(i).comment + "\n";
		}
		JLabel lblNewLabel_1 = new JLabel(s);
		lblNewLabel_1.setBounds(53, 182, 365, 46);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel indexL = new JLabel("");
		indexL.setBounds(43, 256, 375, 16);
		frame.getContentPane().add(indexL);
		
		JButton btnAddRating = new JButton("Add Rating");
		btnAddRating.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							AddRatingUI window = new AddRatingUI(dm,lc,mObj.mID);
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
							AddCommentUI window = new AddCommentUI(dm, lc, mObj.mID);
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
							RemoveMusicUI window = new RemoveMusicUI(dm,lc,mObj.mID);
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
							int index;
							try {
								index=Integer.parseInt(textField.getText())-1;
							}catch(Exception e){
								index=0;
							};
							if(index-1 > mObj.mCmnt.size())
								indexL.setText("Index not available");
							else {
								ViewCommentUI window = new ViewCommentUI(dm,mObj.mCmnt.get(index));
								window.frame.setVisible(true);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnViewComment.setBounds(293, 230, 132, 29);
		frame.getContentPane().add(btnViewComment);
		
		JLabel lblIndexNumber = new JLabel("Index Number:");
		lblIndexNumber.setBounds(43, 235, 93, 16);
		frame.getContentPane().add(lblIndexNumber);
		
		textField = new JTextField();
		textField.setBounds(164, 230, 93, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
	}

}

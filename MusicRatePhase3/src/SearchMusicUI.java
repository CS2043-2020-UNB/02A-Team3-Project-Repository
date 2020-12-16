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
	private LoginControl lc;
	private SearchMusicControl sc;
	private ArrayList<MusicObject> sM;
	private DataManager dm;

	/**
	 * Create the application.
	 */
	public SearchMusicUI(DataManager dtm, LoginControl lc) {
		this.lc = lc;
		this.sc = new SearchMusicControl(dtm);
		this.dm=dtm;
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
		lblNewLabel.setBounds(16, 39, 415, 176);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(137, 1, 227, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblIndexNumber = new JLabel("Index Number:");
		lblIndexNumber.setBounds(49, 220, 98, 16);
		frame.getContentPane().add(lblIndexNumber);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 215, 78, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel indexL = new JLabel("");
		indexL.setBounds(92, 256, 272, 16);
		frame.getContentPane().add(indexL);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sM=sc.handleSearchMusic(textField.getText());
				String s="";
				for (int i=0; i<sM.size(); i++) {
					s+= (i+1) + "\t" + sM.get(i).mTitle + "\n";
				}
				lblNewLabel.setText(s);
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
							int index;
							try {
								index=Integer.parseInt(textField_1.getText())-1;
							}catch(Exception e){
								index=0;
							};
							if(index-1 > sM.size())
								indexL.setText("Index not available");
							else {
								ViewMusicUI window = new ViewMusicUI(lc,dm,sM.get(index));
								window.frame.setVisible(true);
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnViewMusic.setBounds(273, 215, 117, 29);
		frame.getContentPane().add(btnViewMusic);
		
		
		
	}
}

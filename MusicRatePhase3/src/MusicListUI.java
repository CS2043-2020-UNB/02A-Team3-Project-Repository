import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MusicListUI {

	public JFrame frame;
	private JTextField textField;
	private LoginControl lc;
	private MusicListControl mc; 
	private ArrayList<MusicObject> sM;
	private DataManager dm;

	/**
	 * Create the application.
	 */
	public MusicListUI(DataManager dm, LoginControl lc) {
		this.lc = lc;
		this.mc = new MusicListControl(dm);
		this.dm = dm;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		sM=mc.handleMusicList();
		frame = new JFrame();
		frame.setTitle("Music List");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMusicNumber = new JLabel("Index Number:");
		lblMusicNumber.setBounds(60, 223, 104, 16);
		frame.getContentPane().add(lblMusicNumber);
		
		JLabel lblIndex = new JLabel("Index");
		lblIndex.setBounds(6, 6, 61, 16);
		frame.getContentPane().add(lblIndex);
		
		JLabel lblMusicTitile = new JLabel("Music Title");
		lblMusicTitile.setBounds(100, 6, 74, 16);
		frame.getContentPane().add(lblMusicTitile);
		
		String s="";
		for (int i=0; i<sM.size(); i++) {
			s+= (i+1) + "\t" + sM.get(i).mTitle + "\n";
		}
		JTextArea textArea = new JTextArea(s);
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(6, 34, 438, 177);
		frame.getContentPane().add(scrollPane);
		JLabel indexL = new JLabel("");
		indexL.setBounds(6, 256, 438, 16);
		frame.getContentPane().add(indexL);
		
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
							int index;
							try {
								index=Integer.parseInt(textField.getText())-1;
							}catch(Exception e){
								index=sM.size()+1;
							};
							if(index >= sM.size())
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
		btnViewMusic.setBounds(276, 218, 117, 29);
		frame.getContentPane().add(btnViewMusic);
		
	}
}

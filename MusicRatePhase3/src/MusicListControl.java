import java.util.ArrayList;
public class MusicListControl {

	private DataManager dm;
		
	public MusicListControl(DataManager dm) { 
		this.dm = dm;
	}
	public ArrayList<MusicObject> handleMusicList(){
		return dm.getMusicList();
	}
}

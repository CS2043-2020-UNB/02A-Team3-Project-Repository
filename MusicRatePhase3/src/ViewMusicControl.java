
import java.util.ArrayList;

public class ViewMusicControl {
	private DataManager dataManager = new DataManager();
	
	public ViewMusicControl(DataManager dm) { 
		this.dataManager = dm;
	}
	public static ArrayList<MusicObject> viewMusicHandle(int musicID){
		return dm.getMusicObjectByID(musicID);
	}
}

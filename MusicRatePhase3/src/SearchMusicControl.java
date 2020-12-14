import java.util.ArrayList;

public class SearchMusicControl {
	private DataManager dm;
	
	public SearchMusicControl(DataManager dm) { 
		this.dm = dm;
	}
	public ArrayList<MusicObject> handleSearchMusic(String string){
		return dm.getMusicObjectByName(string);
	}
}
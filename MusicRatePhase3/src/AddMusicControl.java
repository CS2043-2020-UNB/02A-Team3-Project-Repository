
public class AddMusicControl {
	private DataManager dm;
	
	public AddMusicControl(DataManager d) {
		this.dm = d; 
	}
	
	public void handleAddMusic(String title, String artist, String link) {										
		dm.addMusic(title, artist, link);		
	}
}

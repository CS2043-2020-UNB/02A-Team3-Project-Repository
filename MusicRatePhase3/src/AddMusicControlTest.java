import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddMusicControlTest {
	private DataManager dm;
	private AddMusicControl control;
	@BeforeEach
	void setUp() throws Exception {
		dm = new DataManager();
		control = new AddMusicControl(dm);
	}

	@Test
	void testhandleAddMusic() {
		
		
		control.handleAddMusic("i","j","k"); // add the music
		ArrayList<MusicObject> musicList = dm.getMusicList(); // get the music list
		MusicObject mobj = musicList.get(musicList.size() - 1); // create an object that is the last element (the music we just created)
		int t = 0;
		if ((mobj.mTitle.equals("i")) && (mobj.mArtist.equals("j")) && (mobj.mLink.equals("k")))
			t = 1;
		if (t==0)
			fail();
		
	}

}

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MusicListControlTest {
	private DataManager dm;
	private MusicListControl control;
	@BeforeEach
	void setUp() throws Exception {
		dm = new DataManager();
		control = new MusicListControl(dm);
	}

	@Test
	void testHandleMusicList() {
		ArrayList<MusicObject> returned = control.handleMusicList();
		ArrayList<MusicObject> expected = dm.getMusicList();
		
		for(int i = 0;i<returned.size();i++) {
			
			
			if (!returned.get(i).mTitle.equals(expected.get(i).mTitle))
				fail();
		}
	}
	
}

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class searchMusicControlTest {

	private DataManager dm;
    private SearchMusicControl control;
	
	@BeforeEach
    void setUp() throws Exception {
        dm = new DataManager();
        control = new SearchMusicControl(dm);
    }
    
    @Test
    void testSearchMusic() {
    	String name = "Willow";
    	ArrayList<MusicObject> returned = control.handleSearchMusic(name);
    	ArrayList<MusicObject> expected = dm.getMusicObjectByName(name);
        assertEquals(expected.size(), returned.size());
    }
    
    @Test
    void testSearchMusicFail() {
    	String name = "Nope";
    	ArrayList<MusicObject> returned = control.handleSearchMusic(name);
    	ArrayList<MusicObject> expected = dm.getMusicObjectByName(name);
        assertEquals(expected, returned);
    }
}

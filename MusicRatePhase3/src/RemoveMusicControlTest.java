//@author Cole Lightfoot
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeMusicControlTest {

	private DataManager dm;
    private RemoveMusicControl control;
    private LoginControl lc;
	
	@BeforeEach
    void setUp() throws Exception {
        dm = new DataManager();
        lc = new LoginControl(dm);
        lc.handleAdminLogin("mhussa", "Mon");
        control = new RemoveMusicControl(dm, lc);
    }
    
    @Test
    void testRemoveComment() {
    	dm.addMusic("Dark Side of The moon", "Pink Floyd", "https://idk.com");
    	
    	ArrayList<MusicObject> beforeL = dm.getMusicList();
    	int beSize = beforeL.size() - 1;
    	MusicObject before = beforeL.get(beSize);
    	System.out.println("before:\t" + before.mTitle);

    	control.handleRemoveMusic(before.mID);

    	ArrayList<MusicObject> afterL = dm.getMusicList();
    	int afSize = afterL.size() - 1;
    	MusicObject after = afterL.get(afSize);
    	System.out.println("after:\t" + after.mTitle);

    	boolean isSame = true; 
    	if(!before.mTitle.equals(after.mTitle)) {
    		isSame = false;
    	}
    	
        assertEquals(false, isSame);
    }

}

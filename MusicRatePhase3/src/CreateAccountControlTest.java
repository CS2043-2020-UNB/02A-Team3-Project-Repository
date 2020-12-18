//@author Cole Lightfoot
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class createAccountControlTest {

	private DataManager dm;
    private CreateAccountControl cac;
    private LoginControl lc;
	
	@BeforeEach
    void setUp() throws Exception {
        dm = new DataManager();
        lc = new LoginControl(dm);
        cac = new CreateAccountControl(dm, lc);
    }
    
    @Test
    void testCreateUser() {
    	String id = "bob32";
    	String pass = "secret";
    	
    	boolean existsA = true;
    	if(!dm.accountExist(id)) {
    		existsA = false;
    	}
    	
    	cac.handleCreateAccount(id, pass, "bob", "bob@bob.com", false);
    	
    	boolean existsB = false;
    	if(dm.accountExist(id)) {
    		existsB = true;
    	}

    	boolean worked = false; 
    	if(existsA == false && existsB == true) {
    		worked = true;
    	}
        assertEquals(true, worked);
    }
}

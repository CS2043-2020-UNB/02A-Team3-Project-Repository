//@author Cole Lightfoot
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeUserAccountControlTest {

	private DataManager dm;
    private CreateAccountControl cac;
    private RemoveUserAccountControl ruac;
    private LoginControl lc;
	
	@BeforeEach
    void setUp() throws Exception {
        dm = new DataManager();
        lc = new LoginControl(dm);
        cac = new CreateAccountControl(dm, lc);
        ruac = new RemoveUserAccountControl(dm, lc);

    }
    
    @Test
    void testRemoveUser() {
    	String id = "bob32";
    	String pass = "secret";
    	cac.handleCreateAccount(id, pass, "bob", "bob@bob.com", false);
    	lc.handleUserLogin(id, pass);
    	
    	boolean existsB = false;
    	if(dm.accountExist(id)) {
    		existsB = true;
    	}

    	ruac.handleRemoveUserAccount();

    	boolean existsA = true;
    	if(!dm.accountExist(id)) {
    		existsA = false;
    	}

    	boolean worked = false; 
    	if(existsA == false && existsB == true) {
    		worked = true;
    	}
        assertEquals(true, worked);
    }
}

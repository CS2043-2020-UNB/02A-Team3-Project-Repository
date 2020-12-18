import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LoginControlTest {
	
	private DataManager dm;
	private LoginControl control;

	@BeforeEach
	void setUp() throws Exception {
		dm = new DataManager();
		control = new LoginControl(dm);
	}

	@Test
	void testHandleUserLogin() {
		UserObject returned = control.handleUserLogin("abc", "P");
		UserObject expected = dm.getUserAccount("abc","P");
		assertEquals(expected, returned);
	}

	@Test
	void testHandleAdminLogin() {
		AdminObject returned = control.handleAdminLogin("mhussa", "Mon");
		AdminObject expected = dm.getAdminAccount("mhussa","Mon");
		assertEquals(expected, returned);
	}

}

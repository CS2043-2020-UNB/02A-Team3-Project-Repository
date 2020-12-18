import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddRatingControlTest {
	private DataManager dm;
	private LoginControl loginControl;
	private AddRatingControl control;

	@BeforeEach
	void setUp() throws Exception {
		dm = new DataManager();
		loginControl = new LoginControl(dm);
		control = new AddRatingControl(dm,loginControl);
	}
	//WARNING this test only works when you login with a user that has not given a rating
	//running this test twice will result in failure
	@Test
	void testHandleAddRatingCase1() {
		loginControl.handleUserLogin("mm", "mm");
		double x = dm.getMusicRating(5); //since there is no rating object we find the avg rating
		for (int i = 0;i<5;i++)  {   
			if (x != i) {
				control.handleAddRating(3, i+1);  //add a rating that is not the average
				break;
			}
		}
		double y = dm.getMusicRating(3);
		assertNotEquals(x, y);   //confirm that the average has changed due to the new rating
	}
	
	void testHandleAddRatingCase2() {
		double x = dm.getMusicRating(3); //since there is no rating object we find the avg rating
		for (int i = 0;i<5;i++)  {   
			if (x != i) {
				control.handleAddRating(3, i+1);  //add a rating that is not the average
				break;
			}
		}
		double y = dm.getMusicRating(3);
		assertNotEquals(x, y);   //confirm that the average has changed due to the new rating
	}

}

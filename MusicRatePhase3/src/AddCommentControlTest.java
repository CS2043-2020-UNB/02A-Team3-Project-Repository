import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AddCommentControlTest {
	
	private DataManager dm;
	private LoginControl loginControl;
	private AddCommentControl control;

	@BeforeEach
	void setUp() throws Exception {
		dm = new DataManager();
		loginControl = new LoginControl(dm);
		control = new AddCommentControl(dm,loginControl);
	}

	@Test
	void testHandleAddCommentCase1() {
		loginControl.handleUserLogin("mm", "mm");
		control.handleAddComment(3, "test comment"); //creating the comment
		ArrayList<CommentObject> commentList = dm.getComments(3); //getting the list of comments on music with mID = 5
		CommentObject cm = commentList.get(commentList.size() -1);
		int t = 0;
		if ((cm.mID == 3) && (cm.comment.equals("test comment")))
			t = 1;
		if (t==0)
			fail();
	
	}
	
	@Test
	void testHandleAddCommentCase2() {
		control.handleAddComment(5, "test123"); //creating the comment
		ArrayList<CommentObject> commentList = dm.getComments(3); //getting the list of comments on music with mID = 5
		CommentObject cm = commentList.get(commentList.size() -1);
		if ((cm.mID == 3) && (cm.comment.equals("test123")))
			fail(); //since they are not logged in it should fail if the comment is successfully added
	}

}

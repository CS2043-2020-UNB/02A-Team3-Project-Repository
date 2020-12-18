//@author Cole Lightfoot

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class removeCommentControlTest {

	private DataManager dm;
    private RemoveCommentControl control;
	
	@BeforeEach
    void setUp() throws Exception {
        dm = new DataManager();
        control = new RemoveCommentControl(dm);
    }
    
    @Test
    void testRemoveComment() {
    	int mID = 3;
    	dm.addComment(mID, "this music sucks!");
    	
    	ArrayList<CommentObject> beforeL = dm.getComments(mID);
    	int beSize = beforeL.size() - 1;
    	CommentObject before = beforeL.get(beSize);
    	System.out.println("before:\t" + before.comment);

    	control.handleRemoveComment(before.cID);

    	ArrayList<CommentObject> afterL = dm.getComments(mID);
    	int afSize = afterL.size() - 1;
    	CommentObject after = afterL.get(afSize);
    	System.out.println("after:\t" + after.comment);

    	
    	boolean isSame = true; 
    	if(!before.comment.equals(after.comment)) {
    		isSame = false;
    	}
        assertEquals(false, isSame);
    }
}

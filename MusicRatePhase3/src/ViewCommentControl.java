
import java.util.ArrayList;

public class ViewCommentControl {
	private DataManager dataManager = new DataManager();

	public ViewCommentControl(DataManager dm){
		this.dataManager = dm;
	}

	public static ArrayList<CommentObject> handleViewComment(int commentID){
		adminObject = LoginControl.getAdminObject();
		return dm.getCommentObject(commentID);
	}
}
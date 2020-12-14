
public class AddCommentControl {
	private DataManager dm;
	private LoginControl loginControl;
	private UserObject currentUser = null;
	
	public AddCommentControl(DataManager d, LoginControl lc) {this.dm = d; this.loginControl = lc;}
	
	public void handleAddComment(String comment) {
																		
		currentUser = loginControl.getUser();  // check if logged in
		String userId = currentUser.id;		 //
		
		dm.AddComment(comment);		 // add the comment to the database
	}
}


public class AddCommentControl {
	private DataManager dm;
	private LoginControl loginControl;
	
	public AddCommentControl(DataManager d, LoginControl lc) {
		this.dm = d; 
		this.loginControl = lc;
	}
	
	public boolean handleAddComment(int mID,String comment) {														
		if(loginControl.getUser()!=null) {
			dm.addComment(mID, comment);
			return true;
		}  
		return false;
	}
}

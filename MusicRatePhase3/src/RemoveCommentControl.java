
public class RemoveCommentControl {
	private DataManager dm;
	
	public RemoveCommentControl(DataManager d) {
		this.dm = d;
	}

	public void handleRemoveComment(int mID) {
			dm.removeComment(mID);
	}  

	
}

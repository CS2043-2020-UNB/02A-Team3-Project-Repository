
public class AddRatingControl {
	private DataManager dm;
	private LoginControl loginControl;
	private UserObject currentUser = null;
	
	public AddRatingControl(DataManager d, LoginControl lc) {
		this.dm = d; 
		this.loginControl = lc;}
	
	public boolean handleAddRating(int mID,int rate) { 
																		
		currentUser = loginControl.getUser();
		if(currentUser!=null) {
			if(!dm.checkRating(mID, currentUser.uID)) {
				String userId = currentUser.uID;
				dm.addRating(mID, currentUser.uID, rate);
				return true;
			}
		}
		return false;		 
	}
}

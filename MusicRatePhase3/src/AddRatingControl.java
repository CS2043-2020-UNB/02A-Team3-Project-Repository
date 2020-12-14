
public class AddRatingControl {
	private DataManager dm;
	private LoginControl loginControl;
	private UserObject currentUser = null;
	
	public AddRatingControl(DataManager d, LoginControl lc) {
		this.dm = d; 
		this.loginControl = lc;}
	
	public void handleAddRating(String rating) { 
																		
		currentUser = loginControl.getUser();  
		String userId = currentUser.id;		 
		
		dm.AddRating(rating);		 
	}
}

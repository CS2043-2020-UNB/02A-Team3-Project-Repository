
public class RemoveUserAccountControl {
	private DataManager dm;
	private LoginControl loginControl;
	private UserObject currentUser = null;
	
	public RemoveUserAccountControl(DataManager d, LoginControl lc) {this.dm = d; this.loginControl = lc;}
	
	public void handleRemoveUserAccount() { 
																		
		currentUser = loginControl.getUser();  // check if logged in
		String userId = currentUser.id;		 //
		
		dm.RemoveUserAccount(userId);		 // remove the account
	}
}


public class RemoveUserAccountControl {
	private DataManager dm;
	private LoginControl loginControl;
	private UserObject currentUser;
	
	public RemoveUserAccountControl(DataManager d, LoginControl lc) {
		this.dm = d; 
		this.loginControl = lc;
	}
	
	public boolean handleRemoveUserAccount() { 
																		
		currentUser = loginControl.getUser();
		if(currentUser!=null) {// check if logged in
			String userId = currentUser.uID;		 //
			dm.removeUser(userId);		 // remove the account
			return true;
		}
		return false;
	}
}

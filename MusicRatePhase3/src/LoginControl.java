public class LoginControl {
	private DataManager dm;
	private UserObject currentUser = null;
	private AdminObject currentAdmin = null;
	
	public LoginControl(DataManager d) {
		this.dm = d;
	}
	
	public UserObject handleUserLogin(String userId, String password) {
		currentUser = dm.getUserAccount(userId, password);
		return currentUser;
	}
	
	public AdminObject handleAdminLogin(String userId, String password) {
		currentAdmin = dm.getAdminAccount(userId, password);
		return currentAdmin;
	}
	
	public UserObject getUser() {
		return currentUser;
	}
	
	public AdminObject getAdmin() {
		return currentAdmin;
	}
}

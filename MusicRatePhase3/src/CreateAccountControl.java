
public class CreateAccountControl {
	private DataManager dm;
	private LoginControl loginControl;
	
	public CreateAccountControl(DataManager d, LoginControl lc) {
		this.dm = d; 
		this.loginControl = lc;
	}
	
	public boolean handleCreateAccount(String ID, String password,String name,String email, boolean login) { 
		if(loginControl.getUser()==null	) {															 
			if(dm.accountExist(ID)==false) {
				dm.addUser(ID,password,name,email);
				if (login == true) {
					loginControl.handleUserLogin(ID,password);
				}
				return true;
			}
			return false;
		}
		return false;
	}
}
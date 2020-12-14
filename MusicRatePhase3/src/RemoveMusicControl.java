
public class RemoveMusicControl {
	private DataManager dm;
	private LoginControl loginControl;
	private AdminObject currentAdmin = null;
	
	public RemoveMusicControl(DataManager d, LoginControl lc) {this.dm = d; this.loginControl = lc;}
	
	public void handleRemoveMusic(String link) { 
																		
		currentAdmin = loginControl.getAdmin();  
		String adminId = currentAdmin.id;		 
		
		dm.RemoveMusic(link);		 
	}
}

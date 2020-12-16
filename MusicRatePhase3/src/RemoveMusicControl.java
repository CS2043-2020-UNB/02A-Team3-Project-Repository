
public class RemoveMusicControl {
	private DataManager dm;
	private LoginControl loginControl;
	
	public RemoveMusicControl(DataManager d, LoginControl lc) {
		this.dm = d; 
		this.loginControl = lc;
	}
	
	public boolean handleRemoveMusic(int mID) { 
																		
		if(loginControl.getAdmin()!=null) {
			dm.removeMusic(mID);
			return true;
		}		 
		return false;	 
	}
}

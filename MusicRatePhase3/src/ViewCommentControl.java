public class ViewCommentControl {
	private LoginControl lc;
	public ViewCommentControl(LoginControl lc){
		this.lc=lc;
	}
	
	public boolean handleViewComment(){
		if(lc.getAdmin()!=null)
			return false;
		return false;
	}
}
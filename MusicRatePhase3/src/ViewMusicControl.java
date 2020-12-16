public class ViewMusicControl {
	private DataManager dataManager;
	
	public ViewMusicControl(DataManager dm) { 
		this.dataManager = dm;
	}
	public MusicObject viewMusicHandle(MusicObject mObj){
		mObj.mCmnt=dataManager.getComments(mObj.mID);
		mObj.mRatings=dataManager.getMusicRating(mObj.mID);
		return mObj;
	}
}

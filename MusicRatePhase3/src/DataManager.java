import java.sql.*;
import java.util.*;
public class DataManager {
	private UserObject U=new UserObject();
	private AdminObject A=new AdminObject();
	Connection connection = null;
	
	public DataManager() {
		try {
	        Class.forName("com.mysql.jdbc.Driver");
	    }catch (Exception e) {
	    	System.err.println(e.toString());
	    }
		
		String url = "jdbc:mysql://cs2043.cs.unb.ca:3306/cs204302ateam3"; 
		
		try {
			connection = DriverManager.getConnection(url, "cs204302ateam3", "1ObEH2JI");
		}catch (SQLException e) {
			System.err.println("Database connection error.");
		}
	}
	public UserObject getUserAccount(String ID, String password) {
		try {
			U.uID=null;
			Statement st = connection.createStatement();
			String sqlQuery = "select * from User where Id = '" + ID + "' AND Password = sha1('"+ password+"');";
			ResultSet rs = st.executeQuery(sqlQuery);
			while(rs.next()) {
				U.uID = rs.getString(1);
				U.uName = rs.getString(2);
				U.email = rs.getString(4);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
		if(U.uID==null) return null;
		return U;
	}
	
	public AdminObject getAdminAccount(String ID, String password) {
		try {
			A.aID=null;
			Statement st = connection.createStatement();
			String sqlQuery = "select * from Admin where Id = '" + ID + "' AND Password = sha1('"+ password+"');";
			ResultSet rs = st.executeQuery(sqlQuery);
					while(rs.next()) {
						A.aID = rs.getString(1);
						A.aName = rs.getString(2);
					}
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
		if(A.aID==null)return null;
		else return A;
	}
	
	public void addUser(String ID, String password,String name, String email) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("insert into User Values ('"+ ID + "','"+name+"',sha1('" + password + "'),'"+email+"');");
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
	}
	public boolean accountExist(String ID) {
		try {
			Statement st = connection.createStatement();
			String sqlQuery = "select * from User where Id = '" + ID + "';";
			ResultSet rs = st.executeQuery(sqlQuery);
			while(rs.next()) {
					return true;
			}
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
		return false;
	}
	public void addMusic(String title, String artist, String link) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("insert into Music Values (NULL,'"+ title + "','"+artist+"','"+link+"');");
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
	}
	public void removeMusic(int mID) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("delete from Music where MusicID =  "+ mID +";");
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
	}
	public void addComment(int mID, String comment) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("insert into Comment Values (NULL,'"+ mID + "','"+comment+"');");
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
	}
	public void removeComment(int mID) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("delete from Comment where CID = '"+ mID + "';");
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
	}
	public ArrayList<MusicObject> getMusicObjectByName(String string) {
		ArrayList<MusicObject> musicList = new ArrayList<MusicObject>();
		try {
			Statement st = connection.createStatement();
			String sqlQuery = "select * from Music where ";
			sqlQuery = sqlQuery + "MusicTitle like '%" + string + "%';";
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				MusicObject music = new MusicObject();
				music.mID = rs.getInt(1);
				music.mTitle = rs.getString(2);
				music.mArtist = rs.getString(3);
				music.mLink = rs.getString(4);
				musicList.add(music);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getMusicObjectByName: " + e);
		}
		
		return musicList;
	}
	public ArrayList<MusicObject> getMusicList() {
		ArrayList<MusicObject> musicList = new ArrayList<MusicObject>();
		try {
			Statement st = connection.createStatement();
			String sqlQuery = "select * from Music";
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				MusicObject music = new MusicObject();
				music.mID = rs.getInt(1);
				music.mTitle = rs.getString(2);
				music.mArtist = rs.getString(3);
				music.mLink = rs.getString(4);
				musicList.add(music);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getMusicObjectByName: " + e);
		}
		
		return musicList;
	}
	public ArrayList<CommentObject> getComments(int mID) {
		ArrayList<CommentObject> commentList = new ArrayList<CommentObject>();
		try {
			Statement st = connection.createStatement();
			String sqlQuery = "select * from Comment where MID = '" + mID + "';";
			ResultSet rs = st.executeQuery(sqlQuery);
			while (rs.next()) {
				CommentObject cm = new CommentObject();
				cm.cID = rs.getInt(1);
				cm.mID = rs.getInt(2);
				cm.comment = rs.getString(3);
				commentList.add(cm);
			}
		} catch (SQLException e) {
			System.err.println("SQL error: getComments: " + e);
		}
		
		return commentList;
	}
	
	public boolean checkRating(int mID, String uID) {
		try {
			Statement st = connection.createStatement();
			String sqlQuery = "select * from Rating where Music_ID = " + mID + " AND User_ID = '"+uID+"';";
			ResultSet rs = st.executeQuery(sqlQuery);
			while(rs.next()) {
					return true;
			}
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
		return false;
	}
	
	public void addRating(int mID, String uID,int rating) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("insert into Rating Values ("+ mID + ",'"+uID+"' , "+rating+");");
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
	}
	
	public void removeUser(String uID) {
		try {
			Statement st = connection.createStatement();
			st.executeUpdate("delete from User where Id = '"+ uID + "';");
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
	}
	
	public double getMusicRating(int mID) {
		double d=0;
		try {
			Statement st = connection.createStatement();
			String sqlQuery = "select AVG(Rating) from Rating  where Music_ID = " + mID + ";";
			ResultSet rs = st.executeQuery(sqlQuery);
				while(rs.next()) {
					d=rs.getDouble(1);
				}
				
		} catch (SQLException e) {
			System.err.println("SQL error: Unable to get Results" + e);
		}
		return (((int)(d*100))*1.0)/100.0;
	}
	
}

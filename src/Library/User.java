package Library;

public class User {
	
	private String user;
	private int userId;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public User(String user, int userId) {
		super();
		this.user = user;
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "User [user=" + user + ", userId=" + userId + "]";
	}
	
	
}

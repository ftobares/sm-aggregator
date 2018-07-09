package ar.com.ftobares.backendsm.model;

import java.util.List;

public class UserAggregator {
	
	private Long userId;
	
	private String userName;
	
	private String twitterAccount;
	

	//FIXME
	private String password;
	
	private List<Board> boards;
	
	public UserAggregator (String userName){
		this.userId = 1L;
		this.userName = userName;
		this.twitterAccount = "default";
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTwitterAccount() {
		return twitterAccount;
	}

	public void setTwitterAccount(String twitterAccount) {
		this.twitterAccount = twitterAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Board> getBoards() {
		return boards;
	}

	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}	
}

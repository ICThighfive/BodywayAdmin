package member.model.vo;

import java.sql.Date;

public class User {
	
	private String userId;
	private String userName;
	private String userPwd;
	private int userNo;
	private char gender;
	private int userAge;
	private String userPhone;
	private String userEmail;
	private double userHeight;
	private String userInterests;
	private String userOriginalPhoto;
	private String userRenamePhoto;
	private java.sql.Date lastLoginDate;
	private java.sql.Date penaltyDate;
	private int penaltyCount;
	
	public User(){}

	public User(String userId, String userName, String userPwd, int userNo, char gender, int userAge, String userPhone,
			String userEmail, double userHeight, String userInterests, String userOriginalPhoto, String userRenamePhoto,
			Date lastLoginDate, Date penaltyDate, int penaltyCount) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userNo = userNo;
		this.gender = gender;
		this.userAge = userAge;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userHeight = userHeight;
		this.userInterests = userInterests;
		this.userOriginalPhoto = userOriginalPhoto;
		this.userRenamePhoto = userRenamePhoto;
		this.lastLoginDate = lastLoginDate;
		this.penaltyDate = penaltyDate;
		this.penaltyCount = penaltyCount;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public double getUserHeight() {
		return userHeight;
	}

	public void setUserHeight(double userHeight) {
		this.userHeight = userHeight;
	}

	public String getUserInterests() {
		return userInterests;
	}

	public void setUserInterests(String userInterests) {
		this.userInterests = userInterests;
	}

	public String getUserOriginalPhoto() {
		return userOriginalPhoto;
	}

	public void setUserOriginalPhoto(String userOriginalPhoto) {
		this.userOriginalPhoto = userOriginalPhoto;
	}

	public String getUserRenamePhoto() {
		return userRenamePhoto;
	}

	public void setUserRenamePhoto(String userRenamePhoto) {
		this.userRenamePhoto = userRenamePhoto;
	}

	public java.sql.Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(java.sql.Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public java.sql.Date getPenaltyDate() {
		return penaltyDate;
	}

	public void setPenaltyDate(java.sql.Date penaltyDate) {
		this.penaltyDate = penaltyDate;
	}

	public int getPenaltyCount() {
		return penaltyCount;
	}

	public void setPenaltyCount(int penaltyCount) {
		this.penaltyCount = penaltyCount;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPwd=" + userPwd + ", userNo=" + userNo
				+ ", gender=" + gender + ", userAge=" + userAge + ", userPhone=" + userPhone + ", userEmail="
				+ userEmail + ", userHeight=" + userHeight + ", userInterests=" + userInterests + ", userOriginalPhoto="
				+ userOriginalPhoto + ", userRenamePhoto=" + userRenamePhoto + ", lastLoginDate=" + lastLoginDate
				+ ", penaltyDate=" + penaltyDate + ", penaltyCount=" + penaltyCount + "]";
	}
	
	

}

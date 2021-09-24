package c02co.yedam.member;
enum Grade{
	SPECIAL, SUPER, MID, GUEST
}
public class User {
	//사용자아이디, 사용자비밀번호, 사용자이름, 등급, 나이
	private String userId;
	private String userPw;
	private String userName;
	private Grade grade;
	private int userAge;
	
	
	//생성자
	public User() {}
	public User(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}
	
	
	public User(String userId, String userPw, String userName, Grade grade, int userAge) {
		this(userId,userPw); // 위 생성자에 만들어놔서
		this.userName = userName;
		this.grade = grade;
		this.userAge = userAge;
	}
	
	
	//메소드
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", grade=" + grade
				+ ", userAge=" + userAge + "]";
	}
	
	
	public void showInfo() {
		System.out.printf("User [userId:%s , userPw:%s, userName:%s, grade:%s,, userAge:%d ]\n",userId,userPw,userName, grade,userAge);
	}
}

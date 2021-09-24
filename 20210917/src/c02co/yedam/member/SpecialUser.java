package c02co.yedam.member;

public class SpecialUser extends User {
	private int point;



	public SpecialUser(String userId, String userPw, String userName, Grade grade, int userAge) {
		super(userId, userPw, userName, grade, userAge);
		// TODO Auto-generated constructor stub
	}
	
	public SpecialUser(String userId, String userPw, String userName, Grade grade, int userAge, int point) {
		super(userId, userPw, userName, grade, userAge);
		this.point=point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public void showInfo() {
		System.out.printf("User [userId:%s , userPw:%s, userName:%s, grade:%s,, userAge:%d, point:%d ]\n",super.getUserId(),super.getUserPw(),super.getUserName(), super.getGrade(),super.getUserAge(),point);
	}
	

	
	
}

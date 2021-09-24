package c02co.yedam.member;

public class UserExample {

	public static void main(String[] args) {
		User user1 = null; //null값으로 초기화
		user1 = new User("user1","1234");
		user1.setUserAge(20);
		user1.setUserName("사용자");
		user1.setGrade(Grade.SPECIAL);
		
		user1.getUserId();
		user1.getUserPw();
		
		
		User user2 = new User("user2","5555","상용자2",Grade.SUPER,30);
		String name = user2.getUserName();
		int age = user2.getUserAge();
		Grade grade = user2.getGrade();
		
		
		if(name.equals("상용자2")) {
			user2.setGrade(Grade.SUPER);
		}
		if(age>=20) {
			user2.setGrade(Grade.SPECIAL);
		}
		if(grade == Grade.MID) {
			user2.setGrade(grade);
		}
		
		System.out.println(user2.toString());
		user2.showInfo();
		
		
		User user3 = new SpecialUser("user2","5555","상용자2",Grade.SUPER,30,60);
		user3.showInfo();
		
		SpecialUser user4 =(SpecialUser)user3;
		user4.showInfo();


	}

}

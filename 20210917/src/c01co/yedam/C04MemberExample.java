package c01co.yedam;

public class C04MemberExample {

	public static void main(String[] args) {
		C03Member m1 = new C03Member();
		m1.memberId = 10;
		m1.name = "김연경";
		m1.phone = "010-1111-2222";

		C03Member m2 = new C03Member();
		m2.memberId = 4;
		m2.name = "김희진";
		m2.phone = "010-4444-4444";

		C03Member m3 = new C03Member();
		m3.memberId = 11;
		m3.name = "김수지";
		m3.phone = "010-1111-1111";

		C03Member[] members = { m1, m2, m3 };
		for(C03Member m : members) {
			m.showInfo();
//			System.out.println("아이디: "+ m.memberId);
//			System.out.println("이름: "+m.name);
//			System.out.println("연락처: "+m.phone);
		}
		
//		m1 ==> members[0]
		m1.name="양효진";
		members[0].phone ="010-5555-6666";

	}

}

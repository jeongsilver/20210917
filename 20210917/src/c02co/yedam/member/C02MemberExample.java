package c02co.yedam.member;

public class C02MemberExample {

	public static void main(String[] args) {
		C01Member m1 = new C01Member("user1","박미림","대구 중구 내일동");
		m1.showInfo();
		
//		m1.userID = "user1";
		m1.setMemberId("user1");
		
//		m1.name = "Hong";
		m1.setName("홍");
//		m1.address = "남일동";
		m1.setAddress("남일동");
		System.out.println("아이디: "+m1.getuserID());
		
		System.out.println("아이디: "+m1.getName());
		
		System.out.println("아이디: "+m1.getAddress());
	
	
		
		C01Member m2 = new C01Member("user2");
		m2.showInfo();
		
		m1.setMemberId("user4");
		m1.setName("이정은");
		m1.setAddress("하대원동");
		System.out.println("아이디: "+m1.getuserID());
		System.out.println("이름: "+m1.getName());
		System.out.println("주소: "+m1.getAddress());
		
		C01Member m3 = new C01Member("user3","김연경","경기도");
		m3.showInfo();
//		m3.name = "박길동";
		m3.setName("박길동");
		m3.showInfo();
		

	}

}

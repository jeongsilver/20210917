package c07co.yedam.inherit;

public class C03Example {
	public static void main(String[] args) {
		C01People p1 = new C01People("Hong","202000101-1234567");
		System.out.println("이름: "+p1.getName());
		System.out.println("번호: "+p1.getSsn());
		p1.showInfo();
		System.out.println("p1.toString:"+p1.toString());
		
		C02Student s1 = new C02Student("Park","2021545-4545545");
		System.out.println("이름: "+s1.getName());
		System.out.println("번호: "+s1.getSsn());
		s1.showInfo();
		System.out.println("s1.toString:"+s1.toString());
		
		C02Student s2 = new C02Student("Choi","20202-1251545",110);
		System.out.println("이름: "+s2.getName());
		System.out.println("번호: "+s2.getSsn());
		System.out.println("학생번호: "+ s2.getStudentNo());
		s2.showInfo();
		
		C01People p2 = new C02Student("Hwang","20210303-1234567",120); //자식 클래스는 부모 타입에 할당 될 수 있다
//		p1 = new C02Student("Hwang","20210303-1234567",120);
		
//		C02Student s3 = new C01People(); 자식타입에 부모클래스를 할당할 수 없다
//		p2.getStudentNo(); -> 부모 클래스 변수에 자식클래스에 메소드 호출 불가능
		
		if(p2 instanceof C02Student) {
			C02Student s3 = (C02Student) p2; //강제형변환
			s3.getStudentNo();
			
		}
		if(p1 instanceof C02Student) {
			C02Student s4 = (C02Student) p1;
			s4.getStudentNo();
		} else {
			System.out.println("형변환 할 수 없습니다");
		}
		
	}
}

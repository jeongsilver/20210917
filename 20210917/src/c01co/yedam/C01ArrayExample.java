package c01co.yedam;

public class C01ArrayExample {

	public static void main(String[] args) {
		int[] intAry = { 1, 2, 3 };
		String[] strAry = { "Hello", "World" };

		C02Student s1 = new C02Student(); // name, score 저장 공간
		s1.name = "홍길동";
		s1.score = 80;

		C02Student s2 = new C02Student();
		s2.name = "김민수";
		s2.score = 90;
		
		System.out.println("s1학생이름:"+s1.name);
		System.out.println("s1학생점수:"+s1.score);
		
		C02Student s3 = new C02Student();
		s3.name = "최지우";
		s3.score = 85;
		
		
		C02Student[] students = {s1,s2,s3};
		System.out.println("배열의 첫번째 이름: "+students[0].name);
		System.out.println("배열의 첫번째 점수: "+students[0].score);
		
		
		System.out.println("배열의 두번째 이름: "+students[1].name);
		System.out.println("배열의 두번째 점수: "+students[1].score);

		s1.name = "박길동";
		s1.score = 70;
		
		for(int i=0; i<students.length;i++) {
			System.out.println("학생이름: "+students[i].name);
			System.out.println("학생이름: "+students[i].score);
		}
	}

}

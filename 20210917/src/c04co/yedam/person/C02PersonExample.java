package c04co.yedam.person;

public class C02PersonExample {

	public static void main(String[] args) {
		// p1,p2,p3 변수선언
		C01Person p1 = new C01Person("이정은", 181.8, 69.7, 10,"O");
		C01Person p2 = new C01Person("조은솔", 192.4, 58.9, 12,"AB");
		C01Person p3 = new C01Person("김삼이", 175.8, 71.4, 11,"B");

		// family=> 가족정보(이름, 혈액형, 나이)
		C01Person[] family = { p1, p2, p3 };
		for (int i = 0; i < family.length; i++) {
				System.out.println("이름: "+family[i].getName()+" 혈액형: "+family[i].getBlood()+" 나이: "+family[i].getAge());
		}
		System.out.println("끝1");

		// 키가 165이상 가족만 출력(이름, 키, 몸무게) : 끝2
		
		for(int i=0;i<family.length;i++) {
			if(family[i].getHeight()>165) {
				System.out.println("이름: "+family[i].getName()+" 키: "+family[i].getHeight()+" 몸무게: "+family[i].getWeight());
				
			}
		}
		System.out.println("끝2");

		// family => 혈액형이 AB형인 가족만 출력(이름, 혈액형) : 끝3
		
		for(int i=0;i<family.length;i++) {
			if(family[i].getBlood().equals("AB")) {
				System.out.println("이름 :"+family[i].getName()+" 혈액형: "+family[i].getBlood() );
			}
		}
		System.out.println("끝3");
		// P3=>AB로 변경
	}

}

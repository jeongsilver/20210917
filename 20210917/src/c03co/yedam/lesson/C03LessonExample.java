package c03co.yedam.lesson;
/*
 * 실행클래스 + 라이브러리용클래스 여러개 => 프로그램 구성
 * 객체구성(학생, 선생님, 반) => 객체지향언어
 * 학생(객체) -> 학생(클래스)
 * 김소영 ->  new 학생(): 인스턴스
 * 
 */

public class C03LessonExample {
	public static void main(String[] args) {
		C01Teacher t1 = new C01Teacher("홍길동", "국사");
		
		C02Student s1 = new C02Student("이정은","010-1111","경산");
		C02Student s2 = new C02Student("김연경","010-1111","대구");
		
		
		//선생님 - 학생1, 학생2, 학생3
		C04Lesson l1 = new C04Lesson();
		l1.setTeacher(t1);
		l1.setGroup("3학년 1반");
		l1.addStudent(s1);
		l1.addStudent(s2);
		
		
		C01Teacher t2 = l1.getTeacher();
		System.out.println("선생님이름: "+t2.getName());
		System.out.println("선생님과목: "+l1.getTeacher().getMajor());
		
		l1.showStudents();
	}

}

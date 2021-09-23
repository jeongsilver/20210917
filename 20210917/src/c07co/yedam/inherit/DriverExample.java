package c07co.yedam.inherit;
/*
 * Bus,Taxi -> Vehicle
 */

public class DriverExample { //메인메서드

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		Driver driver = new Driver();
		//다형성
		driver.drive(v); //Vehicle
		driver.drive(t);
		driver.drive(b); 

//		345p 317p 싱글톤, 다형성, 추상클래스, 인터페이스
		
		
		// static
//		프로그램에 메모리 할당이 되어야 실행이 됨 
//		객체 선언하는 것을 instance,가 생성이 되어서 메모리에 생성되어 실체에 올린거임
//		new라는 키워드로 물리상 존재
//		static 타입은 필드, 메서드는 이미 메모리에 존재한다. instance를 선언하면서 클래스를 읽는 중에
//		이미 사용할 준비가 되어있음 
//		static은 클래스가 선언되고 메모리값을 차지하느냐, instance(new라는 키워드)를 통해서 메모리를 읽어 메소드를 만드냐 차이
//		instance <-> static
	}

}

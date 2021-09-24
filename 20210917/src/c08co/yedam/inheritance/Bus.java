package c08co.yedam.inheritance;

import c07co.yedam.inherit.Vehicle;

public class Bus extends Vehicle {

	public Bus() {
		super("msg");
	}
	
	
	
	@Override
	protected void run() { //protected는 상속 받으면 쓸 수 있음, defualt는 안됨
		System.out.println("버스가 달립니다.");
//		super.run();
	}

	@Override
	public void stop() {
		super.stop();
	}
	
	

	
}

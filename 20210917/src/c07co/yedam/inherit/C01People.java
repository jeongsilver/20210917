package c07co.yedam.inherit;
/*
 * 상속: 부모 -> 자식
 */

public class C01People {

	private String name;
	private String ssn;
	
	public C01People() {
		
	}
	
	public C01People(String name, String ssn) {
		this.name=name;
		this.ssn=ssn;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getSsn() {
		return ssn;
	}
	public void showInfo() {
		System.out.println("이름: "+name+", 주민번호 "+ssn);
	}

	@Override
	public String toString() {
		return "C01People [name=" + name + ", ssn=" + ssn + "]";
	}
	
	
	
}

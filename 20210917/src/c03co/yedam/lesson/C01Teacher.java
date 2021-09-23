package c03co.yedam.lesson;

/*
 * 이름, 과목
 */
public class C01Teacher {

	private String name;
	private String major;
	
	
	//new Teacher(); => 공간 만드는 걸 인스턴스 생성
	public C01Teacher(String name, String major) {
		this.name=name;
		this.major=major;
	}
	


	//메소드
	public void setName(String name) {
		this.name=name;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getMajor() {
		return this.major;
	}
}

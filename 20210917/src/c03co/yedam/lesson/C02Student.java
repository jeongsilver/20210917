package c03co.yedam.lesson;
/*
 *  학생이름, 연락처, 학생주소
 */

public class C02Student {

	private String studentName;
	private String phone;
	private String address;
	
	public C02Student(String name, String phone,String address) {
		this.studentName=name;
		this.phone=phone;
		this.address=address;
	}
	
	public void setStudentName(String name) {
		this.studentName=name;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	public String getPhone() {
		return this.phone;
	}
	public String getAddress() {
		return this.address;
	}
}

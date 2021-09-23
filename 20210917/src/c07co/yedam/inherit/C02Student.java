package c07co.yedam.inherit;

/*
 * People 상속 Student
 * 자식 extends 부모 
 */
public class C02Student extends C01People {
	private int studentNo;

	C02Student(String name, String ssn) {
		super(name, ssn);
	}

	C02Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

	public int getStudentNo() {
		return studentNo;
	}

	// override
	@Override
	public void showInfo() {
		System.out.println("Name: " + super.getName() + ", SSN: " + this.getSsn() + ",SNO: " + this.getStudentNo());
//		super.showInfo();
	}

	// Student -> People -> Object
	@Override
	public String toString() {
		return "학생 [이름 " + this.getName()//
				+ " 주민번호 " + this.getSsn() //
				+ " 학번 " + this.getStudentNo() + "" + "]";
	}

}

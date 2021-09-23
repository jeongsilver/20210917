package c03co.yedam.lesson;

public class C04Lesson {
	private C01Teacher teacher;
	private String group; // 3학년 1반
	private C02Student[] students;

	public C04Lesson() {
		students = new C02Student[3];
	}

	public void setTeacher(C01Teacher teacher) {
		this.teacher = teacher;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public void addStudent(C02Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public C01Teacher getTeacher() {
		return this.teacher;
	}

	public String getGroup() {
		return this.group;
	}

	public void showStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				System.out.println("이름: " + students[i].getStudentName() + "연락처: " + students[i].getPhone() + "주소: "
						+ students[i].getAddress());
			}
		}
	}
}

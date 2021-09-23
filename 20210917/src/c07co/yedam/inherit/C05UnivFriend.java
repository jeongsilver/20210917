package c07co.yedam.inherit;

public class C05UnivFriend extends C04Friend {
	private String major;
	
	public C05UnivFriend(String name, String phone, String major) {
		super(name,phone);
		this.major=major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "C05UnivFriend [name=" + this.getName() + ", phone=" + this.getPhone() +"major=" + major + "]";
	}
	
	
	
}

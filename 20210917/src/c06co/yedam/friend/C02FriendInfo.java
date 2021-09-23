package c06co.yedam.friend;

public class C02FriendInfo {

	private String name;
	private int age;
	private double height;
	private String phone;
	private String email;
	
	public C02FriendInfo(String name, int age, double height, String phone, String email){
		this.name=name;
		this.age = age;
		this.height=height;
		this.phone=phone;
		this.email=email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void showInfo() {
		System.out.printf("친구이름:%s, 친구나이:%d, 친구 키:%.1f, 친구 연락처:%s, 친구 이메일:%s\n",name, age, height, phone, email);
	}

	
	
	
}

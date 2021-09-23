package c07co.yedam.inherit;

public class C06CompFriend extends C04Friend{

	private String depart;
	
	public C06CompFriend(String name, String phone, String depart) {
		super(name,phone);
		this.depart=depart;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	@Override
	public String toString() {
		return "C06ComFriend [name=" + this.getName() + ", phone=" + this.getPhone() +",depart=" + depart + "]";
	}
	
	
	
}

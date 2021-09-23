package c02co.yedam.member;

public class C01Member {
	//user1(아이디), 홍길동(이름), 주소
	private String userID; //다른클래스에서 쓰지 못함
	private String name;
	private String address;
	
	
	//생성자 : 필드에 값을 초기화
	
	public C01Member() {
		userID = "user1";
		name = "김희진";
		address ="대구 중구 내일동";
	}
	
	public C01Member(String mID){
		userID = mID;
	}
	
	public C01Member(String mID, String n, String a){
		userID =  mID;
		name = n;
		address = a;
	}
	
	
	
	//private 때문에 만드는 메소드
	
	public void setMemberId(String mID) {
		userID = mID;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAddress(String a) {
		address=a;
	}
	
	public String getuserID() {
		return userID;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	// 메소드
	public void showInfo() {
		System.out.println("아이디: "+userID+" 이름 :"+name+" 주소 :"+address);
	
	}
	
	public void showMemberId() {
		System.out.println("아이디: "+userID);
	}
	
	public void showName() {
		System.out.println("이름: "+name);
	}
	
	public void showAddress() {
		System.out.println("주소: "+address);
	}
	
}

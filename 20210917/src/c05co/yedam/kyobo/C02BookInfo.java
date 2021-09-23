package c05co.yedam.kyobo;

public class C02BookInfo {

	private String bookName;
	private String author;
	private String press;
	private int price;
	
	
	//생성자
	public C02BookInfo() {
		
	}
	public C02BookInfo(String bookName, String author, String press, int price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.price = price;
	}
	
	
	
	//메소드
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.printf("[책제목:%s, 저자: %s, 출판사: %s, 가격: %d]\n",bookName,author,press,price);
	}
}

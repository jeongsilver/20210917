package c04co.yedam.person;
/*
 * 이름, 키, 몸무게, 혈액형,  
 */
public class C01Person {
	
	private String name;
	private double height;
	private double weight;
	private int age;
	
	private String blood;
	
	public C01Person(String name, double height, double weight, int age, String blood) {
		this.name=name;
		this.height=height;
		this.weight=weight;
		this.age=age;
		this.blood=blood;
	}
	
	public C01Person(String n, String blood, double weight) {
		this.name=n;
		this.blood=blood;
		this.weight=weight;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setBlood(String blood) {
		this.blood=blood;
	}
	
	public String getName() {
		return this.name;
	}
	public double getHeight() {
		return this.height;
	}
	public double getWeight() {
		return this.height;
	}
	public int getAge() {
		return this.age;
	}
	public String getBlood() {
		return this.blood;
	}


}



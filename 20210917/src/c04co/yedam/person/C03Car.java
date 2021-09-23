package c04co.yedam.person;

public class C03Car {
	// 필드
	String carName;
	String carModel;
	int carPrice;
	private int maxSpeed;
	private C04Tire tire;

	// 생성자

	public C03Car(String carName, String carModel, int carPrice, int maxSpeed, C04Tire tire) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
		this.tire = tire;
	}
	
	
	

	// 메소드
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public C04Tire getTire() {
		return tire;
	}

	public void setTire(C04Tire tire) {
		this.tire = tire;
	}



}

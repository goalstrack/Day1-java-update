package InheritanceExample;

public class ElectronicDevices {
	private int power;
	private String model;
	private int price;
	public ElectronicDevices(int power) {
		super();
		this.power = power;
	}

	public ElectronicDevices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void adjustPower(int incr)
	{
		this.power+=incr;
		System.out.println("Incremented power is : "+this.power);
	}
	
}

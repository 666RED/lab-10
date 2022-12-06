package exercise1;

public class Car extends Vehicle{
	private String modelName;
	
	public Car(String brandName, String modelName) {
		super.setBrand(brandName);
		this.setModel(modelName);
	}
	
	public void setModel(String modelName) {
		this.modelName = modelName;
	}
	
	public String getModel() {
		return modelName;
	}
}

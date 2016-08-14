package net.strangled.maladan;

public class Car {

	private String model;


	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("911") || validModel.equals("carrera")) {
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}

}

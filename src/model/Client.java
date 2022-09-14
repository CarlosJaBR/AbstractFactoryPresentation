package model;

public class Client {

	public AbstractFactory afX;
	public AbstractFactory afY;
	
	public Client() {
		
		afX = new ConcreteFactoryX();
		afY = new ConcreteFactoryY();
	}
	
	public String infoFactoryX() {
		return afX.createSkate().infoSkate()+"\n"+" and "+afX.createBicycle().infoBicycle();
	}
	public String infoFactoryY() {
		return afY.createSkate().infoSkate()+"\n"+" and "+afY.createBicycle().infoBicycle();
	}
}

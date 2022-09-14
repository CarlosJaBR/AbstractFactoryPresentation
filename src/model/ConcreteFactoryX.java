package model;


/*
 * ConcreteFactoryX use AbstractFactory interface
 * */
public class ConcreteFactoryX implements AbstractFactory{
	
	
	public ConcreteFactoryX() {
		
	}

	@Override
	public IBicycle createBicycle() {
		return new BMXBicycle();
	}

	@Override
	public ISkate createSkate() {
		return new ArtisticSkate();
	}

	
	
}

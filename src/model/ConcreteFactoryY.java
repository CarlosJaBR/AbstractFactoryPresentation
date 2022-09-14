package model;

/*
 * ConcreteFactoryY use AbstractFactory interface
 * */
public class ConcreteFactoryY implements AbstractFactory{

	public ConcreteFactoryY() {
		
	}
	
	@Override
	public IBicycle createBicycle() {
		return new MTBBicycle();
	}

	@Override
	public ISkate createSkate() {
		return new FreeSkate();
	}

}

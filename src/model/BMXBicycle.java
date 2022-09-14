package model;
/*
 * Bicicleta de BMX
 * */
public class BMXBicycle implements IBicycle{

	public BMXBicycle() {
		
	}
	@Override
	public String speedUpBicycle() {
		
		return "** Speed Up BMX Bicycle **";
	}

	@Override
	public String curbBicycle() {
	
		return "** Curb BMX Bicycle **";
	}
	@Override
	public String infoBicycle() {
		return "It was created a BMX Bicyle :3";
	}

}

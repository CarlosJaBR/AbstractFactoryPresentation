package model;
/*
 * MTB Bicycle implements IBiclycle interface
 * */
public class MTBBicycle implements IBicycle{
	
	public MTBBicycle() {
		
	}
	@Override
	public String speedUpBicycle() {
	
		return "== Speed Up MTB Bicycle ==";
	}

	@Override
	public String curbBicycle() {
	
		return "== Curb MTB Bicycle ==";
	}
	@Override
	public String infoBicycle() {
		return "It was created a MTB Bicycle :3";
	}

}

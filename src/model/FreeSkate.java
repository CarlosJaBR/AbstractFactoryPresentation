package model;
/*
 * Free stakes implement ISkate interface.
 * */
public class FreeSkate implements ISkate{

	public FreeSkate() {
		
	}
	
	@Override
	public String speedUpSkate() {
		return "==== Speed Up Free skates ====";
	}

	@Override
	public String curbStake() {
		return "==== Curb Free skates ====";
	}

	@Override
	public String infoSkate() {
		return "It was created a Free skate :)";
	}

}

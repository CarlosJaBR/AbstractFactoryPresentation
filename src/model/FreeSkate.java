package model;
/*
 * Patines de patinaje libre.
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

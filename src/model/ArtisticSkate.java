package model;
/*
 * Artistic stakes implement ISkate interface.
 * */
public class ArtisticSkate implements ISkate{

	public ArtisticSkate() {
		
	}
	@Override
	public String speedUpSkate() {
		return "**** Speed Up Artistic skates  ****";
	}

	@Override
	public String curbStake() {
		return "**** Curb Artistic skates  ****";
	}
	@Override
	public String infoSkate() {
		return "It was created an Artistic skate :)";
	}

}

package com.mypackage;

public class GermanToUKConverter implements UKPlugConnector{
	
	GermanPlugConnector connector;
	
	public GermanToUKConverter(GermanPlugConnector connector) {
		this.connector= connector;
	}

	@Override
	public void giveElectricity() {
		connector.giveElectricity();
		
	}

}

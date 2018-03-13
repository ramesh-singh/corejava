package com.mypackage;

public class AppMain {
	public static void main(String[] args) {
		GermanPlugConnector germanPlugConnector= new GermanPlugConnector() {
			
			@Override
			public void giveElectricity() {
				System.out.println("Give electricity to Germany.");
				
			}
		};
		
		UKElectricalSocket electricalSocket= new UKElectricalSocket();
		UKPlugConnector plugConnector= new GermanToUKConverter(germanPlugConnector);
		electricalSocket.plugin(plugConnector);
	}

}

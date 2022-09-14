package ui;
import model.*; 

/*
 * By: Carlos Bolaños.
 * */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Explain Abstract Factory pattern\n\n");
		
		Client client = new Client();
		
		System.out.println("Factory X: " + client.infoFactoryX() + "\n");
		System.out.println("Factory Y: " + client.infoFactoryY());
		
	}
}

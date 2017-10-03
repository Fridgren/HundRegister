

import java.util.Scanner;
import java.util.ArrayList;

public class HundRegister {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Hund> hundLista = new ArrayList<Hund>();

	public void programmetStartarMed() {
		Hund hundNr1 = new Hund("Tommy", 33, 16, "tax");
		Hund hundNr2 = new Hund("Anna", 12, 4, "bulldog");
		Hund hundNr3 = new Hund("Marcus", 24, 17, "labrador");
		Hund hundNr4 = new Hund("Hanna", 3, 4, "french");

		hundLista.add(hundNr1);
		hundLista.add(hundNr2);
		hundLista.add(hundNr3);
		hundLista.add(hundNr4);
	}

	public void registreraHund() {
		System.out.print("Namn: ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.print("Ras: ");
		String race = sc.nextLine();

		System.out.print("Ålder i år: ");
		int age = sc.nextInt();

		System.out.print("Vikt i kg: ");
		int weight = sc.nextInt();

		Hund hd = new Hund(name, weight, age, race);

		hundLista.add(hd);

		System.out.println(name + " är tilllagd i register!");

	}

	public void listaLängstaSvans() {

		System.out.print("Ange minsta svanslängd: ");
		double svans = sc.nextDouble();
		System.out.println("Hundregister: ");

		for (int plats1 = 0; plats1 < hundLista.size(); plats1++) {
			if (hundLista.get(plats1).getTail() >= svans) {

				System.out.println(hundLista.get(plats1).toString());
			}
		}

	}

	public void taBortHundFrånRegister() {

		System.out.println("Vilken hund är det som skall tas bort?: ");

		String namn1 = sc.nextLine();
		boolean removed = false;

		for (int i = 0; i < hundLista.size(); i++) {
			if (hundLista.get(i).getName().equalsIgnoreCase(namn1)) {
				hundLista.remove(i);
				removed = true;

			}

			if (removed)
				System.out.println("Hunden är nu borttagen.");

			else
				System.out.println("Hund kunde inte hittas.");
		}
	}

	public void programmetAvslutas() {
		System.out.println("Välkommen åter!");
		System.exit(0);
	}

	public void närProgrammetkörs() {

		while (true) {
			skrivMeny();
			menyVal();

		}
	}

	public void skrivMeny() {
		System.out.print("Vad vill du göra: \n"
				+ "Tryck 1 för att registrera hund \nTryck 2 för att lista hund med längst svanslängden\n"
				+ "Tryck 3 för att ta bort en hund från register \nTryck 4 för att avsluta programmet\n"
				+ "Ange kommando här>: ");
	}

	public void menyVal() {
		System.out.println();
		int menyValet = sc.nextInt();

		switch (menyValet) {
		case 1:
			registreraHund();
			break;
		case 2:
			listaLängstaSvans();
			break;
		case 3:
			taBortHundFrånRegister();
			break;
		case 4:
			programmetAvslutas();
			break;
		default:
			System.out.println("Prova igen");
			närProgrammetkörs();
		}

	}

	public static void main(String[] args) {
		HundRegister kenneln = new HundRegister();
		kenneln.programmetStartarMed();

		kenneln.närProgrammetkörs();
	}
}




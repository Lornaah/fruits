package testfruits;

import java.util.Scanner;

import fruits.EnumFruit;

public class Menu {

	public static void showMenu() {
		System.out
				.println("Bonjour ! Voici la liste des fruits disponibles pour votre salade : " + EnumFruit.getNames());
	}

	public static void askMenu() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Bienvenue ! Que voulez-vous mettre comme fruits dans votre salade ?");
			String compo = scanner.nextLine();
			System.out.println("Vous avez bien sélectionné " + compo + " ? (O)ui / (N)on ");
			String answer = scanner.next("[onON]");
		}
	}
}

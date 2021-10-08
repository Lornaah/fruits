package testfruits;

import java.util.Scanner;

import fruits.EnumFruit;

public class Menu {

	public static void showMenu() {
		System.out
				.println("Bonjour ! Voici la liste des fruits disponibles pour votre salade : " + EnumFruit.getNames());
		System.out.println("1. Composer votre salade de fruits \r\n2. Obtenir plus d'informations sur les produits");
		try (Scanner scanner = new Scanner(System.in)) {
			String answer = scanner.next();
			if (answer.equals("2")) {
				infos();
			} else {
				askMenu();
			}
		}
	}

	public static void infos() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Voulez-vous en savoir davantage sur l'un de ces produits " + EnumFruit.getNames()
					+ " ? (O)ui / (N)on");
			String answer = scanner.next();

			if (answer.equalsIgnoreCase("O")) {
				moreInfos();
			} else {
				showMenu();
			}
		}
	}

	public static void moreInfos() {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean canContinue = false;
			while (canContinue == false) {
				canContinue = true;
				System.out.println("Sur quel fruit souhaitez-vous en apprendre plus ?");
				System.out.println(EnumFruit.getNames());
				String[] fruitInfo = scanner.nextLine().split(" ");
				for (String mot : fruitInfo) {
					EnumFruit.presentFruit(mot);
				}
				System.out.println("Souhaitez-vous en apprendre plus sur un autre fruit ? (O)ui / (N)on");
				String answer = scanner.nextLine();

				if (answer.equalsIgnoreCase("O")) {
					canContinue = false;
					continue;
				}

				for (String valeur : fruitInfo) {
					if (!EnumFruit.getNames().contains(valeur)) {
						canContinue = false;
						System.out.println("Désolé, '" + valeur + "' n'existe pas. Veuillez recommencer.");
					}
				}
				showMenu();
			}
		}
	}

	public static void askMenu() {
		try (Scanner scanner = new Scanner(System.in)) {
			boolean canContinue = false;
			while (canContinue == false) {
				canContinue = true;
				System.out.println("Bienvenue ! Que voulez-vous mettre comme fruits dans votre salade ?");
				String compo = scanner.nextLine();
				String[] choix = compo.split(" ");

				for (String valeur : choix) {
					if (!EnumFruit.getNames().contains(valeur)) {
						canContinue = false;
						System.out.println("Désolé, '" + valeur + "' n'existe pas. Veuillez recommencer.");
					}
				}

				if (!canContinue)
					continue;
				/*
				 * Puis demander si on souhaite éplucher le fruit avec peeled() / isPeeled()
				 */
				System.out.println("Vous avez bien sélectionné " + compo + " ? (O)ui / (N)on ");
				String answer = scanner.next("[onON]");

				if (answer.equalsIgnoreCase("N")) {
					canContinue = false;
					System.out.println("Veuillez recommencer votre commande");
				}

				System.out.println("Votre salade de fruits sera donc composée de : " + compo);
			}
		}
	}
}

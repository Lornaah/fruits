package fruits;

import java.util.ArrayList;
import java.util.List;

public enum EnumFruit {
	POMME("Pomme", new Apple()), ANANAS("Ananas", new Pineapple()), FRAISE("Fraise", new Strawberry()),
	KIWI("Kiwi", new Kiwi()), RAISIN("Raisin", new Grape());

	Fruits fruit;
	String name;

	EnumFruit(String name, Fruits fruit) {
		this.name = name;
		this.fruit = fruit;
	}

	public String getName() {
		return this.name;
	}

	public static void presentFruit(String fruitName) {
		for (EnumFruit valeur : values()) {
			if (fruitName.equals(valeur.name)) {
				valeur.fruit.sePrésenter();
			}
		}
	}

	public static List<String> getNames() {
		List<String> listResult = new ArrayList<>();

		for (EnumFruit valeur : values())
			listResult.add(valeur.getName());

		return listResult;

		/*
		 * On peut résumer toute la boucle précédente par la simple ligne : return
		 * Arrays.stream(values()).map(EnumFruit::getName).toList();
		 */
	}
}

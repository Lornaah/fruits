package fruits;

import java.util.Arrays;
import java.util.List;

public enum EnumFruit {
	POMME("Pomme"), ANANAS("Ananas"), FRAISE("Fraise"), KIWI("Kiwi"), RAISIN("Raisin");

	String name;

	EnumFruit(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public static List<String> getNames() {

		return Arrays.stream(values()).map(EnumFruit::getName).toList();
		/*
		 * 
		 */
	}
}

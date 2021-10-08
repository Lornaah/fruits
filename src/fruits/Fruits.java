package fruits;

public abstract class Fruits implements PeelFruit {

	String name;

	public abstract void taste();

	public abstract int getSize();

	public abstract boolean hasSeed();

	public void seed() {
		if (hasSeed() == true) {
			System.out.println(name + " a des p�pins !");
		} else {
			System.out.println(name + " n'a pas de p�pins !");
		}
	}

	public static void miam() {
		System.out.println("Mangez 5 fruits et l�gumes par jour");
	}

	public void sePr�senter() {
		taste();
		seed();
	}

	public void peeled() {
		if (isPeeled()) {
			System.out.println(name + " a �t� �pluch�");
		} else {
			System.out.println(name + " n'a pas �t� �pluch�");
		}
	}
}

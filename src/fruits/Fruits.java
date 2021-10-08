package fruits;

public abstract class Fruits implements PeelFruit {

	String name;

	public abstract void taste();

	public abstract int getSize();

	public abstract boolean hasSeed();

	public void seed() {
		if (hasSeed() == true) {
			System.out.println(name + " a des pépins !");
		} else {
			System.out.println(name + " n'a pas de pépins !");
		}
	}

	public static void miam() {
		System.out.println("Mangez 5 fruits et légumes par jour");
	}

	public void sePrésenter() {
		taste();
		seed();
	}

	public void peeled() {
		if (isPeeled()) {
			System.out.println(name + " a été épluché");
		} else {
			System.out.println(name + " n'a pas été épluché");
		}
	}
}

package fruits;

public class Apple extends Fruits {

	public Apple() {
		this.name = "La pomme";
	}

	@Override
	public void taste() {
		System.out.println("La pomme a un go�t plut�t sucr�");
	}

	@Override
	public int getSize() {
		return 2;
	}

	@Override
	public boolean hasSeed() {
		return true;
	}

	@Override
	public boolean isPeeled() {
		return false;
	}

	@Override
	public String getSkinType() {
		return "La peau peut �tre mang�e !";
	}
}

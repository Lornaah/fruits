package fruits;

public class Grape extends Fruits {

	public Grape() {
		this.name = "Le raisin";
	}

	@Override
	public void taste() {
		System.out.println("Le go�t du raisin est sucr� mais il est meilleur ferment� !");
	}

	@Override
	public int getSize() {
		return 1;
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
		return "Un peu gluant mais ap�tissant !";
	}

}

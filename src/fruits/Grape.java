package fruits;

public class Grape extends Fruits {

	public Grape() {
		this.name = "Le raisin";
	}

	@Override
	public void taste() {
		System.out.println("Le goût du raisin est sucré mais il est meilleur fermenté !");
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
		return "Un peu gluant mais apétissant !";
	}

}

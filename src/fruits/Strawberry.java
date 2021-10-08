package fruits;

public class Strawberry extends Fruits {

	public Strawberry() {
		this.name = "La fraise";
	}

	@Override
	public void taste() {
		System.out.println("La fraise a un goût sucré et acide");
	}

	@Override
	public int getSize() {
		return 1;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return false;
	}

	@Override
	public String getSkinType() {
		return "Il n'y a pas de peau !";
	}

}

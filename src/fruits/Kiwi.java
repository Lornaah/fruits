package fruits;

public class Kiwi extends Fruits implements PeelFruit {

	public Kiwi() {
		this.name = "Le kiwi";
	}

	@Override
	public void taste() {
		System.out.println("Le goût du kiwi est très acide");
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
		return "piquante";
	}

}

package fruits;

public class Pineapple extends Fruits implements PeelFruit {

	public Pineapple() {
		this.name = "L'ananas";
	}

	@Override
	public void taste() {
		System.out.println("L'ananas a un go�t un peu acidul�");
	}

	@Override
	public int getSize() {
		return 3;
	}

	@Override
	public boolean hasSeed() {
		return false;
	}

	@Override
	public boolean isPeeled() {
		return true;
	}

	@Override
	public String getSkinType() {
		return "La peau est tr�s �paisse, on ne peut pas la manger !";
	}

}

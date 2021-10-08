package fruits;

public class Pineapple extends Fruits implements PeelFruit {

	public Pineapple() {
		this.name = "L'ananas";
	}

	@Override
	public void taste() {
		System.out.println("L'ananas a un goût un peu acidulé");
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
		return "La peau est très épaisse, on ne peut pas la manger !";
	}

}

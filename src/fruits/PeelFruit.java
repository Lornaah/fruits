package fruits;

public interface PeelFruit {

	/*
	 * On ne peut mettre que des m�thodes abstraites dans une interface. On peut
	 * donc choisir de mettre "abstract" ou non dans la signature de la m�thode. A
	 * la compilation, cela se fera automatiquement
	 *
	 */

	public abstract boolean isPeeled();

	public String getSkinType();
}

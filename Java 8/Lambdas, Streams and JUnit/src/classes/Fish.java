/**
 * 
 */
package classes;

/**
 * @author Luis Felipe Castro Sánchez
 *
 */
public class Fish implements Animal {

	/**
	 * 
	 */
	public Fish() {
		System.out.println("Creating Fish Object");
	}

	@Override
	public void animalSound() {
		System.out.println("Bloop Bloop ");
	}

	@Override
	public void move() {
		System.out.println("I am swimming");
	}

}

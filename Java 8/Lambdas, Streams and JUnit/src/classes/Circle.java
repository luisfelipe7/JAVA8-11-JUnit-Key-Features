/**
 * 
 */
package classes;

/**
 * @author Luis Felipe Castro Sánchez
 *
 */
public class Circle extends Shape {
	static final double PI = 3.141592;
	double radius;

	// Constructors
	public Circle() {
		this.quantityOfSides= 0;
		this.colorShape = "white";
		this.radius = 1;
	}

	/**
	 * @param quantityOfSides
	 * @param colorShape
	 */
	public Circle(int quantityOfSides, String colorShape, double radius) {
		super(quantityOfSides, colorShape);
		this.radius = radius;
	}

	// Getter and Setters
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}

	// Methods
	@Override
	public double calculateArea() {
		return PI * (Math.pow(radius,2));
	}

	@Override
	public void displayInformation() {
		System.out.println("I am a "+this.getClass().getSimpleName());
		super.displayInformation();
		System.out.println("3) Radius : " + this.radius);
	}

}

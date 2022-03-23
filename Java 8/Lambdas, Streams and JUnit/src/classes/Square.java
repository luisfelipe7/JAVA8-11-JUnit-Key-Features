/**
 * 
 */
package classes;

/**
 * @author Luis Felipe Castro Sánchez
 *
 */
public class Square extends Shape {
	// Attributes
	int sideLength;

	// Constructors 
	public Square() {
		this.quantityOfSides = 4;
		this.colorShape = "white";
		this.sideLength = 1;
	}
	public Square(int quantityOfSides, String colorShape, int sideLength) {
		super(quantityOfSides, colorShape);
		this.sideLength = sideLength;
	}
	
	// Getters and Setters
	public int getSideLength() {
		return sideLength;
	}
	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}
	
	
	// Methods
	@Override
	public double calculateArea() {
		return (this.sideLength*this.sideLength);
	}
	
	@Override
	public void displayInformation() {
		System.out.println("I am a "+this.getClass().getSimpleName());
		super.displayInformation();
		System.out.println("3) Length Side: "+this.sideLength);
	}

}

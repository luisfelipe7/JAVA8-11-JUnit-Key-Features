/**
 * 
 */
package classes;

/**
 * @author Luis Felipe Castro Sánchez
 *
 */
public abstract class Shape {
	// Attributes
	int quantityOfSides;
	String colorShape;
	
	// Constructor
	public Shape() {
		this.quantityOfSides = 0;
		this.colorShape = "white";
	}

	/**
	 * @param quantityOfSides
	 * @param colorShape
	 */
	public Shape(int quantityOfSides, String colorShape) {
		super();
		this.quantityOfSides = quantityOfSides;
		this.colorShape = colorShape;
	}
	
	
	// Getter and Setters
	public int getQuantityOfSides() {
		return quantityOfSides;
	}

	public void setQuantityOfSides(int quantityOfSides) {
		this.quantityOfSides = quantityOfSides;
	}

	public String getColorShape() {
		return colorShape;
	}

	public void setColorShape(String colorShape) {
		this.colorShape = colorShape;
	}
	
	
	// Methods
	
	// Calculate Area
	public abstract double calculateArea();
	
	// Display Information
	public void displayInformation() {
		System.out.println("My Information");
		System.out.println("1) Quantity of Sides: "+this.quantityOfSides);
		System.out.println("2) Color: "+this.colorShape);
	}	
	
}

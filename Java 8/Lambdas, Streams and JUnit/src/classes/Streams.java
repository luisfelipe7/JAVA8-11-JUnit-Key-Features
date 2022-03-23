/**
 * 
 */
package classes;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Felipe Castro
 *
 */
public class Streams {
	// LinkedList of Shapes
	LinkedList<Shape> myLinkedListOfShapes;
	// Stream of the LinkedList
	Stream<Shape> myLinkedListStream;

	// Constructor
	public Streams() {
		initializeLinkedList();
		// It is very important to create the stream with the array/data structure
		this.myLinkedListStream = (this.myLinkedListOfShapes).stream();
	}

	// Getter and Setters
	public LinkedList<Shape> getMyLinkedListOfShapes() {
		return myLinkedListOfShapes;
	}

	public void setMyLinkedListOfShapes(LinkedList<Shape> myLinkedListOfShapes) {
		this.myLinkedListOfShapes = myLinkedListOfShapes;
	}

	public Stream getMyLinkedListStream() {
		return myLinkedListStream;
	}

	public void setMyLinkedListStream(Stream myLinkedListStream) {
		this.myLinkedListStream = myLinkedListStream;
	}

	// Methods

	// Initialize LinkedList
	public void initializeLinkedList() {
		this.myLinkedListOfShapes = new LinkedList<Shape>();

		// Creating shapes
		// Circle
		Circle circle1 = new Circle(0, "Blue", 44.60);
		// Square
		Square square1 = new Square(4, "Black", 34);
		// Circle
		Circle circle2 = new Circle(0, "Blue", 24);
		// Square
		Square square2 = new Square(4, "Green", 34);

		// Inserting shapes
		this.myLinkedListOfShapes.addLast(circle1);
		this.myLinkedListOfShapes.addLast(square1);
		this.myLinkedListOfShapes.addLast(circle2);
		this.myLinkedListOfShapes.addLast(square2);
	}

	// Using Stream Methods

	// a) ForEach - Modify the stream
	// forEach() is a terminal operation, which means that, after the operation is performed, the stream pipeline is considered consumed, and can no longer be used.
	public void usingForEach(int option) {
		System.out.println("Using the ForEach");
		
		switch (option) {
		case 1:
			// Increasing the radius of the circles and length of the squares
			this.myLinkedListOfShapes.forEach(shape ->{
				// Checking the kind of figure with a switch
				switch(shape.getClass().getSimpleName()) {
				case "Square":
					// Downcasting
					int sideLength = ((Square) shape).getSideLength();
					// Then increasing the length
					((Square) shape).setSideLength(sideLength+5);
					System.out.println("Increased the length of the square");
				break;
				case "Circle":
					// Downcasting
					double radiusLength = ((Circle) shape).getRadius();
					// Then increasing the length
					((Circle) shape).setRadius(radiusLength+5);
					System.out.println("Increased the radius of the circle");
				break;
				default:
					System.out.println("Shape not identified, class: "+shape.getClass().getSimpleName());
				break;
				}
			});
			break;
		case 2:
			// Nothing at the moment
			break;
		default:
			// Printing the information of each element
			this.myLinkedListStream.forEach(shape->shape.displayInformation());
			break;
		}
	}
	
	// b) Map - Create a new stream
	// map() produces a new stream after applying a function to each element of the original stream
	public void usingMap() {
		System.out.println("Using the Map");
		
		this.myLinkedListStream = this.myLinkedListOfShapes.stream().map(shape->{
			shape.setColorShape("Yellow");
			return shape;
		});

	}
	
	// c) Filter and Collect  
	// filter() Create a new stream that contains the elements matching the conditions
	// collect() Transform the elements in the stream to a List
	public void usingFilterAndCollect() {
		System.out.println("Using the Filter and Collect");
		
		this.myLinkedListOfShapes.stream().filter(shape -> {
			if(shape.getColorShape().equals("Blue")) {
				return true;
			}else {
				return false;
			}
		})
		.collect(Collectors.toList())
		.forEach(shape -> shape.displayInformation());
		
	}
	
	// d) FindFirst - Return first element matching the condition
	public void usingFindFirst() {
		System.out.println("Using the FindFirst");

		// Getting the first square shape with color black
		Shape firstShape =
				this.myLinkedListOfShapes.stream()
				.filter(shape ->{
					String className = shape.getClass().getSimpleName();
					if(className.equals("Square")==true) {
						return true;
					}else {
						return false;
					}
				})
				.filter(shape ->{
					if(shape.getColorShape().equals("Black")==true) {
						return true;
					}else {
						return false;
					}
				})
				.findFirst()
				.orElse(null);
		
		if(firstShape != null) {
			firstShape.displayInformation();
		}else {
			System.out.println("Not found a shape with the conditions applied");
		}
	}
	
	public Shape getFirstShape() {
		System.out.println("Using the FindFirst");

		// Getting the first square shape with color black
		Shape firstShape =
				this.myLinkedListOfShapes.stream()
				.filter(shape ->{
					String className = shape.getClass().getSimpleName();
					if(className.equals("Square")==true) {
						return true;
					}else {
						return false;
					}
				})
				.filter(shape ->{
					if(shape.getColorShape().equals("Black")==true) {
						return true;
					}else {
						return false;
					}
				})
				.findFirst()
				.orElse(null);
		
		if(firstShape != null) {
			return firstShape;
		}else {
			return null;
		}
		
	}
	

}

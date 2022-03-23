/**
 * 
 */
package main;

import classes.*;
// Import Logging
import java.util.logging.*;

/**
 * @author Luis Felipe Castro Sánchez
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		// Reviewing the basics of Java
		System.out.println("Reviewing the basics of Java \n");
		
		// -- Types of Data in Java
		
		// - Primitive Types
		int numberA= 1;
		float decimalA = 4.95f;
		String nameA = "Luis Felipe";
		char letterA = 'A';
		boolean isTrueA = true;
		
		// - Object Types
		
		// Person 
		// Using constructor without parameters
		Person person1 = new Person();
		person1.setAgeYears(24);
		person1.setFullName("Luis Castro");
		// Using constructor with parameters
		Person person2 = new Person("Felipe Sánchez",24);
		
		// Shapes and Forms
		// Shape shape1 = new Shape(); --> This generate an error because it is an abstract class
		// Circle
		Circle circle1 = new Circle(0,"Blue",44.60);
		circle1.displayInformation();
		System.out.println("The area of my circle is "+circle1.calculateArea());
		System.out.println();
		// Square
		Square square1 = new Square(4,"Black",34);
		square1.displayInformation();
		System.out.println("The area of my square is "+square1.calculateArea());
		System.out.println();
		
		// Animals
		// Animal animal1 = new Animal(); --> This generate an error because we are using an interface
		Fish fish1 = new Fish();
		fish1.animalSound();
		fish1.move();
		System.out.println();
		
		// -- Data Structures
		DataStructures dataStructures1 = new DataStructures(2);

		// - Simple Arrays
		dataStructures1.insertShapeSimpleArray(circle1);
		dataStructures1.insertShapeSimpleArray(square1);
		dataStructures1.insertShapeSimpleArray(square1);
		dataStructures1.printElementsOfSimpleArray();
		System.out.println();
		// - ArrayList
		dataStructures1.insertShapeArrayList(circle1);
		dataStructures1.insertShapeArrayList(square1);
		dataStructures1.sortAndPrintArrayList();
		dataStructures1.removeItemSpecificPositionArrayList(0);
		dataStructures1.removeItemSpecificPositionArrayList(0);
		dataStructures1.sortAndPrintArrayList();
		System.out.println();
		// - LinkedList
		dataStructures1.insertStartLinkedList(circle1);
		dataStructures1.insertStartLinkedList(square1);
		dataStructures1.removeStartLinkedList();
		dataStructures1.printElementsLinkedList();
		System.out.println();
		// - HashMaps
		dataStructures1.printKeysHashMap();
		dataStructures1.printValuesHashMap();
		System.out.println();
		
		// -- Lambda Expressions

		// Format: Lambda Operator -> Body
		// Parameters are not required
		// And we just need to use parenthesis when the body is having more than one line
		
		// One Parameter
		// INCORRECT : (numberB) -> System.out.println("One parameter lambda "+numberB); -> This cause an error because we are not using it
		// CORRECT : Implementing a method from an interface
		MyPrinter myPrinter = (s) -> System.out.println("This is the value of s: "+s);
		myPrinter.print("MyString");
		System.out.println();
		// Two Parameters
		MyAdder myAdder = (element1, element2) ->{
			element1+=1;
			element2+=1;
			return element1 + element2;
		};
		System.out.println("The sum of ((4+1) + (5+1)) is equal to "+myAdder.sumElements(4, 5));
		System.out.println();
		
		
		// -- Java Streams
		Streams myStreams = new Streams();
		
		// - How to use it? Create an stream from the Data Structure.
		// Example: 
		// Arrays.stream(dataStructure)
		// Stream.of(dataStructure)
		// dataStructure.stream()
		
		// - Methods
		// ForEach()
		myStreams.usingForEach(1);
		System.out.println();
		myStreams.usingForEach(3);
		System.out.println();
		// FindFirst()
		myStreams.usingFindFirst();
		System.out.println();
		// Filter() and Collect()
		myStreams.usingFilterAndCollect();
		System.out.println();
		// Map()
		myStreams.usingMap();
		myStreams.usingForEach(3);
		System.out.println();
		
	


		
		// -- Useful Tools for Java
		
		// - Print Data
		System.out.println("The value of numberA is "+numberA);
		System.out.println("The value of nameA is "+nameA);
		System.out.println("The value of decimalA is "+decimalA);
		System.out.println("The value of letterA is "+letterA);
		System.out.println("The value of isTrueA is "+isTrueA);
		
		// - Printing person information
		System.out.println();
		System.out.println("Person1 Information : "+person1.toString());
		System.out.println("Person2 Information : "+person2.toString());
		
		// - Doing Logging
		// Objects
		Logger logger = Logger.getLogger(App.class.getName());
		logger.log(Level.INFO,"This is an informational log");
		logger.log(Level.WARNING,"This is a warning log");
		logger.log(Level.ALL,"This is a general log");
	
		}

}

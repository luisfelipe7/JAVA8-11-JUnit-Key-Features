/**
 * 
 */
package classes;

import classes.Shape;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author Luis Felipe Castro Sánchez
 *
 */
public class DataStructures {
	// Attributes

	// Simple Array
	Shape[] myArrayOfShapes;
	// Size of Simple Array
	int sizeArrayOfShapes;
	// Quantity Simple Array
	int quantityArrayOfShapes;
	// Actual Simple Array
	int actualPositionArrayOfShapes;

	// ArrayList
	ArrayList<Shape> myArrayListOfShapes;

	// LinkedList
	LinkedList<Shape> myLinkedListOfShapes;

	// HashMap
	HashMap<String, String> provincesByIdHashMap;

	// Constructors
	// Without parameters
	public DataStructures() {
		// Initializing the data structures
		System.out.println("Initializing the data structures");

		// Simple Array
		this.myArrayOfShapes = new Shape[10];
		this.sizeArrayOfShapes = 10;
		this.quantityArrayOfShapes = 0;
		this.actualPositionArrayOfShapes = 0;
		this.initializeSimpleArray();

		// ArrayList
		this.myArrayListOfShapes = new ArrayList<Shape>();

		// LinkedList
		this.myLinkedListOfShapes = new LinkedList<Shape>();

		// HashMap
		this.provincesByIdHashMap = new HashMap<String, String>();
		this.initializeHashMap();
	}

	// With parameters
	public DataStructures(int sizeSimpleArray) {
		// Initializing the data structures
		System.out.println("Initializing the data structures");

		// Simple Array
		this.myArrayOfShapes = new Shape[sizeSimpleArray];
		this.sizeArrayOfShapes = sizeSimpleArray;
		this.quantityArrayOfShapes = 0;
		this.actualPositionArrayOfShapes = 0;
		this.initializeSimpleArray();

		// ArrayList
		this.myArrayListOfShapes = new ArrayList<Shape>();

		// LinkedList
		this.myLinkedListOfShapes = new LinkedList<Shape>();

		// HashMap
		this.provincesByIdHashMap = new HashMap<String, String>();
		this.initializeHashMap();
	}

	// Getter and Setters
	public Shape[] getMyArrayOfShapes() {
		return myArrayOfShapes;
	}

	public void setMyArrayOfShapes(Shape[] myArrayOfShapes) {
		this.myArrayOfShapes = myArrayOfShapes;
	}

	public int getSizeArrayOfShapes() {
		return sizeArrayOfShapes;
	}

	public void setSizeArrayOfShapes(int sizeArrayOfShapes) {
		this.sizeArrayOfShapes = sizeArrayOfShapes;
	}

	public int getQuantityArrayOfShapes() {
		return quantityArrayOfShapes;
	}

	public void setQuantityArrayOfShapes(int quantityArrayOfShapes) {
		this.quantityArrayOfShapes = quantityArrayOfShapes;
	}

	public int getActualPositionArrayOfShapes() {
		return actualPositionArrayOfShapes;
	}

	public void setActualPositionArrayOfShapes(int actualPositionArrayOfShapes) {
		this.actualPositionArrayOfShapes = actualPositionArrayOfShapes;
	}

	// Methods

	// Simple Array
	public void insertShapeSimpleArray(Shape shapeToInsert) {
		if (this.sizeArrayOfShapes == this.quantityArrayOfShapes) {
			System.out.println("The array is full, you can't insert");
		} else {
			this.myArrayOfShapes[this.actualPositionArrayOfShapes] = shapeToInsert;
			this.actualPositionArrayOfShapes += 1;
			this.quantityArrayOfShapes += 1;
			System.out.println("Inserted shape sucessfully");
		}
	}

	public void printElementsOfSimpleArray() {
		for (int index = 0; index < this.myArrayOfShapes.length; index++) {
			if (this.myArrayOfShapes[index] != null) {
				this.myArrayOfShapes[index].displayInformation();
			}
		}
	}

	public void initializeSimpleArray() {
		for (int index = 0; index < this.sizeArrayOfShapes; index++) {
			this.myArrayOfShapes[index] = null;
		}
	}

	// ArrayList
	public void insertShapeArrayList(Shape shapeToInsert) {
		this.myArrayListOfShapes.add(shapeToInsert);
	}

	public Shape getItemArrayList(int position) {
		return this.myArrayListOfShapes.get(position);
	}

	public void removeItemSpecificPositionArrayList(int position) {
		this.myArrayListOfShapes.remove(position);
	}

	public void sortAndPrintArrayList() {
		// Sorting by color
		Collections.sort(this.myArrayListOfShapes, new Comparator<Shape>() {
			public int compare(Shape s1, Shape s2) {
				return s1.getColorShape().compareTo(s2.getColorShape());
			}
		});
		// Printing the elements
		// Way #1
		for (Shape s : this.myArrayListOfShapes) {
			s.displayInformation();
		}
		// Way #2
		/*
		 * for (int index = 0; index < this.myArrayListOfShapes.size(); index++) {
		 * this.myArrayListOfShapes.get(index).displayInformation(); }
		 */
	}

	// LinkedList
	public void insertStartLinkedList(Shape shapeToInsert) {
		this.myLinkedListOfShapes.addFirst(shapeToInsert);
	}

	public void removeStartLinkedList() {
		this.myLinkedListOfShapes.removeFirst();
	}

	public void printElementsLinkedList() {
		for (Shape shape : this.myLinkedListOfShapes) {
			shape.displayInformation();
		}
	}

	// HashMap
	public void initializeHashMap() {
		this.provincesByIdHashMap.put("1", "San José");
		this.provincesByIdHashMap.put("4", "Heredia");
	}

	public void printKeysHashMap() {
		for (String key : this.provincesByIdHashMap.keySet()) {
			System.out.println("Key: " + key + " Value: " + this.provincesByIdHashMap.get(key));
		}
	}

	public void printValuesHashMap() {
		for (String value : this.provincesByIdHashMap.values()) {
			System.out.println("Value: " + value);
		}
	}

}

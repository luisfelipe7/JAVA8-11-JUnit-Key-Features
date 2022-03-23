/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import classes.Circle;
import classes.Square;

/**
 * @author Luis Felipe Castro Sánchez
 *
 */
class ShapeTest {
	static Circle circle1;
	static Square square1;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("This is executed before all the tests");
		circle1 = new Circle(0, "Black", 45.67);
		square1 = new Square(4, "Green", 35);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("This is executed after all the tests");
	}

	/**
	 * Test method for {@link classes.Shape#getColorShape()}.
	 */
	@Test
	@Order(1)
	void testGetColorShape() {
		assertAll("Checking Colors",
			() -> assertEquals("Black",circle1.getColorShape()),
			() -> assertEquals("Green",square1.getColorShape())
		);
	}

	/**
	 * Test method for {@link classes.Shape#calculateArea()}.
	 */
	@Test
	@Order(2)
	void testCalculateArea() {
		assertAll("Checking Areas",
			() -> assertEquals(Math.pow(circle1.getRadius(),2)*Circle.getPi(),circle1.calculateArea()),
			() -> assertEquals(square1.getSideLength()*square1.getSideLength(),square1.calculateArea())
		);
	}

}

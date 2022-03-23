package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import classes.Shape;
import classes.Streams;

class StreamsTest {

	@Test
	@Order(1)
	void testGetFirstShape() {
		// -- Java Streams
		Streams myStreams = new Streams();

		// -- Get First Shape
		Shape myShape=myStreams.getFirstShape();

		assertAll("checking shape",
			() -> assertEquals("Square",myShape.getClass().getSimpleName()),
			() -> assertEquals("Black",myShape.getColorShape()),
			() -> assertNotNull(myShape,"Object is null")
		);
		
	}
	
	@Test
	@Order(2)
	void testInitializeLinkedList() {
		// -- Java Streams : Initialize LinkedList is executed inside the constructor
		Streams myStreams = new Streams();

		// Checking if the list of elements on the list is 4
		assertEquals(4,myStreams.getMyLinkedListOfShapes().size(),"The list is not initialized");

	}

}

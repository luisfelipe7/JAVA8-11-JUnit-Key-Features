/**
 * 
 */
package classes;

/**
 * @author Felipe Castro
 *
 */
public class Person {
	// Here are my attributes
	String fullName;
	int ageYears;
	
	
	// Here are my constructors
	// Without parameters
	public Person() {
		this.fullName="";
		this.ageYears=0;
	}
	// With parameters
	public Person(String fullName, int ageYears) {
		this.fullName = fullName;
		this.ageYears = ageYears;
	}

	
	// Getters and Setters
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAgeYears() {
		return ageYears;
	}
	public void setAgeYears(int ageYears) {
		this.ageYears = ageYears;
	}
	
	// Methods
	@Override
	public String toString() {
		return "\n 1) Name: " + fullName + " \n 2) Age: " + ageYears;
	}
	
}

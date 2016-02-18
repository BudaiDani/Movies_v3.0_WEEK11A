package mypackage;

public class Person {

	String firstName;
	String lastName;
	Gender gender;
	int salary;

	public Person(String firstName, String lastName, Gender gender, int salary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	public static void main(String[] args)
	{
	}

	@Override
	public String toString()
	{
		return "\n" + "FirstName: " + firstName + "\nLastName: " + lastName + "\nGender: " + gender + "\nSalary: "
				+ salary;
	}

}


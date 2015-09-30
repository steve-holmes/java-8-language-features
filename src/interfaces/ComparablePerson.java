package interfaces;

public class ComparablePerson implements Comparable<ComparablePerson> {
	private String firstName;
	private String lastName;
	
	public ComparablePerson(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	@Override
	public int compareTo(ComparablePerson anotherPerson) {
		int diff = getLastName().compareTo(anotherPerson.getLastName());
		if (diff == 0) {
			diff = getFirstName().compareTo(anotherPerson.getFirstName());
		}
		return diff;
	}
	
	@Override
	public String toString() {
		return getLastName() + ", " + getFirstName();
	}
	
	
}

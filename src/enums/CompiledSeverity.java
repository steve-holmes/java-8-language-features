package enums;

public class Severity extends Enum {
	public static final Severity LOW;
	public static final Severity MEDIUM;
	public static final Severity HIGH;
	public static final Severity URGENT;
	
	static {
		LOW		= new Severity("LOW", 0);
		MEDIUM	= new Severity("MEDIUM", 0);
		HIGH	= new Severity("HIGH", 0);
		URGENT	= new Severity("URGENT", 0);
	}
	
	private Severity(String name, int ordinal) {
		super(name, ordinal);
	}
	
	public static Severity[] values() {
		return new Severity[] { LOW, MEDIUM, HIGH, URGENT };
	}
	
	public static Severity valueOf(String name) {
		if (LOW.name().equals(name)) {
			return LOW;
		}
		if (MEDIUM.name().equals(name)) {
			return MEDIUM;
		}
		if (HIGH.name().equals(name)) {
			return HIGH;
		}
		if (URGENT.name().equals(name)) {
			return URGENT;
		}
		
		throw new IllegalArgumentException("Invalid enum constant" + name);
	}
}

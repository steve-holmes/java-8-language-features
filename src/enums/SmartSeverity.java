package enums;

public enum SmartSeverity {
	LOW(30), MEDIUM(15), HIGH(7), URGENT(1);
	
	private int projectedTurnaroundDays;
	
	// Declare a private constructor
	private SmartSeverity(int projectedTurnaroundDays) {
		this.projectedTurnaroundDays = projectedTurnaroundDays;
	}
	
	public int getProjectedTurnaroundDays() {
		return projectedTurnaroundDays;
	}
}

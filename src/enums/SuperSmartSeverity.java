package enums;

public enum SuperSmartSeverity {
	LOW("Low Priority", 30) {

		@Override
		public double getProjectedCost() {
			return 1000.0;
		}
		
	},
	MEDIUM("Medium Priority", 15) {

		@Override
		public double getProjectedCost() {
			return 2000.0;
		}
		
	},
	HIGH("High Priority", 7) {

		@Override
		public double getProjectedCost() {
			return 3000.0;
		}
		
	},
	URGENT("Urgent Priority", 1) {

		@Override
		public double getProjectedCost() {
			return 5000.0;
		}
		
	};
	
	private String description;
	private int projectedTurnaroundDays;
	
	private SuperSmartSeverity(String description, int projectedTurnaroundDays) {
		this.description = description;
		this.projectedTurnaroundDays = projectedTurnaroundDays;
	}
	
	public int getProjectedTurnaroundDays() {
		return projectedTurnaroundDays;
	}
	
	@Override
	public String toString() {
		return this.description;
	}
	
	public abstract double getProjectedCost();
}

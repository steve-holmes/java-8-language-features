package interfaces;

public interface Job {
	class EmptyJob implements Job {
		private EmptyJob() {
			
		}
		
		public void runJob() {
			System.out.println("Nothing serious to run...");
		}
	}
	
	Job EMPTY_JOB = new EmptyJob();
	
	void runJob();
}

package enums;

public enum CommandList implements Command {
	RUN {

		@Override
		public void execute() {
			System.out.println("Running...");
		}
		
	},
	JUMP {

		@Override
		public void execute() {
			System.out.println("Jumping...");
		}
		
	};
	
	public abstract void execute();
}

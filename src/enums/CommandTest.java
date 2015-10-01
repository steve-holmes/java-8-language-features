package enums;

public class CommandTest {
	public static void main(String[] args) {
		for (Command cmd : CommandList.values()) {
			cmd.execute();
		}
	}
}

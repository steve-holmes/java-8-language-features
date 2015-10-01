package enums;

public class DefectUtil {
	public static int getProjectedTurnaroundDays(Severity severity) {
		int days = 0;
		switch (severity) {
		case LOW:
			days = 30;
			break;
		case MEDIUM:
			days = 15;
			break;
		case HIGH:
			days = 7;
			break;
		case URGENT:
			days = 1;
			break;
		}
		
		return days;
	}
}

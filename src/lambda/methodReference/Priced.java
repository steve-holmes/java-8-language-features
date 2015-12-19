package lambda.methodReference;

public interface Priced {
	default double getPrice() {
		return 1.0;
	}
}

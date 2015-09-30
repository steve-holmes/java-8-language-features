package interfaces;

public interface CharitySinger extends Singer {
	@Override
	default void setRate(double rate) {
		
	}
	
	@Override
	default double getRate() {
		return 0.0;
	}
}

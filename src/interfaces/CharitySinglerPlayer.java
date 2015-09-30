package interfaces;

public interface CharitySinglerPlayer extends CharitySinger, Player {
	@Override
	void setRate(double rate);
	
	@Override
	default double getRate() {
		return Player.super.getRate();
	}
}

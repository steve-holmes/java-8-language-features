package interfaces;

public abstract class MultiTalented implements Singer, Player {
	@Override
	public double getRate() {
		double playerRate = Player.super.getRate();
		double rate = playerRate + 200.00;
		return rate;
	}
}

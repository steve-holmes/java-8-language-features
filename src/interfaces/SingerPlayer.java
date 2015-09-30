package interfaces;

public interface SingerPlayer extends Singer, Player {

//	@Override
//	double getRate();
	
//	@Override
//	default double getRate() {
//		return 700.0;
//	}
	
	@Override
	default double getRate() {
		double playerRate = Player.super.getRate();
		double singerPlayerRate = playerRate * 3.5;
		return singerPlayerRate;
	}
	
}

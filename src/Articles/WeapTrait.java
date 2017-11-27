package Articles;

import Engine.Constants;

public enum WeapTrait {
	CHARGED, DEFEND, INFUSED, NIRNHONED, POWERED, PRECISE, SHARP, TRAIN, DECISIVE;
	
	public static WeapTrait getRandTrait() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

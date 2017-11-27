package Articles;

import Engine.Constants;

public enum AccTrait {
	HEALTHY, ARCANE, ROBUST;
	
	public static AccTrait getRandTrait() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

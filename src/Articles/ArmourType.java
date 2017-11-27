/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: --/--/----
 * Description:
 * An enumeration used to differentiate armour weights.
 */

package Articles;

import Engine.Constants;

public enum ArmourType {
	LIGHT, MEDIUM, HEAVY;
	
	public static ArmourType getRandType() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: --/--/----
 * Description:
 * Location is an enum type that states where a particular article
 * equips on a character. All equipment slots.
 */

package Agent;

import Engine.Constants;

public enum Location {
	HEAD, SHOULDERS, CHEST, HANDS, WAIST, LEGS, FEET, ACCESSORY, WEAPON1_L, WEAPON1_R, WEAPON2_L, WEAPON2_R;
	
	
	// The following will likely never get used.
	
	public static Location getRandLocation() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

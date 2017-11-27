/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: --/--/----
 * Description:
 * Location is an enum type that states where a particular article
 * equips on a character. All equipment slots.
 */

package Agent;

import Articles.AccTrait;
import Engine.Constants;

public enum Location {
	HEAD, SHOUDLERS, CHEST, HANDS, WAIST, LEGS, FEET, ACCESSORY, WEAPON1, WEAPON2;
	
	
	// The following will likely never get used.
	
	public static Location getRandLocation() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

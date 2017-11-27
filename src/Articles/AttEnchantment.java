/*
 * Author(s): Jason Ian Murray
 * Creation Date: 27/11/2017
 * Date Modified: --/--/----
 * Description:
 * Here we will find the attire enchantment enumerations
 * 
 * The behaviour will be described within the specific article
 */
package Articles;

import Engine.Constants;

public enum AttEnchantment {
	GYLTH_OF_HEALTH, GLYPH_OF_MAG, GLYPH_OF_PRISM_DEF;
	
	public static AttEnchantment getRandEnchant() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

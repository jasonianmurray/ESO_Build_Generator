/*
 * Author(s): Jason Ian Murray
 * Creation Date: 27/11/2017
 * Date Modified: --/--/----
 * Description:
 * Here we will find the accessory enchantment enumerations
 * 
 * The behaviour will be described within the specific article
 */
package Articles;

import Engine.Constants;

public enum AccEnchantment {
	GLYPH_OF_INCR_PHYS_HARM, GLYPH_OF_INCR_MAG_HARM, GLYPH_OF_HEALTH_REC,
	GLYPH_OF_MAG_REC, GLYPH_OF_STAM_REC, GLYPH_OF_RED_SPELL_COST, GLYPH_OF_FEAT_COST,
	GLYPH_OF_SHIELDING, GLYPH_OF_BASHING, GLYPH_OF_DECR_PHYS_HARM, GLYPH_OF_SPELL_HARM,
	GLYPH_OF_FLAME_RES, GLYPH_OF_FROST_RES, GLYPH_OF_SCHOCK_RES, GLYPH_OF_POISON_RES,
	GLYPH_OF_DISEASE_RES, GLYPH_OF_POTION_SPEED, GLYPH_OF_POTION_BOOST;
	
	public AccEnchantment getRandEnchant() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

/*
 * Author(s): Jason Ian Murray
 * Creation Date: 27/11/2017
 * Date Modified: --/--/----
 * Description:
 * Here we will find the weapon enchantment enumerations
 * 
 * The behaviour will be described within the specific article
 */
package Articles;

import Engine.Constants;

public enum WeapEnchantment {
	GLYPH_OF_FLAME, GLYPH_OF_FROST, GLYPH_OF_SHOCK, GLYPH_OF_POISON,
	GLYPH_OF_FOULNESS, GLYPH_OF_DECR_HEALTH, GLYPH_OF_HARDENING,
	GLYPH_OF_ABSORB_HEALTH, GLYPH_OF_ABSORB_MAGICKA, GLYPH_OF_ABSORB_STAM,
	GLYPH_OF_WEAPON_DAM, GLYPH_OF_WEAKENING, GLYPH_OF_CRUSHING, GLYPH_OF_PRISM_ONS;
	
	public WeapEnchantment getRandEnchant() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: --/--/----
 * Description:
 * This class should contain the set of constants that
 * the calculator (and potentially other classes) rely
 * on. Containing them all here reduces the potential
 * for errors across the system and makes them easy to
 * find.
 * These constants may be pushed to a database in the
 * future.
 */

package Engine;

public class Constants {
	// Info from: http://tamrielfoundry.com/topic/pts-2-1-2-sorcerer-arithmagic/

	// Base stat values at C160
	final static int C160_BASE_HEALTH = 8744;
	final static int C160_BASE_MAG = 7958;
	final static int C160_BASE_STAM = 7958;
	
	// Base recovery values at C160
	final static int C160_BASE_HEALTH_RECOVERY = 309;
	final static int C160_BASE_MAG_RECOVERY = 514;
	final static int C160_BASE_STAM_RECOVERY = 514;

	// Attribute increase per point
	final static int HEALTH_ATTRIBUTE_INCREMENT = 122;
	final static int MAGICKA_ATTRIBUTE_INCREMENT = 111;
	final static int STAMINA_ATTRIBUTE_INCREMENT = 111;

	// Base attribute distribution {H, M, S}
	final static int[] BASE_ATTRIBUTE_DISTRIBUTION = { 0, 0, 0 };
	

	public int getC160BaseHealth() {
		return C160_BASE_HEALTH;
	}

	public int getC160BaseStam() {
		return C160_BASE_STAM;
	}

	public int getC160BaseMag() {
		return C160_BASE_STAM;
	}

	public int getHealthAttributeIncrement() {
		return HEALTH_ATTRIBUTE_INCREMENT;
	}

	public int getMagickaAttributeIncrement() {
		return MAGICKA_ATTRIBUTE_INCREMENT;
	}

	public int getStaminaAttributeIncrement() {
		return STAMINA_ATTRIBUTE_INCREMENT;
	}

	public int[] getBaseAttributeDistribution() {
		return BASE_ATTRIBUTE_DISTRIBUTION;
	}
	
	public int getC160BaseHealthRecovery() {
		return C160_BASE_HEALTH_RECOVERY;
	}
	
	public int getC160BaseMagRecovery() {
		return C160_BASE_MAG_RECOVERY;
	}
	
	public int getC160BaseStamRecovery() {
		return C160_BASE_STAM_RECOVERY;
	}
}

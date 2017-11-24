package Agent;
import Articles.Article;
import Consumables.Food;
import Effects.Mundus;
import Engine.Constants;

public class Agent {
	// Game constants
	Constants constant = new Constants();
	
	// Max HMS
	int maxHealth;
	int maxMag;
	int maxStam;
	
	// HMS Recovery
	int healthRec;
	int magRec;
	int stamRec;
	
	// SW Dam
	int spellDam;
	int weapDam;
	
	// SW Crit
	double spellCrit;
	double weapCrit;
	
	// SPC Resistance
	int spellRes;
	int physRes;
	int critRes;
	
	// Race
	String race;
	
	// Attribute distribution ({H, M, S})
	int [] attrDistrib;
	
	int [] attrIncrementValue = {constant.getHealthAttributeIncrement(), constant.getMagickaAttributeIncrement(), constant.getStaminaAttributeIncrement()};
	
	// 7 Body pieces, 3 Accessories, 2x2 Weapon Slots [14 total]
	Article [] gear = new Article [14];
	Food food;
	Mundus mundus;
	
	
	// http://tamrielfoundry.com/topic/pts-2-1-2-sorcerer-arithmagic/
	// increase per level: H156, S20, M20
	// increase per attribute point spent: H122, S111, M111
	
	public Agent() {
		generateBase();
		
	}
	
	private void generateBase() {
		// Max HMS at C160
		maxHealth = constant.getC160BaseHealth();
		maxMag = constant.getC160BaseMag();
		maxStam = constant.getC160BaseStam();
		
		// HMS Recovery at C160
		healthRec = constant.getC160BaseHealthRecovery();
		magRec = constant.getC160BaseMagRecovery();
		stamRec = constant.getC160BaseStamRecovery();
		
		attrDistrib = constant.getBaseAttributeDistribution(); 
	}
	
	private void generateArticles() {
		// Head, Shoulder, Chest, Hands, Waist, Legs, Feet
		// Accesory x 3
		// (Weapon x 2) x 2 : Shield cannot be first slot, 1H can be with any other 1H or Shield,
		// 2H consumes both slots
		// 7 Body pieces, 3 Accessories, 2x2 Weapon Slots, Food/Drink slot, Mundus slot
		
	}
}

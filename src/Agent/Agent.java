/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * This class should represent the individual agent that will act as a 'build'.
 * The agent should have it's own statistics that can be evaluated by a fitness
 * criteria. It should have articles that effect these statistics.
 */
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
	
	Slot [] gear;
	Food food;
	Mundus mundus;
	
	private double fitness;
	
	
	// http://tamrielfoundry.com/topic/pts-2-1-2-sorcerer-arithmagic/
	// increase per level: H156, S20, M20
	// increase per attribute point spent: H122, S111, M111
	
	public Agent() {
		setupSlots();
		generateBase();
		generateArticles();
		generateConsumables();
		generateMundus();
		getFitness();
	}
	
	// 7 Body pieces, 3 Accessories, 2x2 Weapon Slots [14 total]
	private void setupSlots() {
		gear = new Slot[14];
		// {HEAD, SHOULDERS, CHEST, HANDS, WAIST, LEGS, FEET,
		for(int x = 0; x < 7; x++) gear[x] = new Slot(Location.values()[x]);
		
		// ACCESSORY, ACCESSORY, ACCESSORY,
		for(int x = 7; x < 10; x++) gear[x] = new Slot(Location.ACCESSORY);
		
		// WEAPON1_L, WEAPON1_R, WEAPON2_L, WEAPON2_R}
		for(int x = 10, y = 8; x < 14; x++, y++) gear[x] = new Slot(Location.values()[y]);
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
		// 7 Body pieces, 3 Accessories, 2x2 Weapon Slots
		
	}
	
	private void generateConsumables() {
		
	}
	
	private void generateMundus() {
		
	}
	
	public double getFitness() {
		return this.fitness;
	}
	
	public void calcFitness() {
		double f = 0.0;
		// behaviour that evaluate f
		setFitness(f);
	}
	
	private void setFitness(double fitness) {
		this.fitness = fitness;
	}
	
}

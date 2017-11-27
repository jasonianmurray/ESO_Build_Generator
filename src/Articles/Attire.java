/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * Attire describes Articles that are specific to body slots. Attire
 * represents cloth/armour. Attire has specialised enchantments/traits and
 * comes in either light, medium or heavy. Attire should have an armour value.
 */

package Articles;

import Agent.Location;
import Engine.Calculator;

public class Attire extends Article {
	
	Location location;
	ArmourType armourType;
	AttEnchantment enchant;
	AttTrait trait;
	int armourRating;
	
	// An array to be provided to the agent that
	// indicates any alterations to base stats
	// that this particular article provides
	int [] statBonus;
	
	Calculator calc = new Calculator();
	
	// Database constructor, define behaviour later
	public Attire() {
		
	}
	
	// Constructor used for testing...
	public Attire(String val, Location location) {
		this.location = location;
		if(val.equalsIgnoreCase("random")) {
			generateRandomAttire();
		} else {
			// other testing criteria
		}
	}
	
	private void generateRandomAttire() {
		name = "Randomly Generated Attire";
		armourType = ArmourType.getRandType();
		enchant = AttEnchantment.getRandEnchant();
		trait = AttTrait.getRandtTrait();
		armourRating = calc.calcArmourRating(location, armourType);
		applyEnchant();
		applyTrait();
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	String getDesc() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	String getEnchantment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	int getSetSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	int getArmourRating() {
		return this.armourRating;
	}
	
	public Object getArmourType() {
		return this.armourType;
	}

	
	void applyEnchant() {
		// TODO Auto-generated method stub
		
	}

	
	void applyTrait() {
		// TODO Auto-generated method stub
		
	}



}

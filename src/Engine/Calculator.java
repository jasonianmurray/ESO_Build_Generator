/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: --/--/----
 * Description:
 * The calculator class will contain most of the equations
 * used to evaluate the effectiveness of a particular build.
 * It will likely contain the fitness function, amongst other things.
 * It should represent the mathematics that make character builds
 * tick.
 * 
 */
package Engine;
import Agent.Location;
import Articles.ArmourType;
import Articles.Article;
import Consumables.Food;
import Effects.Skill;

public class Calculator {
	
	public int [] calcMaxHMS(int [] base, int [] attrPoints, Article [] gear, int CP, Food food, Article mundus, Skill [] skills) {
		// Stat pool = (((Base + Attribute Points + Gear) * CPI) 
		// + Food + (Mundus * Divines) + Gear1) 
		//				* Skills
		// Gear1 is Unique to Distruction Mastery and Necropotence (5 piece bonus)
		// CPI = (1 + (Relevant Champion Points^(0.56432))/100)
		// Mundus = 1 + (sum of divines pieces) 4*4.5% = 0.18 => 1.18
		// divines is rounded to 2 dec. places
		// Skills = 1 + (sum of all skills)
		// e.g Skills is 1.31 (8% Bound Aegis, 5% Inner light, 2% Magicka Controller, 10% Gift of Magnus, 6% Undaunted Mettle)
		return null	;
	}
	
	public int [] calcSWDamage(Article [] gear, Article mundus, Skill [] skills) {
		// SW Damage = Gear + (Warrior * Divines) * Skills
		return null;
	}
	
	public int [] calcHMSRec(int [] base, Article [] gear, Article mundus, Food food, Skill [] skills) {
		// Recovery = (Base + Gear + (Atronach * Divines) + food)*(Skills + RecoveryCPInvested)
		return null;
	}
	
	public double [] calcSWCritical() {
		// Sum all sources; 219 = 1%
		return null;
	}
	
	public int calcArmourRating(Location location, ArmourType type) {
		if(type == ArmourType.HEAVY) {
			if(location == Location.CHEST) {
				return 2772;
			} else if(location == location.HANDS) {
				return 1386;
			} else if(location == location.WAIST) {
				return 1039;
			} else {
				return 2425;
			}
		} else if(type == ArmourType.MEDIUM) {
			if(location == Location.CHEST) {
				return 2084;
			} else if(location == location.HANDS) {
				return 1042;
			} else if(location == location.WAIST) {
				return 781;
			} else {
				return 1823;
			}
		} else {
			if(location == Location.CHEST) {
				return 1396;
			} else if(location == location.HANDS) {
				return 698;
			} else if(location == location.WAIST) {
				return 523;
			} else {
				return 1221;
			}
		}
	}
}	


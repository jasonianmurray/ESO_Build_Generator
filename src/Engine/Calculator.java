package Engine;
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
}	


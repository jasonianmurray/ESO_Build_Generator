/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * the Weapon class is to describe specialised articles
 * that have damage values and specialised traits/enchantments.
 */

package Articles;

public class Weapon extends Article {
	
	int weaponDamage;
	WeapTrait trait;
	WeapEnchantment enchant;
	
	public Weapon() {
		
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
	
	int getWeaponDamage() {
		return this.weaponDamage;
	}
	
	void applyEnchant() {
		// TODO Auto-generated method stub
		
	}

	void applyTrait() {
		// TODO Auto-generated method stub
		
	}

}

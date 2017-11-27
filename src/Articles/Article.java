/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * Articles are the superclass of most wearable items. This class is here to
 * offer shared structure and lend guidance to the subclasses.
 */

package Articles;

public abstract class Article {
	// Set name
	String name;
	// Set unique ID
	String id;
	// Brief descriptioin
	String desc;
	// Current enchantment
	String enchantment;
	// Trait
	
	// Value of the set
	int value;
	
	// Number of pieces in set bonus
	int setSize;
	
	// Where the piece is worn
	String location;
	
	abstract String getName();
	
	// Unique ID for DB purposes
	abstract String getID();
	
	// The set's description
	abstract String getDesc();
	
	// Get the enchantment attached to the piece
	abstract String getEnchantment();
	
	// Value of piece in gold coins
	abstract int getValue();
	
	// Number of pieces for full set bonus, typically: 2,3 or 5
	abstract int getSetSize();
	
	// Each class must implement article subclass must implement
	// behaviours associated with their enchantment
	abstract void applyEnchant();
	
	// Each class must implement article subclass must implement
	// behaviours associated with their trait
	abstract void applyTrait();
	
	
}

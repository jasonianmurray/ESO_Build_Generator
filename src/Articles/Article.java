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
	
	
}

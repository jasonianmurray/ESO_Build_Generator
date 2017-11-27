/*
 * Author(s): Jason Ian Murray
 * Creation Date: 24/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * A slot acts as a container that holds a particular article. Slots should
 * have a location representing what it can hold. The should only be able to
 * hold 1 item at a time.
 */

package Agent;

public class Slot {
	private Location location;

	// The following will likely undergo further refinement
	// 'Object' will likely become a specialised type related
	// to a slottable item's domain
	private Object item;
	
	public Slot(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return this.location;
	}

	public Object getItem() {
		return this.item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}

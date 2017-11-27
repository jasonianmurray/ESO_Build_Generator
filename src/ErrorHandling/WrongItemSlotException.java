package ErrorHandling;

public class WrongItemSlotException extends Exception{
	public WrongItemSlotException(String message) {
		
		super("Item of the wrong type has been slotted: " + message);
	}
}

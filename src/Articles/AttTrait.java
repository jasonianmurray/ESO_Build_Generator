/*
 * Author(s): Jason Ian Murray
 * Creation Date: 27/11/2017
 * Date Modified: 27/11/2017
 * Description:
 * Here we have trait enumerations
 * 
 * The effects will be found within the specific article
 * 
 */

package Articles;

import Engine.Constants;

public enum AttTrait {
	DIVINES, INVIG, IMPEN, INFUSED, NIRNHONED, REINF, STURDY, TRAIN, WELLFITTED;
	
	public static AttTrait getRandtTrait() {
		return values()[Constants.RAND.nextInt(values().length)];
	}
}

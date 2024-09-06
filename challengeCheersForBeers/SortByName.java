/**
 * 
 */
package challengeCheersForBeers;

import java.util.Comparator;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class SortByName implements Comparator<Beer> {

	@Override
	public int compare(Beer o1, Beer o2) {
		// TODO Auto-generated method stub
		return o1.getBeerName().compareTo(o2.getBeerName());
	}

}

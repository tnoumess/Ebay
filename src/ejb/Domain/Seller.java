/**
 * 
 */
package ejb.Domain;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:27:42 AM
 * @Seller.java
 */
@Entity
public class Seller extends User{
	
	@OneToOne 
	@JoinColumn(name="ItemId")
	protected Item item;
	protected double startingprice;

}

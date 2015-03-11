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
 * @3:29:25 AM
 * @Bidder.java
 */
@Entity
public class Bidder extends User{
	
	@OneToOne 
	@JoinColumn(name="ItemId")
	protected Item item;
	protected double amount;
		
	}

package ejb.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:26:07 AM
 * @Buyer.java
 */
@Entity
public class Buyer extends User{
	
	@OneToOne 
	@JoinColumn(name="ItemId")
	protected Item item;
	@Column(name="FinalPrice")
	protected double FinalPrice;
		
	}

/**
 * 
 */
package ejb.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:30:34 AM
 * @Billing.java
 */
    //@IdClass(UserId.class)
@Entity
public class Billing {
	
	
	@Id
	@Column(name="BillingId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	protected Long BillingId;
	
	@Column(name="Email")
	protected String Email; 
	
	@Column(name="CCType")
	protected String CCType;
	
	@Column(name="CCnumber")
	protected int CCnumber;
	
    @Column(name="SecCode")
	protected short SecCode;
    
    @OneToOne //(mappedBy="billing",optional=false)
    @JoinColumn(name="UserId")
    protected User user;

}

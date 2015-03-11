/**
 * 
 */
package ejb.Domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:46:32 AM
 * @Address.java
 */
//@Embeddable
@Entity
public class Address {
	  
	 @Id
	 @Column(name="AddressId")
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 protected long AddressId;
	 
	  @Column(name="HOME_STREET")
	  protected String street;
	  @Column(name="HOME_CITY")
	  protected String city;
	  @Column(name="HOME_STATE")
	  protected String state;
	  @Column(name="HOME_ZIP")
	  protected String zipCode;
	  
	 /* @ManyToOne(fetch=FetchType.LAZY)
	  //@JoinColumn("UserIds")
	  protected User user;*/
	}

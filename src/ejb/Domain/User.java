package ejb.Domain;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:18:40 AM
 * @User.java
 */
    @Entity
    @Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
    public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="UserId")
	private long UserId;
	
	@Column(name="Email")
	private String Email; 
	
	@Column(name="UserName")
	private String UserName;
	
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	//@JoinColumn(name="Address", referencedColumnName="Email")
	private Set<Address> ShippingAddrs;
	
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	private Set<Item> items;
	
	@OneToOne 
	@JoinColumn(name="BillingId")
	private Billing billing;

}

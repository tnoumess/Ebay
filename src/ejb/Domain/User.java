package ejb.Domain;

import java.util.Collection;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
    public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private long UserIds;
	
	@Column(name="Email")
	private String Email; 
	
	@Column(name="UserName")
	private String UserName;
	/*
	@OneToMany(mappedBy="user")
	//@JoinColumn(name="Address", referencedColumnName="Email")
	private Set<Address> ShippingAdd;*/
	
	@OneToOne
	private Billing billing;

}

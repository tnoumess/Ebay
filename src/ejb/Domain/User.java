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

	/**
	 * @return the userId
	 */
	public long getUserId() {
		return UserId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(long userId) {
		UserId = userId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return UserName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		UserName = userName;
	}

	/**
	 * @return the shippingAddrs
	 */
	public Set<Address> getShippingAddrs() {
		return ShippingAddrs;
	}

	/**
	 * @param shippingAddrs the shippingAddrs to set
	 */
	public void setShippingAddrs(Set<Address> shippingAddrs) {
		ShippingAddrs = shippingAddrs;
	}

	/**
	 * @return the items
	 */
	public Set<Item> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(Set<Item> items) {
		this.items = items;
	}

	/**
	 * @return the billing
	 */
	public Billing getBilling() {
		return billing;
	}

	/**
	 * @param billing the billing to set
	 */
	public void setBilling(Billing billing) {
		this.billing = billing;
	}

	public User() {
		//super();
		// TODO Auto-generated constructor stub
	}

}
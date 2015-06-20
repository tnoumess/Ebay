/**
 * 
 */
package ejb.Domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; 
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:26:53 AM
 * @Account.java
 */

@NamedQueries({	
@NamedQuery(
		    name="finddao",
		    query="SELECT a FROM Account a Where a.Email =:email"),
@NamedQuery(
	    name="findbyemail",
	    query="SELECT a FROM Account a Where a.Email =:email"),
}) 
@Entity
public class Account implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6330201822778778830L;

	//private int Id;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="AccountId")
	protected long Id;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="Pwd")
	private String Pwd;
	
	@Column(name="Role")
	private String Role;
	
	
	//@prePersist
	/*
	 public void generatedprimaryKey(){
	 Id=UUID.randomUUID().toString();
	 } 
	 
	 * */
	
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
	 * @return the pwd
	 */
	public String getPwd() {
		return Pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.Pwd = pwd;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return Role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		Role = role;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return Id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		Id = id;
	}


	public Account() {
		//super();
	}
	
	/**
	 * Copy constructor.
	 */
	public Account(Account a) {
		this(a.getEmail(),a.getPwd(),a.getRole());
		//super();
	}	
	
	/**
	  * Regular constructor.
	  */
	public Account(String email,String pwd,String role){
		this.Email=email;
		this.Pwd=pwd;
		this.Role=role;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [Id=" + Id + ", Email=" + Email +", Pwd=" + Pwd +  "]";
	}

}
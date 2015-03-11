/**
 * 
 */
package ejb.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id; 

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:26:53 AM
 * @Account.java
 */
@Entity
public class Account {
	
	//private int Id;
	@Id
	@Column(name="Email")
	private String email;
	@Column(name="Pwd")
	private String pwd;
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
		return email;
	}
	
	
	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}
	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	public Account() {
		//super();
	}
	

}

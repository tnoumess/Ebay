/**
 * 
 */
package ejb.Domain;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:28:22 AM
 * @Item.java
 */
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ItemId")
	protected Long ItemId;
	
	@Column(name="Title")
	protected String Title;	
	@OneToOne 
	@JoinColumn(name="UserId", referencedColumnName="UserId")
	@ManyToOne(fetch=FetchType.LAZY)
	protected User user;
	
	@Column(name="PostDate")
	protected Date PostDate;
	
	@Column(name="Price")
	protected Double Price;
	
	@Column(name="Available")
	protected boolean Available;
	
	
}

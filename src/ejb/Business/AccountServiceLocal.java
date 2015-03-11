/**
 * 
 */
package ejb.Business;

import javax.ejb.Remote;

import ejb.Domain.Account;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @10:31:14 PM
 * @AccountServiceLocal.java
 */
@Remote
public interface AccountServiceLocal {
	
	public void create(Account a);
	
	public void delete(Object id);

	public Account find(Object id);

	public void update(Account a);

}

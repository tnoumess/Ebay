/**
 * 
 */
package ejb.Business;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import ejb.Domain.Account;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @10:31:14 PM
 * @AccountServiceLocal.java
 */
@Local
public interface AccountServiceLocal {
	
	public void create(Account a);
	
	public void delete(Object id);

	public Account find(Object id);
	
	public List<?> findemail(Object id);

	public void update(Account a);
	
	public void logout();
	
	public Account getAccount();

}
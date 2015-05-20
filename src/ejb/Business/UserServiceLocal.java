/**
 * 
 */
package ejb.Business;

import java.util.List;

import javax.ejb.Local;

import ejb.Domain.Account;
import ejb.Domain.User;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 13, 2015
 * @8:21:29 AM
 * @UserServiceLocal.java
 */
@Local
public interface UserServiceLocal {

public void create(User a);
	
	public void delete(Object id);

	public Account find(Object id);
	
	public List findemail(Object id);

	public void update(Account a);
}
/**
 * 
 */
package ejb.Dao;

import java.util.List;

import ejb.Domain.Account;
import ejb.Domain.User;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 13, 2015
 * @8:19:47 AM
 * @UserDaoLocal.java
 */
public interface UserDaoLocal {

public void createdao(User a);
	
	public void deletedao(Object id);

	public Account finddao(Object id);
	
	public List finddaobyEmail(Object id);

	public void updatedao(Account a);
}
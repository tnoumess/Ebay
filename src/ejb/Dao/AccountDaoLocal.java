/**
 * 
 */
package ejb.Dao;

import java.util.List;

import ejb.Domain.Account;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @10:24:58 PM
 * @AccountDaoLocal.java
 */
public interface AccountDaoLocal {
	
    public void createdao(Account a);
	
	public void deletedao(Object id);

	public Account finddao(Object id);
	
	public List<?> finddaobyEmail(Object id);
	

	public void updatedao(Account a);
	
	

}
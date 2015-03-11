/**
 * 
 */
package ejb.Dao;

import java.io.Serializable;

import ejb.Domain.Account;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @10:25:40 PM
 * @AccountDaoImpl.java
 */
public class AccountDaoImpl implements AccountDaoLocal, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8712261505620006787L;

	/* (non-Javadoc)
	 * @see ejb.Dao.AccountDaoLocal#createdao(ejb.Domain.Account)
	 */
	@Override
	public void createdao(Account a) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ejb.Dao.AccountDaoLocal#deletedao(java.lang.Object)
	 */
	@Override
	public void deletedao(Object id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ejb.Dao.AccountDaoLocal#finddao(java.lang.Object)
	 */
	@Override
	public Account finddao(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ejb.Dao.AccountDaoLocal#updatedao(ejb.Domain.Account)
	 */
	@Override
	public void updatedao(Account a) {
		// TODO Auto-generated method stub
		
	}


	

}

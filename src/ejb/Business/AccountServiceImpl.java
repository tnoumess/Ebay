/**
 * 
 */
package ejb.Business;

import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejb.Dao.AccountDaoLocal;
import ejb.Domain.Account;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @10:31:40 PM
 * @AccountServiceImpl.java
 */
@Stateful
public class AccountServiceImpl implements AccountServiceLocal {

	@Inject 
	private AccountDaoLocal adl;
	
	@PersistenceContext(unitName="Ebay")
	private  EntityManager em;
	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#create(ejb.Domain.Account)
	 */
	@Override
	public void create(Account a) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#find(java.lang.Object)
	 */
	@Override
	public Account find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#update(ejb.Domain.Account)
	 */
	@Override
	public void update(Account a) {
		// TODO Auto-generated method stub
		
	}

}

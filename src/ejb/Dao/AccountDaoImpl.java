/**
 * 
 */
package ejb.Dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;

import ejb.Domain.Account;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @10:25:40 PM
 * @AccountDaoImpl.java
 */
@Stateless
public class AccountDaoImpl implements AccountDaoLocal, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8712261505620006787L;
		
	@PersistenceContext(unitName="Ebay")
	private  EntityManager em;
	
	/* (non-Javadoc)
	 * @see ejb.Dao.AccountDaoLocal#createdao(ejb.Domain.Account)
	 */
	@Override
	public void createdao(Account a) {
		// TODO Auto-generated method stub
		System.out.println("in"+this);
		em.persist(a);
		
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

	/* (non-Javadoc)
	 * @see ejb.Dao.AccountDaoLocal#finddaobyEmail(java.lang.Object)
	 */
	
	@Override
	public List finddaobyEmail(Object email) {
		// TODO Auto-generated method stub
		List account= em.createNamedQuery("findbyemail")
			    .setParameter("email", email)
			    .getResultList();
			
		return account;
	}


	

}
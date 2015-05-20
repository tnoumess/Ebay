/**
 * 
 */
package ejb.Dao;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejb.Domain.Account;
import ejb.Domain.User;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 13, 2015
 * @8:20:33 AM
 * @UserDaoImpl.java
 */
@Stateless
public class UserDaoImpl implements UserDaoLocal,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5354067346692828108L;

	/* (non-Javadoc)
	 * @see ejb.Dao.UserDaoLocal#createdao(ejb.Domain.Account)
	 */
	@PersistenceContext(unitName="Ebay")
	private  EntityManager em;
	@Override
	public void createdao(User u) {
		// TODO Auto-generated method stub
		em.persist(u);
	}

	/* (non-Javadoc)
	 * @see ejb.Dao.UserDaoLocal#deletedao(java.lang.Object)
	 */
	@Override
	public void deletedao(Object id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ejb.Dao.UserDaoLocal#finddao(java.lang.Object)
	 */
	@Override
	public Account finddao(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ejb.Dao.UserDaoLocal#finddaobyEmail(java.lang.Object)
	 */
	@Override
	public List finddaobyEmail(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ejb.Dao.UserDaoLocal#updatedao(ejb.Domain.Account)
	 */
	@Override
	public void updatedao(Account a) {
		// TODO Auto-generated method stub
		
	}
	

}
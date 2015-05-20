/**
 * 
 */
package ejb.Business;

import java.util.List;

import javax.ejb.Stateful;
import javax.inject.Inject;

import ejb.Dao.UserDaoLocal;
import ejb.Domain.Account;
import ejb.Domain.User;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 13, 2015
 * @8:21:48 AM
 * @UserServiceImpl.java
 */
@Stateful
public class UserServiceImpl implements UserServiceLocal{

	/* (non-Javadoc)
	 * @see ejb.Business.UserServiceLocal#create(ejb.Domain.Account)
	 */
	@Inject
	UserDaoLocal usl;
	@Override
	public void create(User u) {
		// TODO Auto-generated method stub
		usl.createdao(u);
	}

	/* (non-Javadoc)
	 * @see ejb.Business.UserServiceLocal#delete(java.lang.Object)
	 */
	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ejb.Business.UserServiceLocal#find(java.lang.Object)
	 */
	@Override
	public Account find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ejb.Business.UserServiceLocal#findemail(java.lang.Object)
	 */
	@Override
	public List findemail(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ejb.Business.UserServiceLocal#update(ejb.Domain.Account)
	 */
	@Override
	public void update(Account a) {
		// TODO Auto-generated method stub
		
	}

}
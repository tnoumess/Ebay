/**
 * 
 */
package ejb.Business;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ejb.Dao.AccountDaoLocal;
import ejb.Domain.Account;
import ejb.interceptor.HelloInterceptor;
import ejb.interceptor.Logger;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @10:31:40 PM
 * @AccountServiceImpl.java
 */
@Named
@SessionScoped
//@Logger
public class AccountServiceImpl implements AccountServiceLocal, Serializable {

	@Inject 
	private AccountDaoLocal adl;
	
	
	Account account;
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#create(ejb.Domain.Account)
	 */
	@Override
	//@Logger
    @Interceptors(HelloInterceptor.class)
	public void create(Account a) {
		// TODO Auto-generated method stub
		System.out.println("in it"+this);
		setAccount(a);
		adl.createdao(a);
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
		return adl.finddao(id);
	}

	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#update(ejb.Domain.Account)
	 */
	@Override
	public void update(Account a) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#findemail(java.lang.Object)
	 */
	@Override
	public List findemail(Object id) {		// TODO Auto-generated method stub
		
		return adl.finddaobyEmail(id);
	}

	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#logout()
	 */
	@Override
	@Remove
	public void logout() {
		// TODO Auto-generated method stub
		setAccount(null);
	}
	
	
}
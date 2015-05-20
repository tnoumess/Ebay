/**
 * 
 */
package ejb.Business;

import java.io.Serializable;
import java.util.List;

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
	
	String email;
	/* (non-Javadoc)
	 * @see ejb.Business.AccountServiceLocal#create(ejb.Domain.Account)
	 */
	@Override
	//@Logger
    @Interceptors(HelloInterceptor.class)
	public void create(Account a) {
		// TODO Auto-generated method stub
		System.out.println("in it"+this);
		email=a.getEmail();
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
		return null;
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
	
	@Override
	public String getemail(){
		
		return email;
	}
}
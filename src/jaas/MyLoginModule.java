/**
 * 
 */
package jaas;

import java.io.IOException;
import java.util.Map;

import javax.security.auth.Subject;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import javax.security.auth.login.FailedLoginException;
import javax.security.auth.login.LoginException;
import javax.security.auth.spi.LoginModule;

/**
 * @author Thierry Edson Noumessi
 *
 * @date May 20, 2015
 * @12:36:14 AM
 * @MyLoginModule.java
 */
public class MyLoginModule  implements LoginModule{
	public static final String UserName="edson";
	public static final String Userpwd="edson";
	private CallbackHandler callbackHandler=null;
	private boolean Authflag=false;

	/* (non-Javadoc)
	 * @see javax.security.auth.spi.LoginModule#abort()
	 */
	@Override
	public boolean abort() throws LoginException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see javax.security.auth.spi.LoginModule#commit()
	 */
	@Override
	public boolean commit() throws LoginException {
		// TODO Auto-generated method stub
		return Authflag;
	}

	/* (non-Javadoc)
	 * @see javax.security.auth.spi.LoginModule#initialize(javax.security.auth.Subject, javax.security.auth.callback.CallbackHandler, java.util.Map, java.util.Map)
	 */
	@Override
	public void initialize(Subject subject, CallbackHandler callbackHandler,
			Map<String, ?> sharedState, Map<String, ?> options) {
		
		this.callbackHandler=callbackHandler;
		
	}

	/* (non-Javadoc)
	 * @see javax.security.auth.spi.LoginModule#login()
	 */
	@Override
	public boolean login() throws LoginException {
		// TODO Auto-generated method stub
		Callback[] callback=new Callback[2];
		callback[0]=new NameCallback("UserName");
		callback[1]=new PasswordCallback("Password", false);
		try {
			callbackHandler.handle(callback);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedCallbackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name=((NameCallback) callback[0]).getName();
		String pwd=new String(((PasswordCallback) callback[1]).getPassword());
		if(name.equals(UserName)&&pwd.equals(Userpwd))
		{
			System.out.println("Authentication Successfull");
			Authflag=true;
		}else{
			//System.out.println("Authentication failed");
		Authflag=false;
		throw new FailedLoginException("Authentication failed");
		}
		return Authflag;
		
	}

	/* (non-Javadoc)
	 * @see javax.security.auth.spi.LoginModule#logout()
	 */
	@Override
	public boolean logout() throws LoginException {
		// TODO Auto-generated method stub
		return false;
	}

}

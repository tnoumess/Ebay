/**
 * 
 */
package jaas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.NameCallback;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * @author Thierry Edson Noumessi
 *
 * @date May 20, 2015
 * @12:38:24 AM
 * @MyCallbackHandler.java
 */
public class MyCallbackHandler implements CallbackHandler{

	/* (non-Javadoc)
	 * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
	 */
	@Override
	public void handle(Callback[] callback) throws IOException,
			UnsupportedCallbackException {
		NameCallback namecallback=null;
		PasswordCallback pwdcallback=null;
		int counter=0;
		
		while(counter<callback.length){
			if(callback[counter]instanceof NameCallback){
				namecallback=(NameCallback) callback[counter++];
				System.out.println(namecallback.getPrompt());
				namecallback.setName(new BufferedReader(new InputStreamReader(System.in)).readLine());
				//put username
				
			}
			else if (callback[counter]instanceof PasswordCallback){
				pwdcallback=(PasswordCallback)callback[counter++];
				System.out.println(pwdcallback.getPrompt());
				pwdcallback.setPassword(new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray());
				//put pwd
			}
		}
	}

}

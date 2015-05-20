/**
 * 
 */
package action;

import jaas.MyCallbackHandler;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import com.opensymphony.xwork2.ActionSupport;
/**
 * @author Thierry Edson Noumessi
 *
 * @date May 20, 2015
 * @12:45:58 AM
 * @Login.java
 */
public class Login /*extends ActionSupport */ {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*public  String save()  
	   {
		System.setProperty("java.security.auth.login.config", "jaas.config");
		LoginContext lcx=null;
		try {
			 lcx=new LoginContext("Myjaas", new MyCallbackHandler());
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "input";
		}
		while(true){
			
			try {
				lcx.login();
				return "success";
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "input";
			}
		}
		
		
	   }*/
	 public static void main(String[] args) {
		// System.setProperty("java.security.auth.login.config", "jaas.config");
			LoginContext lcx=null;
			try {
				 lcx=new LoginContext("Myjaas", new MyCallbackHandler());
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				
			}
			while(true){
				
				try {
					lcx.login();
					System.exit(0);
				} catch (LoginException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					
				}
			}
		 
	 }

}

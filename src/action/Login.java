/**
 * 
 */
package action;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import java.util.Map;

import javax.inject.Inject;

import org.apache.struts2.interceptor.SessionAware;

import resource.PassHashInterface;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import ejb.Business.AccountServiceLocal;
import ejb.Domain.Account;
import ejb.Domain.User;


/**
 * @author Thierry Edson Noumessi
 *
 * @date May 20, 2015
 * @12:45:58 AM
 * @Login.java
 */
public class Login extends ActionSupport implements ModelDriven<Account>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8930461193700155653L;
	private Account account;	
		
	@Inject
	AccountServiceLocal asl;
	@Inject
	PassHashInterface phi;
	private Map session;
	
	
	
	 @SuppressWarnings("unchecked")
	@org.apache.struts2.interceptor.validation.SkipValidation
	 public  String login() throws NoSuchAlgorithmException, InvalidKeySpecException  
	   {
		 Account acc=asl.find(account.getEmail());
		 
		 if(session!=null){
			 System.out.println("object:"+session.get("logined"));
			 return session.get("logined").equals("true")? "success":"input";
			 
		 }
		 
		if(acc!=null && account.getEmail().equals(acc.getEmail())&& phi.validatePassword(account.getPwd(), acc.getPwd())){
			 
			session = ActionContext.getContext().getSession();
			session.put("logined","true");
			session.put("context", new Date());	
		    
			 System.out.println("object:"+session.get("logined"));
		 return "success";
		}else{
		 return "input";
		}
	   }
	 
	 @org.apache.struts2.interceptor.validation.SkipValidation
	 public  String logout()  
	   {
		 session = ActionContext.getContext().getSession();
		 session.remove("logined");
		 session.remove("context");
		
		 return "success";
		
	   }
	 
	 @org.apache.struts2.interceptor.validation.SkipValidation
	 public  String next()  
	   {
		     
		 return "success";
		 
	   }
	 
	 @Override
		public Account getModel() {
			// TODO Auto-generated method stub
			account=new Account();
			return account;
		}

	
		
}

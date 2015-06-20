/**
 * 
 */
package action;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import resource.PassHashInterface;

import com.mysql.jdbc.util.LRUCache;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import ejb.Business.AccountServiceLocal;
import ejb.Business.UserServiceLocal;
import ejb.Domain.Account;
import ejb.Domain.User;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 13, 2015
 * @2:32:29 AM
 * @Registration.java
 */
public class Registration extends ActionSupport implements ModelDriven<Account> {
		
	private static final long serialVersionUID = -8930461193700155653L;
	private Account account;
	private User user;
	private Account client;
	
	
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 */
	@Inject
	AccountServiceLocal asl;
	@Inject
	PassHashInterface phi;
/*50*/	@Inject
	UserServiceLocal usl;
	 private final Lock lock =new ReentrantLock();
	 
	 @org.apache.struts2.interceptor.validation.SkipValidation
	 public  String save()  
	   {
		 setClient(asl.getAccount());
		 	     
		 if(asl.getAccount()!=null)
		 return "success";
		 return "input";
	   }
	 @org.apache.struts2.interceptor.validation.SkipValidation
	 public  String logout()  
	   {
		 		 
	    asl.logout();
	    System.out.println("account: "+asl.getAccount());
		 if(asl.getAccount()==null)
		 return "success";
		 return "input";
	   }
	 
	 @org.apache.struts2.interceptor.validation.SkipValidation
	 public  String save2()  
	   {
		 if(asl.getAccount()!=null){
         setClient(asl.getAccount());		 
	     System.out.println("email is this: "+getClient().getEmail());}
		 if(asl.getAccount()!=null)
		 return "success";
		 return "input";
	   }
	 
	 public  String execute() throws NoSuchAlgorithmException, InvalidKeySpecException, InterruptedException 
	   {		  
		 user=new User();
		 user.setEmail(account.getEmail().toString().trim());		 
		 System.out.println("in execute");
	   account.setRole("Regular");
	   account.setPwd(phi.createHash(account.getPwd()));
	   
	   //TimeUnit.SECONDS.sleep(15);// Testing purposes
	   
	   /*
	    * NB. the primary key in Account(AccountId) does not
	    * Necessary matches the primary key in User(Id) 
	    */
	   setClient(account);
		asl.create(account);
		usl.create(user);
	   lock.unlock();	
	   return "success";
		 
	   }
	 
	 
	 /**
	*
	* 
	* Back-end Form validation 
	* 
	*/
	@Override
    public  synchronized void  validate(){
		System.out.println("in valid");
		if(account.getEmail()==null||account.getEmail().trim().equals("")){
			addFieldError("email","The Email is  required");	
		}
        if(account.getPwd()==null||account.getPwd().trim().equals("")){
        	addFieldError("pwd","The password is required");	
		}
        if(account.getEmail()!=null&& !account.getEmail().trim().equals("")){
        	System.out.println(account.getEmail());
        	String  expression="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            CharSequence inputStr = account.getEmail();
            Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(inputStr);	               
            if(!matcher.matches())
              //  addFieldError("email","Invalid email address");
         	   addFieldError("email2","Invalid email address:"+account.getEmail());
            }
        System.out.println("in");
        if(account.getPwd()!=null&&!account.getPwd().trim().equals("")){
        
        	if(account.getPwd().length()<6){
        		addFieldError("pwd2","Password too short[6-15]");
        	}
        		else if(account.getPwd().length()>15){
        		addFieldError("pwd2","Password too long[6-15]");
        	}
        	
        	else{
        		String  expression="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,15}$";
                CharSequence inputStr = account.getPwd();
                Pattern pattern = Pattern.compile(expression,Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(inputStr);	               
                if(!matcher.matches()){
                  
             	   addFieldError("pwd2","password too simple");
                   addFieldError("pwd3","Should contain at least 1 UC 1 LC and 1 digit");
                }else{
                	/*
                	 * Check for Email existence.
                	 */
                	lock.tryLock();
                	if(asl.findemail(account.getEmail().toString().trim()).size()!=0){
                		addFieldError("email3","This email is already being used!");
                	}
                	
                }
                    		
        	}
        }
      	
	}
	@Override
	public Account getModel() {
		// TODO Auto-generated method stub
		account=new Account();
		return account;
	}
	
	/**
	 * @return the client
	 */
	public Account getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public void setClient(Account client) {
		this.client = client;
	}
}
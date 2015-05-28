/**
 * 
 */
package ejb.interceptor;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author Thierry Edson Noumessi
 *
 * @date May 28, 2015
 * @3:01:29 PM
 * @ClearCache.java
 */
public class ClearCache extends AbstractInterceptor {
	 
	   private static final long serialVersionUID= 1L;
	  
	/* (non-Javadoc)
	 * @see com.opensymphony.xwork2.interceptor.AbstractInterceptor#intercept(com.opensymphony.xwork2.ActionInvocation)
	 */
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		final ActionContext context = arg0.getInvocationContext();
	      HttpServletResponse response = (HttpServletResponse) context.get(StrutsStatics.HTTP_RESPONSE);
	      if(response!=null){
	         response.setHeader("Cache-control", "no-cache, no-store");
	         response.setHeader("Pragma","no-cache");
	         response.setHeader("Expires", "0");
	         System.out.println("inside interceptor");
	      }
	      return arg0.invoke();
	}
	}

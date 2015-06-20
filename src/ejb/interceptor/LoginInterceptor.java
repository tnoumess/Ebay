/**
 * 
 */
package ejb.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Jun 19, 2015
 * @5:31:17 PM
 * @LoginInterceptor.java
 */
public class LoginInterceptor extends AbstractInterceptor {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public String intercept(ActionInvocation invocation) throws Exception {
            Map<String, Object> session = invocation.getInvocationContext().getSession();
            
            
            String loginId = (String) session.get("logined");

            if (loginId == null||session.isEmpty()) 
            {            	
            	System.out.println("in login interceptor null:"+session.isEmpty());
                    return "input";
            } 
            else 
            {
            	System.out.println("in login interceptor not null:"+session.isEmpty());
                    return invocation.invoke();
            }
    }
}

/**
 * 
 */
package ejb.interceptor;


import java.io.Serializable;
import javax.security.auth.login.*;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * @author Thierry Edson Noumessi
 *
 * @date May 19, 2015
 * @10:13:11 PM
 * @Hello.java
 */
@Logger
@Interceptor
public class HelloInterceptor implements Serializable{
  @AroundInvoke
  public Object sayHello(InvocationContext ctx) throws Exception {
    System.out.println("Hello Interceptor!:"+ctx.getMethod().getName());
    return ctx.proceed();
  }
}

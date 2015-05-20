/**
 * 
 */
package resource;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 13, 2015
 * @7:37:57 AM
 * @PassHashInterface.java
 */
public interface PassHashInterface {

	public String createHash(String pwd) throws NoSuchAlgorithmException, InvalidKeySpecException;
	public  boolean validatePassword(String password, String correctHash)throws NoSuchAlgorithmException, InvalidKeySpecException;
}
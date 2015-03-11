/**
 * 
 */
package ejb.Domain;

import java.io.Serializable;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @2:48:50 PM
 * @UserId.java
 */
public class UserId implements Serializable {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5743717161902381270L;
	private long UserIds;
	private String Email;
	public UserId() {
		//super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the userIds
	 */
	public long getUserIds() {
		return UserIds;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + (int) (UserIds ^ (UserIds >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof UserId)) {
			return false;
		}
		UserId other = (UserId) obj;
		if (Email == null) {
			if (other.Email != null) {
				return false;
			}
		} else if (!Email.equals(other.Email)) {
			return false;
		}
		if (UserIds != other.UserIds) {
			return false;
		}
		return true;
	}
	
}

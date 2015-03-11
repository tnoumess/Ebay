/**
 * 
 */
package ejb.Domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:32:38 AM
 * @Bid.java
 */
public class Bid {
	
	/*
	protected Long bidId;
	
	protected Double amount;
	
    protected Bidder bidder; 
	
	protected Date timestamp;
	
	protected boolean over;	
	
	protected Item item;
		
	/**
	 * @return the bidId
	 */
	
	/*
	@Id
	@Column(name="BidId")
	public Long getBidId() {
		return bidId;
	}


	/**
	 * @param bidId the bidId to set
	 */
	/*
	public void setBidId(Long bidId) {
		this.bidId = bidId;
	}


	/**
	 * @return the amount
	 */
	
	/*
	@Column(name="Amount")
	public Double getAmount() {
		return amount;
	}


	/**
	 * @param amount the amount to set
	 */
	/*
	public void setAmount(Double amount) {
		this.amount = amount;
	}


	/**
	 * @return the bidder
	 */
	/*
	@ManyToOne
	@JoinColumn(name="BidderId", referencedColumnName="Email")
	public Bidder getBidder() {
		return bidder;
	}


	/**
	 * @param bidder the bidder to set
	 */
	/*
	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}


	/**
	 * @return the timestamp
	 */
	/*
	@Column(name="Timestamp")
	public Date getTimestamp() {
		return timestamp;
	}


	/**
	 * @param timestamp the timestamp to set
	 */
	/*
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}


	/**
	 * @return the over
	 */
	/*
	@Column(name="Isover")
	public boolean isOver() {
		return over;
	}


	/**
	 * @param over the over to set
	 */
	/*
	public void setOver(boolean over) {
		this.over = over;
	}


	/**
	 * @return the item
	 */
	/*
	@ManyToOne
	@JoinColumn(name="ItemId", referencedColumnName="ItemId")
	public Item getItem() {
		return item;
	}


	/**
	 * @param item the item to set
	 */
	/*
	public void setItem(Item item) {
		this.item = item;
	}


	*/

}

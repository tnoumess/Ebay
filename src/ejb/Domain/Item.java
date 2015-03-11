/**
 * 
 */
package ejb.Domain;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author Thierry Edson Noumessi
 *
 * @date Mar 10, 2015
 * @3:28:22 AM
 * @Item.java
 */
public class Item {
/*
	protected Long ItemId;
	
	protected String Title;	
	
	protected Bidder bidder;
	
	protected Date Postdate;
	
	protected Double Price;
	
	//@OneToMany(mappedBy="item")
	protected Set<Bid> bids;

	/**
	 * @return the itemId
	 */
	/*
	@Id
	@Column(name="ItemId")
	public Long getItemId() {
		return ItemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	/*
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}

	/**
	 * @return the title
	 */
	/*
	@Column(name="ItemId")
	public String getTitle() {
		return Title;
	}

	/**
	 * @param title the title to set
	 */
	/*
	public void setTitle(String title) {
		Title = title;
	}

	/**
	 * @return the bidder
	 */
	/*
	@OneToMany
	@JoinColumn(name="BidderId", referencedColumnName="BidderId")
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
	 * @return the postdate
	 */
	/*
	@Column(name="Postdate")
	public Date getPostdate() {
		return Postdate;
	}

	/**
	 * @param postdate the postdate to set
	 */
	/*
	public void setPostdate(Date postdate) {
		Postdate = postdate;
	}

	/**
	 * @return the price
	 */
	/*
	@Column(name="Price")
	public Double getPrice() {
		return Price;
	}

	/**
	 * @param price the price to set
	 */
	/*
	public void setPrice(Double price) {
		Price = price;
	}

	/**
	 * @return the bids
	 */
	/*
	public Set<Bid> getBids() {
		return bids;
	}

	/**
	 * @param bids the bids to set
	 */
	/*
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}
	*/
}

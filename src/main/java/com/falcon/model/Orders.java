package com.falcon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "orders", catalog = "falcon")
public class Orders {
	private long id;
	private long lenderId;
	private long itemId;
	private Date createdAt;
	private String status;
	private Date shippedDate;
	private String toStreet;
	private String toCity;
	private String toState;
	private String toCountry;
	private String fromStreet;
	private String fromCity;
	private String fromState;
	private String fromCountry;

	public Orders() {

	}

	public Orders(long id, long lenderId, long itemId, Date createdAt, String status, Date shippedDate, String toStreet,
			String toCity, String toState, String toCountry, String fromStreet, String fromCity, String fromState,
			String fromCountry) {
		super();
		this.id = id;
		this.lenderId = lenderId;
		this.itemId = itemId;
		this.createdAt = createdAt;
		this.status = status;
		this.shippedDate = shippedDate;
		this.toStreet = toStreet;
		this.toCity = toCity;
		this.toState = toState;
		this.toCountry = toCountry;
		this.fromStreet = fromStreet;
		this.fromCity = fromCity;
		this.fromState = fromState;
		this.fromCountry = fromCountry;
	}

	@Column(name = "id", nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "lender_id", nullable = false)
	public long getLenderId() {
		return lenderId;
	}

	public void setLenderId(long lenderId) {
		this.lenderId = lenderId;
	}

	@Column(name = "item_id", nullable = false)
	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	@Column(name = "created_at")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "shipped_date")
	public Date getShippedDate() {
		return shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	@Column(name = "to_street")
	public String getToStreet() {
		return toStreet;
	}

	public void setToStreet(String toStreet) {
		this.toStreet = toStreet;
	}

	@Column(name = "to_city")
	public String getToCity() {
		return toCity;
	}

	public void setToCity(String toCity) {
		this.toCity = toCity;
	}

	@Column(name = "to_state")
	public String getToState() {
		return toState;
	}

	public void setToState(String toState) {
		this.toState = toState;
	}

	@Column(name = "to_country")
	public String getToCountry() {
		return toCountry;
	}

	public void setToCountry(String toCountry) {
		this.toCountry = toCountry;
	}

	@Column(name = "from_street")
	public String getFromStreet() {
		return fromStreet;
	}

	public void setFromStreet(String fromStreet) {
		this.fromStreet = fromStreet;
	}

	@Column(name = "from_city")
	public String getFromCity() {
		return fromCity;
	}

	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}

	@Column(name = "from_state")
	public String getFromState() {
		return fromState;
	}

	public void setFromState(String fromState) {
		this.fromState = fromState;
	}

	@Column(name = "from_country")
	public String getFromCountry() {
		return fromCountry;
	}

	public void setFromCountry(String fromCountry) {
		this.fromCountry = fromCountry;
	}

}

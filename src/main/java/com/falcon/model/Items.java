package com.falcon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "items", catalog = "falcon")
public class Items {
	private long id;
	private long productId;
	private String name;
	private String description;
	private String requiredItems;
	private String barcode;
	private long lenderId;
	private String status;

	public Items() {

	}

	public Items(long id, long productId, String name, String description, String requiredItems, String barcode,
			long lenderId, String status) {
		super();
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.requiredItems = requiredItems;
		this.barcode = barcode;
		this.lenderId = lenderId;
		this.status = status;
	}

	@Column(name = "id", nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "product_id")
	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "required_items")
	public String getRequiredItems() {
		return requiredItems;
	}

	public void setRequiredItems(String requiredItems) {
		this.requiredItems = requiredItems;
	}

	@Column(name = "barode")
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	@Column(name = "lender_id")
	public long getLenderId() {
		return lenderId;
	}

	public void setLenderId(long lenderId) {
		this.lenderId = lenderId;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}

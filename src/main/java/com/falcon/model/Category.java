package com.falcon.model;

import java.util.Date;
import javax.persistence.Column;

public class Category {
	private long id;
	private String name;
	private String description;
	private int addedBy;
	private String status;
	private long parentCategoryId;
	private String categoryImages;
	private Date createdAt;

	public Category() {

	}

	public Category(long id, String name, String description, int addedBy, String status, long parentCategoryId,
			String categoryImages, Date createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.addedBy = addedBy;
		this.status = status;
		this.parentCategoryId = parentCategoryId;
		this.categoryImages = categoryImages;
		this.createdAt = createdAt;
	}

	@Column(name = "id", nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false)
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

	@Column(name = "added_by")
	public int getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(int addedBy) {
		this.addedBy = addedBy;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "parent_category_id")
	public long getParentCategoryId() {
		return parentCategoryId;
	}

	public void setParentCategoryId(long parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}

	@Column(name = "category_images")
	public String getCategoryImages() {
		return categoryImages;
	}

	public void setCategoryImages(String categoryImages) {
		this.categoryImages = categoryImages;
	}

	@Column(name = "craeted_at")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}

package com.falcon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	private long id;
	private String fullName;
	private String email;
	private String mobile;
	private String idProofType;
	private String idNumber;
	private String idProofImage;
	private String profilePic;
	private String street;
	private String city;
	private String state;
	private String country;
	private String alterNateNumber;
	private Date registrationDate;
	private String status;

	public Users(long id, String fullName, String email, String mobile, String idProofType, String idNumber,
			String idProofImage, String profilePic, String street, String city, String state, String country,
			String alterNateNumber, Date registrationDate, String status) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.mobile = mobile;
		this.idProofType = idProofType;
		this.idNumber = idNumber;
		this.idProofImage = idProofImage;
		this.profilePic = profilePic;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.alterNateNumber = alterNateNumber;
		this.registrationDate = registrationDate;
		this.status = status;
	}

	@Column(name = "id", nullable = false)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "full_name")
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobile")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "id_proof_type")
	public String getIdProofType() {
		return idProofType;
	}

	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}

	@Column(name = "id_number")
	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	@Column(name = "id_proof_image")
	public String getIdProofImage() {
		return idProofImage;
	}

	public void setIdProofImage(String idProofImage) {
		this.idProofImage = idProofImage;
	}

	@Column(name = "profile_pic")
	public String getProfilePic() {
		return profilePic;
	}

	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}

	@Column(name = "street")
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Column(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "alternate_number")
	public String getAlterNateNumber() {
		return alterNateNumber;
	}

	public void setAlterNateNumber(String alterNateNumber) {
		this.alterNateNumber = alterNateNumber;
	}

	@Column(name = "registration_date")
	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Column(name = "status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

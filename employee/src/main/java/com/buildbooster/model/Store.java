package com.buildbooster.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="store_branding")
@EntityListeners(AuditingEntityListener.class)
public class Store {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String storename;
	
	@NotBlank
	private String street;
	
	@NotBlank
	private String miscellaneous1;
	
	private String miscellaneous2;
	
	private String miscellaneous3;
	
	@NotBlank
	private String logo;
	
	@NotNull(message= "ID required")
	private Long business_details_id;
	
	@NotBlank
	private String tagline; 
	
	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStorename() {
		return storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getMiscellaneous1() {
		return miscellaneous1;
	}

	public void setMiscellaneous1(String miscellaneous1) {
		this.miscellaneous1 = miscellaneous1;
	}

	public String getMiscellaneous2() {
		return miscellaneous2;
	}

	public void setMiscellaneous2(String miscellaneous2) {
		this.miscellaneous2 = miscellaneous2;
	}

	public String getMiscellaneous3() {
		return miscellaneous3;
	}

	public void setMiscellaneous3(String miscellaneous3) {
		this.miscellaneous3 = miscellaneous3;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public Long getBusiness_details_id() {
		return business_details_id;
	}

	public void setBusiness_details_id(Long business_details_id) {
		this.business_details_id = business_details_id;
	} 
	
	
	
}

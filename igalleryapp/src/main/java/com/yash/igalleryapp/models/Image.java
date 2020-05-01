package com.yash.igalleryapp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Image {

	@Id 
	@GeneratedValue
	private Long id;
	private String category;
	private String caption;
	private String url;

	public Image() {
		
	}
	
	public Image(Long id, String category, String caption, String url) {
		super();
		this.id = id;
		this.category = category;
		this.caption = caption;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}

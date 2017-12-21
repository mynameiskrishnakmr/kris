
package com.bookstore;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;


import org.hibernate.cfg.Configuration;

@Entity
@DiscriminatorValue("EBOOK")
public class Ebook extends Book {
	@Column(name="download_url")
	private String downloadUrl;
	@Column(name="size_in_mb")
	private float sizeInMb;

	public Ebook() {
		super();
		
	}

	public Ebook(String downloadUrl, float sizeInMb) {
		super();
		this.downloadUrl = downloadUrl;
		this.sizeInMb = sizeInMb;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public float getSizeInMb() {
		return sizeInMb;
	}

	public void setSizeInMb(float sizeInMb) {
		this.sizeInMb = sizeInMb;
	}



}
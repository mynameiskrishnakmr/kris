package com.bookstore;



import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("BOOK")
public class Book {
	
	
	@OneToOne
	@JoinColumn(name="Author_Id")
	private Author profile;
	public Author getProfile() {
		return profile;
	}

	public void setProfile(Author profile) {
		this.profile = profile;
	}                                            
	
	@Id
	@GeneratedValue
	@Column(name="book_id")
	private int id;
	@Column
	private String title;
	

	@Column
	private double price;
	@Column
	private String isbn;
	@Column
	private String publisher;
	@Column
	private String edition;

	Book() {

	}
	

	public Book(int id, String title, Author profile, double price, String isbn, String publisher, String edition) {
		super();
		this.id = id;
		this.title = title;
		this.profile = profile;
		this.price = price;
		this.isbn = isbn;
		this.publisher = publisher;
		this.edition = edition;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

}
package entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Long book_id;
    private String name ;
    private String author ;

    public Book(Long book_id, String name, String author, String price) {
        this.book_id = book_id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    private String price ;

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String auther) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getBook_id() {
        return book_id;
    }

    public void setBook_id(Long book_id) {
        this.book_id = book_id;
    }
}
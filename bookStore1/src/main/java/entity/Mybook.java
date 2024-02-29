package entity;


import javax.persistence.*;

@Entity
public class Mybook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mybook_id", nullable = false)
    private Long mybook_id;
    private String name ;
    private String author ;
    private String price ;

    public Mybook(Long mybook_id, String name, String author, String price) {
        this.mybook_id = mybook_id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Mybook() {

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

    public void setAuther(String auther) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getMybook_id() {
        return mybook_id;
    }

    public void setMybook_id(Long mybook_id) {
        this.mybook_id = mybook_id;
    }
}
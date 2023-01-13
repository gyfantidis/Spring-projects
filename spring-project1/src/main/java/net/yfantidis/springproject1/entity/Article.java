package net.yfantidis.springproject1.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity // Σχετίζεται με Βάση Δεδομένων
@Table(name = "articles") // Το όνομα του πίνακα θα είναι "articles", default θα ήταν Article
public class Article {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String title;
    private String content;

    //Συσχέτηση άρθρου με συντάκτη Article with Author
    @ManyToOne
    private Author author;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

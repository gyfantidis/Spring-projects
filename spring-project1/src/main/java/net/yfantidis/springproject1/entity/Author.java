package net.yfantidis.springproject1.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity // Σχετίζεται με Βάση Δεδομένων
@Table(name = "authors") // Το όνομα του πίνακα θα είναι "authors", default θα ήταν Author
public class Author {

    //Για να δημιουργήσει id η Spring
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    @OneToMany
    private Set<Article> articles = new HashSet<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

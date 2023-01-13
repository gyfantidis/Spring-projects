package net.yfantidis.springproject1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity // Σχετίζεται με Βάση Δεδομένων
@Table(name = "authors") // Το όνομα του πίνακα θα είναι "authors", default θα ήταν Author
public class Author {

    //Για να δημιουργήσει id η Spring
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

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

package net.yfantidis.springproject1.service;

import java.util.List;
import java.util.Optional;

// c.r.u.d. from Create Read Update Delete

// Η Μέθοδος δέχεται ένα αντικείμενο πχ ENTITY_TYPE = Article
public interface CrudService<ENTITY_TYPE> {

    //Μέθοδοι για create, read, update and delete

    //create
    ENTITY_TYPE create(ENTITY_TYPE entity);

    //read
   Optional<ENTITY_TYPE> read(String id);

    List<ENTITY_TYPE> read();

    //update
    ENTITY_TYPE update(ENTITY_TYPE entity, String id);

    //delete
    void delete (String id);


}

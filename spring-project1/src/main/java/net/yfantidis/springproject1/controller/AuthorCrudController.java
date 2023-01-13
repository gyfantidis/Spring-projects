package net.yfantidis.springproject1.controller;

import net.yfantidis.springproject1.entity.Author;
import net.yfantidis.springproject1.service.AuthorCrudService;
import net.yfantidis.springproject1.service.CrudService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/authors")
public class AuthorCrudController implements CrudController<Author>{

    private final AuthorCrudService authorCrudService;

    public AuthorCrudController(AuthorCrudService authorCrudService) {
        this.authorCrudService = authorCrudService;
    }


    @Override
    public CrudService<Author> getCrudService() {
        return authorCrudService;
    }
}

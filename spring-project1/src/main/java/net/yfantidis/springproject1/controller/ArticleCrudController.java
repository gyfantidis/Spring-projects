package net.yfantidis.springproject1.controller;

import net.yfantidis.springproject1.service.ArticleCrudService;
import net.yfantidis.springproject1.service.CrudService;
import net.yfantidis.springproject1.entity.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class ArticleCrudController implements CrudController<Article>{

    private final ArticleCrudService articleCrudService;

    public ArticleCrudController(ArticleCrudService articleCrudService) {
        this.articleCrudService = articleCrudService;
    }


    @Override
    public CrudService<Article> getCrudService() {
        return articleCrudService;
    }
}

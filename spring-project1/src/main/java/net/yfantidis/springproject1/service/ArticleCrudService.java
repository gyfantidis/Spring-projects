package net.yfantidis.springproject1.service;

import net.yfantidis.springproject1.entity.Article;
import net.yfantidis.springproject1.entity.Author;
import net.yfantidis.springproject1.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleCrudService implements CrudService<Article> {

    private final ArticleRepository articleRepository;

    public ArticleCrudService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    //Δουλεύουμε κάθε μέθοδο που παίρνουμε από την κλάση CrudService


    @Override
    public Article create(Article entity) {
        return articleRepository.save(entity);
    }

    @Override
    public Optional<Article> read(String id) {
        return articleRepository.findById(id);
    }

    @Override
    public List<Article> read() {
        return articleRepository.findAll();
    }

    @Override
    public Article update(Article entity, String id) {

        //Βρες την εγγραφή
        Optional<Article> oldRecord = read(id);

        //Εάν δεν υπάρχει δημιούργησέ την από την αρχή
        if (!(oldRecord.isPresent())) {
            return create(entity);
        }

        //Εάν υπάρχει
        //Φέρε μου την παλιά εγγραφή ως Actual
        Article oldRecordActual = oldRecord.get();

        //Πάρε την παλιά εγγραφή και το παλιό id
        Author oldAuthor = oldRecordActual.getAuthor();
        String oldId = oldRecordActual.getId();

        //Ενημέρωσε το id και το Author
        entity.setId(oldId);
        entity.setAuthor(oldAuthor);

        return articleRepository.save(entity);

    }

    @Override
    public void delete(String id) {
        articleRepository.deleteById(id);
    }
}

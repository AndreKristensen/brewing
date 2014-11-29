package no.ask.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import no.ask.repository.enteties.Brew;

public class BrewDAOService implements BrewDAO{

    private String BREW = "no.ask.repository.enteties.Brew";
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public BrewDAOService() {
        // TODO Auto-generated constructor stub
    }

    @Override
    @org.springframework.transaction.annotation.Transactional
    public void createBrew(Brew brew) {
       entityManager.persist(brew);
       entityManager.flush();
    }

    @Override
    public List<Brew> getAllBrews() {
        return entityManager.createQuery("from " + BREW, Brew.class).getResultList();
    }
}

package no.ask.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.joda.time.Instant;
import org.springframework.transaction.annotation.Transactional;

import no.ask.repository.enteties.BeerSmith;
import no.ask.repository.enteties.vo.BeerSmithVO;

public class BeerSmithDAOService implements BeerSmithDAO {
    private String BREW = "no.ask.repository.enteties.BeerSmith";
    @PersistenceContext
    private EntityManager entityManager;

    public BeerSmithDAOService() {
        // TODO Auto-generated constructor stub
    }

    @Override
    @Transactional
    public void createBrew(BeerSmith brew) {
        entityManager.persist(brew);
        entityManager.flush();
    }

    @Override
    public List<BeerSmithVO> getAllBrews() {

        List<BeerSmith> resultList = entityManager.createQuery("from " + BREW, BeerSmith.class).getResultList();
        List<BeerSmithVO> voList = new ArrayList<>();
        for (BeerSmith bs : resultList) {
            voList.add(new BeerSmithVO(bs.getId(), bs.getBatchNumber(), bs.getName(), bs.getBrewer(), bs.getStyle(), bs.getType(), new Instant(bs.getBrewDateInMillis()), new Instant(bs.getBottledDateInMillis()), new Instant(bs.getEndDateInMillis()), bs.getHops(), bs.getGrains(), bs.getmBottlingVolume(), bs.getmMashEff(), bs.getmABV(), bs.getVersion()));
        }

        return voList;
    }

}

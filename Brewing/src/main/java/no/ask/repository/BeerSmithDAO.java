package no.ask.repository;

import java.util.List;

import no.ask.repository.enteties.BeerSmith;
import no.ask.repository.enteties.vo.BeerSmithVO;

public interface BeerSmithDAO {
    void createBrew(BeerSmith brew);

    List<BeerSmithVO> getAllBrews();
}

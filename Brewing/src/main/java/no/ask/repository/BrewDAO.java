package no.ask.repository;

import java.util.List;

import no.ask.repository.enteties.Brew;

public interface BrewDAO   {
    
    public void createBrew(Brew brew);

    public List<Brew> getAllBrews();

}

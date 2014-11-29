package no.ask;

public enum BrewType {

    
    Extract("Extract"), AllGrain("All Grain");
    
    private String type;
    private BrewType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}

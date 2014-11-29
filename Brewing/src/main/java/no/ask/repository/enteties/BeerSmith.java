package no.ask.repository.enteties;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import no.ask.BrewType;

@Entity(name = "beersmith")
public class BeerSmith {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Basic
    private int batchNumber;
    
    @Basic
    private String name;
    
    @Basic
    private String brewer;
    
    @Basic
    private String style;

    @Basic
    @Enumerated(EnumType.STRING)
    private BrewType type;

    @Basic
    private long brewDateInMillis;

    @Basic
    private long bottledDateInMillis;
    
    @Basic
    private long endDateInMillis;

    @Basic
    private double hops;
    
    @Basic
    private double grains;
    
    @Basic
    private double mBottlingVolume;
    
    @Basic
    private double mMashEff;
    
    @Basic
    private double mABV;
    
    @Basic
    private double version;

    public BeerSmith() {
        // TODO Auto-generated constructor stub
    }

    
    public BeerSmith(int batchNumber, String name, String brewer, String style, BrewType type, long brewDateInMillis, long bottledDateInMillis, long endDateInMillis, double hops, double grains, double mBottlingVolume, double mMashEff, double mABV, double version) {
        super();
        this.batchNumber = batchNumber;
        this.name = name;
        this.brewer = brewer;
        this.style = style;
        this.type = type;
        this.brewDateInMillis = brewDateInMillis;
        this.bottledDateInMillis = bottledDateInMillis;
        this.endDateInMillis = endDateInMillis;
        this.hops = hops;
        this.grains = grains;
        this.mBottlingVolume = mBottlingVolume;
        this.mMashEff = mMashEff;
        this.mABV = mABV;
        this.version = version;
    }


    public long getEndDateInMillis() {
        return endDateInMillis;
    }
    
    public void setEndDateInMillis(long endDateInMillis) {
        this.endDateInMillis = endDateInMillis;
    }
    
    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrewer() {
        return brewer;
    }

    public void setBrewer(String brewer) {
        this.brewer = brewer;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public BrewType getType() {
        return type;
    }

    public void setType(BrewType type) {
        this.type = type;
    }

    public long getBrewDateInMillis() {
        return brewDateInMillis;
    }

    public void setBrewDateInMillis(long brewDateInMillis) {
        this.brewDateInMillis = brewDateInMillis;
    }

    public long getBottledDateInMillis() {
        return bottledDateInMillis;
    }

    public void setBottledDateInMillis(long bottledDateInMillis) {
        this.bottledDateInMillis = bottledDateInMillis;
    }

    public double getHops() {
        return hops;
    }

    public void setHops(double hops) {
        this.hops = hops;
    }

    public double getGrains() {
        return grains;
    }

    public void setGrains(double grains) {
        this.grains = grains;
    }

    public double getmBottlingVolume() {
        return mBottlingVolume;
    }

    public void setmBottlingVolume(double mBottlingVolume) {
        this.mBottlingVolume = mBottlingVolume;
    }

    public double getmMashEff() {
        return mMashEff;
    }

    public void setmMashEff(double mMashEff) {
        this.mMashEff = mMashEff;
    }

    public double getmABV() {
        return mABV;
    }

    public void setmABV(double mABV) {
        this.mABV = mABV;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }
    
    
}

package no.ask.repository.enteties.vo;

import no.ask.BrewType;

import org.joda.time.Instant;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class BeerSmithVO {

    private int id;

    private int batchNumber;

    private String name;

    private String brewer;

    private String style;

    private BrewType type;

    private Instant brewDate;

    private Instant bottledDate;

    private Instant endDate;

    private double hops;

    private double grains;

    private double mBottlingVolume;

    private double mMashEff;

    private double mABV;

    private double version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    private DateTimeFormatter fmt = DateTimeFormat.forPattern("dd.MM.yyyy");

    public String getBrewDate() {
        return fmt.print(brewDate);
    }

    public void setBrewDate(Instant brewDate) {
        this.brewDate = brewDate;
    }

    public String getBottledDate() {
        return fmt.print(bottledDate);
    }

    public void setBottledDate(Instant bottledDate) {
        this.bottledDate = bottledDate;
    }

    public String getEndDate() {
        return fmt.print(endDate);
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
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

    public BeerSmithVO(int id, int batchNumber, String name, String brewer, String style, BrewType type, Instant brewDate, Instant bottledDate, Instant endDate, double hops, double grains,
            double mBottlingVolume, double mMashEff, double mABV, double version) {
        super();
        this.id = id;
        this.batchNumber = batchNumber;
        this.name = name;
        this.brewer = brewer;
        this.style = style;
        this.type = type;
        this.brewDate = brewDate;
        this.bottledDate = bottledDate;
        this.endDate = endDate;
        this.hops = hops;
        this.grains = grains;
        this.mBottlingVolume = mBottlingVolume;
        this.mMashEff = mMashEff;
        this.mABV = mABV;
        this.version = version;
    }

}

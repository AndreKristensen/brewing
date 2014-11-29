package no.ask.repository.enteties;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "brews")
public class Brew implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -6499855510724412483L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Basic
    private String brewName;
    
    @Basic
    private int batchNumber;
    
    @Basic
    private double measuredVolume;
    
    @Basic
    private double numberOfHalfLiter;
    
    @Basic
    private double numberOfZeroPointThreeLiter;
    
    @Basic
    private double literInKeg;
        
    public Brew() {
        // TODO Auto-generated constructor stub
    }
    
    public Brew(String brewName) {
     this.brewName = brewName;
    }


    public Brew(String brewName, double batchNumber, 
            double measuredVolume, double numberOfHalfLiter,
            double numberOfZeroPointThreeLiter, double literInKeg) {
        super();
        this.brewName = brewName;
        this.batchNumber = (int)batchNumber;
        this.measuredVolume = measuredVolume;
        this.numberOfHalfLiter = numberOfHalfLiter;
        this.numberOfZeroPointThreeLiter = numberOfZeroPointThreeLiter;
        this.literInKeg = literInKeg;
    }

    @Override
    public String toString() {
        return "Brew [id=" + id + ", brewName=" + brewName + ", batchNumber=" + batchNumber + ", measuredVolume=" + measuredVolume + ", numberOfHalfLiter=" + numberOfHalfLiter
                + ", numberOfZeroPointThreeLiter=" + numberOfZeroPointThreeLiter + ", literInKeg=" + literInKeg + "]";
    }

    public int getId() {
        return id;
    }

    public void setBrewName(String brewName) {
        this.brewName = brewName;
    }

    public String getBrewName() {
        return brewName;
    }

    public double getMeasuredVolume() {
        return measuredVolume;
    }

    public void setMeasuredVolume(double measuredVolume) {
        this.measuredVolume = measuredVolume;
    }

    public double getNumberOfHalfLiter() {
        return numberOfHalfLiter;
    }

    public void setNumberOfHalfLiter(double numberOfHalfLiter) {
        this.numberOfHalfLiter = numberOfHalfLiter;
    }

    public double getNumberOfZeroPointThreeLiter() {
        return numberOfZeroPointThreeLiter;
    }

    public void setNumberOfZeroPointThreeLiter(double numberOfZeroPointThreeLiter) {
        this.numberOfZeroPointThreeLiter = numberOfZeroPointThreeLiter;
    }

    public double getLiterInKeg() {
        return literInKeg;
    }

    public void setLiterInKeg(double literInKeg) {
        this.literInKeg = literInKeg;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;
    }
}

package com.driver.model;

import javax.persistence.*;
import java.sql.Driver;

@Entity
@Table(name = "cabs")
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private int perKmRate;
    private boolean avaiable;

    public Cab(int perKmRate, boolean avaiable) {
        this.perKmRate = perKmRate;
        this.avaiable = avaiable;
    }

    public Cab() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public boolean isAvaiable() {
        return avaiable;
    }

    public void setAvaiable(boolean avaiable) {
        this.avaiable = avaiable;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @JoinColumn
    @OneToOne
    private Driver driver;
}
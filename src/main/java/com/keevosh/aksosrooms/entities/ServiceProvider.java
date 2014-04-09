package com.keevosh.aksosrooms.entities;

import java.beans.Transient;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Orestis
 */
@Entity
@DiscriminatorValue("service_providers")
public class ServiceProvider extends User {

    private List<Service> services;
    private int score;

    @Transient
    public List<Service> getServices() {
        return services;
    }

    @Column(name = "score", nullable = false)
    public int getScore() {
        return score;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

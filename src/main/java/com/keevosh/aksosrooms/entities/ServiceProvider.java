package com.keevosh.aksosrooms.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Orestis
 */
@Entity
@DiscriminatorValue("service_provider")
public class ServiceProvider extends User {
    
    private List<Service> services;
    private int score;

    public List<Service> getServices() {
        return services;
    }

    @Column(name = "score")
    public int getScore() {
        return score;
    }
    
    
}

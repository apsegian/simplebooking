package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.ServiceStatus;
import java.util.Date;
import javax.persistence.*;

import org.joda.money.Money;

/**
 *
 * @author Orestis
 */
@Entity
@Table(name = "services")
public class Service extends PersistentObject {
    
    private ServiceProvider serviceProvider;
    private String title;
    private String description;
    private Money price;
    private Date availableFrom;
    private Date availableTo;
    private ServiceStatus status;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return title;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    @Column(name = "price", nullable = false)
    public Money getPrice() {
        return price;
    }

    @Column(name = "available_from", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAvailableFrom() {
        return availableFrom;
    }

    @Column(name = "available_to", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAvailableTo() {
        return availableTo;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    public ServiceStatus getStatus() {
        return status;
    }

    
    public void setServiceProvider(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public void setAvailableFrom(Date availableFrom) {
        this.availableFrom = availableFrom;
    }

    public void setAvailableTo(Date availableTo) {
        this.availableTo = availableTo;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }
    
}

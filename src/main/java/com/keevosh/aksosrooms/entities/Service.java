package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.ServiceStatus;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.joda.money.Money;

/**
 *
 * @author Orestis
 */
@Entity
@Table(name = "service")
public class Service extends PersistentObject {
    
    private ServiceProvider serviceProvider;
    private String title;
    private String description;
    private Money price;
    private Date availableFromDate;
    private Date availableToDate;
    private ServiceStatus serviceStatus;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "service_description")
    public String getDescription() {
        return description;
    }

    @Column(name = "service_price")
    public Money getPrice() {
        return price;
    }

    @Column(name = "available_from_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAvailableFromDate() {
        return availableFromDate;
    }

    @Column(name = "available_to_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAvailableToDate() {
        return availableToDate;
    }

    @Column(name = "service_status")
    public ServiceStatus getServiceStatus() {
        return serviceStatus;
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

    public void setAvailableFromDate(Date availableFromDate) {
        this.availableFromDate = availableFromDate;
    }

    public void setAvailableToDate(Date availableToDate) {
        this.availableToDate = availableToDate;
    }

    public void setServiceStatus(ServiceStatus serviceStatus) {
        this.serviceStatus = serviceStatus;
    }
    
}

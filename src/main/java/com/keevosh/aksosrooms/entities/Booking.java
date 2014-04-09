package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.Status;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

import org.joda.money.Money;

/**
 *
 * @author Orestis
 */

@Entity
@Table(name = "bookings")
public class Booking extends PersistentObject {
    
    private Visitor visitor;
    private String bookingRefNum;
    private String villa;
    private Date dateCreated;
    private Date dateFrom;
    private Date dateTo;
    private Money dailyRates;
    private boolean seasonSpecialRate = false;
    private String seasonSpecialRateDesc;
    private Money totalPrice;
    private List<ServiceBooking> servicesBooked;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public Visitor getVisitor() {
        return visitor;
    }

    @Column(name = "booking_ref", nullable = false)
    public String getBookingRefNum() {
        return bookingRefNum;
    }

    @Column(name = "villa", nullable = false)
    public String getVilla() {
        return villa;
    }

    @Column(name = "date_created", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateCreated() {
        return dateCreated;
    }

    @Column(name = "date_from", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateFrom() {
        return dateFrom;
    }

    @Column(name = "date_to", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateTo() {
        return dateTo;
    }

    @Column(name = "daily_rates", nullable = false)
    public Money getDailyRates() {
        return dailyRates;
    }

    @Column(name = "special_rate", nullable = false)
    public boolean isSeasonSpecialRate() {
        return seasonSpecialRate;
    }

    @Column(name = "special_rate_desc", nullable = true)
    public String getSeasonSpecialRateDesc() {
        return seasonSpecialRateDesc;
    }

    @Column(name = "total_price", nullable = false)
    public Money getTotalPrice() {
        return totalPrice;
    }

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    public List<ServiceBooking> getServicesBooked() {
        return servicesBooked;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    public Status getStatus() {
        return status;
    }
    
    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void setBookingRefNum(String bookingRefNum) {
        this.bookingRefNum = bookingRefNum;
    }

    public void setVilla(String villa) {
        this.villa = villa;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setDailyRates(Money dailyRates) {
        this.dailyRates = dailyRates;
    }

    public void setSeasonSpecialRate(boolean seasonSpecialRate) {
        this.seasonSpecialRate = seasonSpecialRate;
    }

    public void setSeasonSpecialRateDesc(String seasonSpecialRateDesc) {
        this.seasonSpecialRateDesc = seasonSpecialRateDesc;
    }

    public void setTotalPrice(Money totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setServicesBooked(List<ServiceBooking> servicesBooked) {
        this.servicesBooked = servicesBooked;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
}

package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.Status;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.joda.money.Money;

/**
 *
 * @author Orestis
 */

@Entity
@Table(name = "booking")
public class Booking extends PersistentObject {
    
    private Visitor visitor;
    private String bookingRefNum;
    private String villa;
    private Date dateRequested;
    private Date dateRegistered;
    private Date fromDate;
    private Date toDate;
    private Money dailyRates;
    private boolean seasonSpecialRate = false;
    private String seasonSpecialRateDesc;
    private Money totalPrice;
    private List<ServiceBooking> servicesBooked;
    private Status status;

    @ManyToOne
    @JoinColumn(name = "user_id")
    public Visitor getVisitor() {
        return visitor;
    }

    @Column(name = "booking_ref")
    public String getBookingRefNum() {
        return bookingRefNum;
    }

    @Column(name = "villa")
    public String getVilla() {
        return villa;
    }

    @Column(name = "date_requested")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateRequested() {
        return dateRequested;
    }

    @Column(name = "date_registered")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateRegistered() {
        return dateRegistered;
    }

    @Column(name = "from_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getFromDate() {
        return fromDate;
    }

    @Column(name = "to_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getToDate() {
        return toDate;
    }

    @Column(name = "daily_rates")
    public Money getDailyRates() {
        return dailyRates;
    }

    @Column(name = "special_rate")
    public boolean isSeasonSpecialRate() {
        return seasonSpecialRate;
    }

    @Column(name = "special_rate_desc")
    public String getSeasonSpecialRateDesc() {
        return seasonSpecialRateDesc;
    }

    @Column(name = "total_price")
    public Money getTotalPrice() {
        return totalPrice;
    }

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    public List<ServiceBooking> getServicesBooked() {
        return servicesBooked;
    }

    @Column(name = "status")
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

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
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

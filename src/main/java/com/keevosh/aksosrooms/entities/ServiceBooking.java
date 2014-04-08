package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.Status;
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
@Table(name = "service_booking")
public class ServiceBooking extends PersistentObject{
    
    private Booking booking;
    private String bookingRefNum;
    private Service service;
    private Date dateRequested;
    private Date dateRegistered;
    private Date appointment;
    private Money price;
    private Status status;

    @ManyToOne
    @Column(name = "booking_id")
    public Booking getBooking() {
        return booking;
    }

    @Column(name = "booking_ref", nullable = false)
    public String getBookingRefNum() {
        return bookingRefNum;
    }

    @ManyToOne
    @JoinColumn(name = "service_id")
    public Service getService() {
        return service;
    }

    @Column(name = "date_requested")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateRequested() {
        return dateRequested;
    }

    @Column(name = "date_registered", nullable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateRegistered() {
        return dateRegistered;
    }

    @Column(name = "appointment")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAppointment() {
        return appointment;
    }

    @Column(name = "service_price")
    public Money getPrice() {
        return price;
    }

    @Column(name = "status")
    public Status getStatus() {
        return status;
    }
    
    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setBookingRefNum(String bookingRefNum) {
        this.bookingRefNum = bookingRefNum;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

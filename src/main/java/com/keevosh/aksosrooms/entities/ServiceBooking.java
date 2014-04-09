package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.Status;
import java.util.Date;
import javax.persistence.*;

import org.joda.money.Money;

/**
 *
 * @author Orestis
 */
@Entity
@Table(name = "service_bookings")
public class ServiceBooking extends PersistentObject{
    
    private Booking booking;
    private String bookingRefNum;
    private Service service;
    private Date dateCreated;
    private Date appointment;
    private Money price;
    private Status status;

    @ManyToOne
    @Column(name = "booking_id", nullable = false)
    public Booking getBooking() {
        return booking;
    }

    @Column(name = "booking_ref", nullable = false)
    public String getBookingRefNum() {
        return bookingRefNum;
    }

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    public Service getService() {
        return service;
    }

    @Column(name = "date_created", nullable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateCreated() {
        return dateCreated;
    }

    @Column(name = "appointment")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAppointment() {
        return appointment;
    }

    @Column(name = "service_price", nullable = false)
    public Money getPrice() {
        return price;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
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

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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

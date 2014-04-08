package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.Status;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Orestis
 */
@Entity
@Table(name = "service_req")
public class ServiceRequest extends PersistentObject {

    private Visitor visitor;
    private String bookingRefNum;
    private Service service;
    private Date dateRequested;
    private Date appointment;
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

    @Column(name = "appointment")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getAppointment() {
        return appointment;
    }

    @Column(name = "status")
    public Status getStatus() {
        return status;
    }

    public void setBookingRefNum(String bookingRefNum) {
        this.bookingRefNum = bookingRefNum;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public void setAppointment(Date appointment) {
        this.appointment = appointment;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

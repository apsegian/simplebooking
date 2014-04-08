package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.Status;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author Orestis
 */
@Entity
@Table(name = "booking_req")
public class BookingRequest extends PersistentObject {

    private Visitor visitor;
    private String bookingRefNum;
    private Date dateRequested;
    private Date requestedFromDate;
    private Date requestedToDate;
    private List<ServiceRequest> requestedServices;
    private String comments;
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

    @Column(name = "date_requested")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateRequested() {
        return dateRequested;
    }

    @Column(name = "requested_from_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getRequestedFromDate() {
        return requestedFromDate;
    }

    @Column(name = "requested_to_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getRequestedToDate() {
        return requestedToDate;
    }

    @Transient
    public List<ServiceRequest> getRequestedServices() {
        return requestedServices;
    }

    @Column(name = "comments")
    public String getComments() {
        return comments;
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

    public void setDateRequested(Date dateRequested) {
        this.dateRequested = dateRequested;
    }

    public void setRequestedFromDate(Date requestedFromDate) {
        this.requestedFromDate = requestedFromDate;
    }

    public void setRequestedToDate(Date requestedToDate) {
        this.requestedToDate = requestedToDate;
    }

    public void setRequestedServices(List<ServiceRequest> requestedServices) {
        this.requestedServices = requestedServices;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

package com.keevosh.aksosrooms.entities;

import com.keevosh.aksosrooms.enums.Status;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Orestis
 */
@Entity
@Table(name = "booking_requests")
public class BookingRequest extends PersistentObject {

    private Visitor visitor;
    private String bookingRefNum;
    private Date dateCreated;
    private Date dateFrom;
    private Date dateTo;
    private List<ServiceRequest> requestedServices;
    private String comments;
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

    @Column(name = "date_created", nullable = false, updatable = false)
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

    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    public Status getStatus() {
        return status;
    }

    @Transient
    public List<ServiceRequest> getRequestedServices() {
        return requestedServices;
    }

    public void setBookingRefNum(String bookingRefNum) {
        this.bookingRefNum = bookingRefNum;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
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

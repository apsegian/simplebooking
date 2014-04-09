package com.keevosh.aksosrooms.entities;

import javax.persistence.*;
import java.util.Date;

/**
 *
 * @author Orestis
 */
@Entity
@Table(name = "reviews")
public class Review extends PersistentObject {

    private Visitor visitor;
    private ServiceBooking serviceBooking;
    private Date dateCreated;
    private String bookingRefNum;
    private String comment;
    private int rating;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public Visitor getVisitor() {
        return visitor;
    }

    @ManyToOne
    @JoinColumn(name = "service_booking_id", nullable = true)
    public ServiceBooking getServiceBooking() {
        return serviceBooking;
    }

    @Column(name = "date_created", nullable = false, updatable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    public Date getDateCreated() {
        return dateCreated;
    }

    @Column(name = "booking_ref", nullable = false)
    public String getBookingRefNum() {
        return bookingRefNum;
    }

    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    @Column(name = "rating", nullable = false)
    public int getRating() {
        return rating;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public void setServiceBooking(ServiceBooking serviceBooking) {
        this.serviceBooking = serviceBooking;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setBookingRefNum(String bookingRefNum) {
        this.bookingRefNum = bookingRefNum;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}

package com.keevosh.aksosrooms.entities;

import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author Orestis
 */
@Entity
@DiscriminatorValue("visitor")
public class Visitor extends User {
    
    private List<Booking> bookings;
    private List<BookingRequest> booking_req;
    private List<ServiceRequest> service_req;

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<BookingRequest> getBooking_req() {
        return booking_req;
    }

    public List<ServiceRequest> getService_req() {
        return service_req;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void setBooking_req(List<BookingRequest> booking_req) {
        this.booking_req = booking_req;
    }

    public void setService_req(List<ServiceRequest> service_req) {
        this.service_req = service_req;
    }
    
    
}

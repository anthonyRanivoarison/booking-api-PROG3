package com.hotel.booking_api.service;

import com.hotel.booking_api.entity.Booking;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    private final List<Booking> bookings = new ArrayList<>();

    public List<Booking> getAllBookings() {
        return bookings;
    }

    public Booking addBooking(Booking booking) {
        if (booking.getRoomNumber() < 1 || booking.getRoomNumber() > 9) {
            throw new IllegalArgumentException("Room number must be in 1 to 9");
        }

        boolean alreadyBooked = bookings.stream().anyMatch(b ->
                b.getRoomNumber() == booking.getRoomNumber() &&
                        b.getBookingDate().equals(booking.getBookingDate())
        );

        if (alreadyBooked) {
            throw new IllegalStateException("The room " + booking.getRoomNumber() + " is already booked at this date");
        }

        bookings.add(booking);
        return booking;
    }
}

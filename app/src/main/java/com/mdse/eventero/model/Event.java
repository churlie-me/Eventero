package com.mdse.eventero.model;

import java.util.Date;
import java.util.List;
public class Event {
    public int event_id;
    public String title;
    public String description;
    public String price;
    public int category_id;
    public String category_name;
    public String event_start_date;
    public String event_end_date;
    public String venue;
    public String price_range;
    public String currency;
    public String booking_start_date;
    public String booking_end_date;
    public String location;
    public int gps_id;
    public String latitude, longitude;
    public String created;
    public String image;

    public Event(){}

    public Event(int event_id, String title, String description, String price, int category_id, String category_name, String event_start_date, String event_end_date,
                String venue, String price_range, String currency, String booking_start_date, String booking_end_date, String location, int gps_id, String latitude,
                 String longitude, String created, String image)
    {
        this.event_id = event_id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.category_id = category_id;
        this.category_name = category_name;
        this.event_start_date = event_start_date;
        this.event_end_date = event_end_date;
        this.venue = venue;
        this.price_range = price_range;
        this.currency = currency;
        this.booking_start_date = booking_start_date;
        this.booking_end_date = booking_end_date;
        this.location = location;
        this.gps_id = gps_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.created = created;
        this.image = image;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    public String getEvent_start_date() {
        return event_start_date;
    }

    public void setEvent_start_date(String event_start_date) {
        this.event_start_date = event_start_date;
    }

    public String getEvent_end_date() {
        return event_end_date;
    }

    public void setEvent_end_date(String event_end_date) {
        this.event_end_date = event_end_date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getPrice_range() {
        return price_range;
    }

    public void setPrice_range(String price_range) {
        this.price_range = price_range;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getBooking_start_date() {
        return booking_start_date;
    }

    public void setBooking_start_date(String booking_start_date) {
        this.booking_start_date = booking_start_date;
    }

    public String getBooking_end_date() {
        return booking_end_date;
    }

    public void setBooking_end_date(String booking_end_date) {
        this.booking_end_date = booking_end_date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getGps_id() {
        return gps_id;
    }

    public void setGps_id(int gps_id) {
        this.gps_id = gps_id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

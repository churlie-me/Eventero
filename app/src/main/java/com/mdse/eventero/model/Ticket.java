package com.mdse.eventero.model;

import java.util.Date;

public class Ticket {
    public int ticket_id;
    public String ticket_type;
    public String event_date;
    public String event_start_time;
    public String event_end_time;
    public String ticket_price;
    public String currency;
    public String title;
    public String description;
    public String location;
    public int no_booked;
    public int no_available;
    public int event_id;
    public int gps_id;
    public String latitude, longitude;
    public String created;
    public String image;
    public String promoter_id;
    public String promoter;
    public String promoter_mobile;
    public String promoter_email;
    public String promoter_website;


    public Ticket(){}

    public Ticket(int ticket_id,String ticket_type,String event_date,String event_start_time,String event_end_time, String ticket_price,
                  String currency, String title, String description, String location, int no_booked,int no_available, int event_id,
                  int gps_id, String latitude, String longitude, String created, String image, String promoter_id, String promoter, String promoter_mobile,
                  String promoter_email, String promoter_website)
    {
        this.ticket_id = ticket_id;
        this.ticket_type = ticket_type;
        this.event_date = event_date;
        this.event_start_time = event_start_time;
        this.event_end_time = event_end_time;
        this.ticket_price = ticket_price;
        this.currency = currency;
        this.title = title;
        this.description = description;
        this.location = location;
        this.no_booked = no_booked;
        this.no_available = no_available;
        this.event_id = event_id;
        this.gps_id = gps_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.created = created;
        this.image = image;
        this.promoter_id = promoter_id;
        this.promoter = promoter;
        this.promoter_email = promoter_email;
        this.promoter_mobile = promoter_mobile;
        this.promoter_website = promoter_website;
    }

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTicket_type() {
        return ticket_type;
    }

    public void setTicket_type(String ticket_type) {
        this.ticket_type = ticket_type;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }

    public String getEvent_start_time() {
        return event_start_time;
    }

    public void setEvent_start_time(String event_start_time) {
        this.event_start_time = event_start_time;
    }

    public String getEvent_end_time() {
        return event_end_time;
    }

    public void setEvent_end_time(String event_end_time) {
        this.event_end_time = event_end_time;
    }

    public String getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(String ticket_price) {
        this.ticket_price = ticket_price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNo_booked() {
        return no_booked;
    }

    public void setNo_booked(int no_booked) {
        this.no_booked = no_booked;
    }

    public int getNo_available() {
        return no_available;
    }

    public void setNo_available(int no_available) {
        this.no_available = no_available;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
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

    public String getPromoter_id() {
        return promoter_id;
    }

    public void setPromoter_id(String promoter_id) {
        this.promoter_id = promoter_id;
    }

    public String getPromoter() {
        return promoter;
    }

    public void setPromoter(String promoter) {
        this.promoter = promoter;
    }

    public String getPromoter_mobile() {
        return promoter_mobile;
    }

    public void setPromoter_mobile(String promoter_mobile) {
        this.promoter_mobile = promoter_mobile;
    }

    public String getPromoter_email() {
        return promoter_email;
    }

    public void setPromoter_email(String promoter_email) {
        this.promoter_email = promoter_email;
    }

    public String getPromoter_website() {
        return promoter_website;
    }

    public void setPromoter_website(String promoter_website) {
        this.promoter_website = promoter_website;
    }
}

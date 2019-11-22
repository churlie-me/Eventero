package com.mdse.eventero.model;

import java.util.List;

public class Events {
    public List<Event> records;

    public List<Event> get_event() {
        return records;
    }

    public void set_event(List<Event> _event) {
        this.records = _event;
    }

    public Events(){}
}

package com.mdse.eventero.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mdse.eventero.R;
import com.mdse.eventero.adapters.EventsRecyclerViewAdapter;
import com.mdse.eventero.data.EventsAsync;
import com.mdse.eventero.model.Event;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;
import com.mdse.eventero.interfaces.EventsCallback;

public class Events extends Fragment implements EventsCallback {
    private List<Event> _events;
    private RecyclerView _eventsRecyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {

        View _view = inflater.inflate(R.layout.events, container, false);

        _eventsRecyclerView = (RecyclerView) _view.findViewById(R.id.eventsRecycler);
        new EventsAsync(this.getActivity(), this).execute();

        return _view;
    }

    @Override
    public void OnSuccess(com.mdse.eventero.model.Events O) {
        _events = O.records;

        EventsRecyclerViewAdapter eventsRecyclerViewAdapter = new EventsRecyclerViewAdapter(this.getActivity(), _events);
        _eventsRecyclerView.setLayoutManager(new GridLayoutManager(this.getActivity(), 3));
        _eventsRecyclerView.setAdapter(eventsRecyclerViewAdapter);
    }

    @Override
    public void OnFailure(String E) {
        Toast.makeText(this.getActivity(), E, Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnFailure(Exception E) {
        Toast.makeText(this.getActivity(), "Connection Failed", Toast.LENGTH_LONG).show();
    }
}

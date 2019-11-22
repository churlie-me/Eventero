package com.mdse.eventero;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.mdse.eventero.adapters.EventsRecyclerViewAdapter;
import com.mdse.eventero.adapters.TicketsRecyclerViewAdapter;
import com.mdse.eventero.data.TicketsAsync;
import com.mdse.eventero.interfaces.TicketsCallback;
import com.mdse.eventero.model.Ticket;

import java.util.List;

public class Tickets extends AppCompatActivity implements TicketsCallback {
    private List<Ticket> _tickets;
    private RecyclerView _ticketsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tickets);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        _ticketsRecyclerView = (RecyclerView) findViewById(R.id.ticketsRecycler);

        new TicketsAsync(this, this).execute();
    }



    @Override
    public void OnSuccess(com.mdse.eventero.model.Tickets O) {
        _tickets = O.records;

        TicketsRecyclerViewAdapter ticketsRecyclerViewAdapter = new TicketsRecyclerViewAdapter(this, _tickets);
        _ticketsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        _ticketsRecyclerView.setAdapter(ticketsRecyclerViewAdapter);
    }

    @Override
    public void OnFailure(String E) {
        Toast.makeText(this, E, Toast.LENGTH_LONG).show();
    }

    @Override
    public void OnFailure(Exception E) {
        Toast.makeText(this, "Connection Failed", Toast.LENGTH_LONG).show();
    }
}

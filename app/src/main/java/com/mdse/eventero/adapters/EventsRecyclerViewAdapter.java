package com.mdse.eventero.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mdse.eventero.EventDetail;
import com.mdse.eventero.R;
import com.mdse.eventero.model.Event;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class EventsRecyclerViewAdapter extends RecyclerView.Adapter<EventsRecyclerViewAdapter.EventViewHolder> {

    private Context mContext;
    private List<Event> _events;

    public EventsRecyclerViewAdapter(Context context, List<Event> _events)
    {
        this.mContext = context;
        this._events = _events;
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View _view;
        LayoutInflater _lInflater = LayoutInflater.from(mContext);
        _view = _lInflater.inflate(R.layout.eventcard, parent, false);

        return new EventViewHolder(_view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventViewHolder eventViewHolder, final int _position) {
        eventViewHolder._eventName.setText(_events.get(_position).title);

        //if(_events.get(_position).image != null)
          //  eventViewHolder._eventImage.setImageBitmap(getBitmapFromURL(_events.get(_position).image));

        eventViewHolder._cardview.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent _intent = new Intent(mContext, EventDetail.class);
                _intent.putExtra("Event", _events.get(_position).title);
                _intent.putExtra("Description", _events.get(_position).description);
                _intent.putExtra("Price", _events.get(_position).price);
                _intent.putExtra("Image", _events.get(_position).image);
                _intent.putExtra("Venue", _events.get(_position).venue);
                _intent.putExtra("Date", _events.get(_position).event_start_date);
                mContext.startActivity(_intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return _events.size();
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder{

        ImageView _eventImage;
        TextView _eventName;
        CardView _cardview;
        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            _eventImage = itemView.findViewById(R.id.eventImg);
            _eventName = itemView.findViewById(R.id.eventTitle);
            _cardview = itemView.findViewById(R.id.eventCard);
        }
    }

    public static Bitmap getBitmapFromURL(String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

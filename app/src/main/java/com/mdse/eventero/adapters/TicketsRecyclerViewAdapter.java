package com.mdse.eventero.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.mdse.eventero.R;
import com.mdse.eventero.TicketDetail;
import com.mdse.eventero.model.Event;
import com.mdse.eventero.model.Ticket;

import java.util.List;

public class TicketsRecyclerViewAdapter extends RecyclerView.Adapter<TicketsRecyclerViewAdapter.TicketViewHolder> {

    private Context mContext;
    private List<Ticket> _tickets;

    public TicketsRecyclerViewAdapter(Context context, List<Ticket> _tickets)
    {
        this.mContext = context;
        this._tickets = _tickets;
    }

    @NonNull
    @Override
    public TicketViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View _view;
        LayoutInflater _lInflater = LayoutInflater.from(mContext);
        _view = _lInflater.inflate(R.layout.ticketcard, parent, false);

        return new TicketViewHolder(_view);
    }

    @Override
    public void onBindViewHolder(@NonNull TicketViewHolder eventViewHolder, int _position) {
        eventViewHolder._eventName.setText(_tickets.get(_position).ticket_type);

        eventViewHolder._ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _intent = new Intent(mContext, TicketDetail.class);
                mContext.startActivity(_intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return _tickets.size();
    }

    public static class TicketViewHolder extends RecyclerView.ViewHolder{

        ImageView _eventImage;
        TextView _eventName;
        LinearLayout _ticket;
        public TicketViewHolder(@NonNull View itemView) {
            super(itemView);

            _eventImage = itemView.findViewById(R.id.eventImg);
            _eventName = itemView.findViewById(R.id.eventTitle);
            _ticket = (LinearLayout) itemView.findViewById(R.id.ticketItem);
        }
    }
}

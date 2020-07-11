package com.example.aclass;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pokemonadabter extends RecyclerView.Adapter {

    ArrayList<pokmon> s;

    public pokemonadabter(ArrayList<pokmon> s) {
        this.s = s;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemons,parent,false);
        viewHolder vh = new viewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((viewHolder)holder).img.setImageResource(s.get(position).getImage());
        ((viewHolder)holder).name.setText(s.get(position).getName());
        ((viewHolder)holder).total.setText(s.get(position).getTotal()+"");
    }

    @Override
    public int getItemCount() {
        return s.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{
        public ImageView img;
        public TextView name;
        public TextView total;
        public View view;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            view=itemView;
            name=itemView.findViewById(R.id.textView);
            total = itemView.findViewById(R.id.textView3);
            img = itemView.findViewById(R.id.imageView);

        }
    }
}





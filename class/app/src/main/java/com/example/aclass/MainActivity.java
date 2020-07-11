package com.example.aclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<pokmon> a = new ArrayList<>();
        pokmon p1 = new pokmon("Charizard",R.drawable.charizard,84,78,534);
        pokmon p2 = new pokmon("Pikachu ",R.drawable.pikachu,55,40,320);
        pokmon p3 = new pokmon("Nidoking",R.drawable.nidoking,102,77,505);
        pokmon p4 = new pokmon("Ninetales",R.drawable.ninetales,76,75,505);
        pokmon p5 = new pokmon("Arcanine",R.drawable.arcanine,100,80,555);

        a.add(p1);
        a.add(p2);
        a.add(p3);
        a.add(p4);
        a.add(p5);

        RecyclerView rv = findViewById(R.id.recyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager x = new LinearLayoutManager(this);
        rv.setLayoutManager(x);
        pokemonadabter adapter = new pokemonadabter(a);
        rv.setAdapter(adapter);

    }
}


























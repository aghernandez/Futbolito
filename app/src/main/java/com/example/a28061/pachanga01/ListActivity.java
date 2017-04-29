package com.example.a28061.pachanga01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends Activity {

    private ListView listView;
    private ArrayList<Jugador> jugadores;
    private AdapterList adapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        this.listView = (ListView) findViewById(R.id.lvJugadores);
        this.jugadores = new ArrayList<>();
        //this.jugadores.add(new Jugador());
    }
}

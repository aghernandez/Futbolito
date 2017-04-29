package com.example.a28061.pachanga01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Pantalla_seg extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_seg);

        ListView lista = (ListView) findViewById(R.id.listView_lista);
        ArrayList<Datos>arraydatos = new ArrayList<Datos>();
        Datos datos;

        datos = new Datos(getResources().getDrawable(R.drawable.foto1),"Romario","Futbolista Brasileño");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto2),"Carlos Ruiz","Futbolista Guatemalteco");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto3),"Gianluigi Buffon","Futbolista Italiano");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto4),"Carles Puyol","Futbolista Español");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto5),"Cristiano Ronaldo","Futbolista Portugues");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto6),"Javier Hernandez","Futbolista Mexicano");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto7),"Sergio Ramos","Futbolista Español");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto8),"Oliver Khan","Futbolista Aleman");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto9),"Ronaldhino","Futbolista Brasileño");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto10),"Aubameyang","Futbolista Gabones");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto11),"Toni Kross","Futbolista Aleman");
        arraydatos.add(datos);
        datos = new Datos(getResources().getDrawable(R.drawable.foto12),"Leonel Messi","Futbolista Argentino");
        arraydatos.add(datos);


        AdapterDatos adapter= new AdapterDatos(this,arraydatos);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent puno = new Intent(view.getContext(),Info1.class);
                    startActivityForResult(puno,0);
                }
                if (position==1){
                    Intent pdos  = new Intent(view.getContext(),Info2.class);
                    startActivityForResult(pdos,1);
                }
                if(position==2){
                    Intent ptres = new Intent(view.getContext(),Info3.class);
                    startActivityForResult(ptres,2);
                }
                if(position==3){
                    Intent pcua = new Intent(view.getContext(),Info4.class);
                    startActivityForResult(pcua,3);
                }
            }
        });

        }
}




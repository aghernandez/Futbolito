package com.example.a28061.pachanga01;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends Activity {

    private ImageView imgFoto;
    private ImageView imgLogo;
    private TextView tvNombre;
    private TextView tvLinea1;
    private TextView tvLinea2;
    private TextView tvLinea3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            setupView((Jugador) bundle.get("JUGADOR"));
        }
    }


    private void setupView(Jugador jugador){
        imgFoto = (ImageView) findViewById(R.id.imgFoto);
        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvLinea1 = (TextView) findViewById(R.id.tvLinea1);
        tvLinea2 = (TextView) findViewById(R.id.tvLinea2);
        tvLinea3 = (TextView) findViewById(R.id.tvLinea3);

        if(jugador!=null){
            imgFoto.setImageResource(jugador.getFoto());
            imgLogo.setImageResource(jugador.getLogo());
            tvNombre.setText(jugador.getNombre());
            tvLinea1.setText(jugador.getLinea1());
            tvLinea2.setText(jugador.getLinea2());
            tvLinea3.setText(jugador.getLinea3());

        }
    }

}

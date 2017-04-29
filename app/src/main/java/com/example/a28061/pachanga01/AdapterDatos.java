package com.example.a28061.pachanga01;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ghernandez on 18/04/2017.
 */

public class AdapterDatos extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<Datos>items;

    public AdapterDatos(Activity activity, ArrayList<Datos>items){
        this.activity=activity;
        this.items=items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView ==null){
            LayoutInflater inf = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.items,null);
        }
        Datos datos = items.get(position);

        ImageView foto = (ImageView)v.findViewById(R.id.imageView2);
        foto.setImageDrawable(datos.foto);

        TextView nombre =(TextView)v.findViewById(R.id.textView);
        nombre.setText(datos.getNombre());

        TextView info =(TextView)v.findViewById(R.id.textView2);
        info.setText(datos.getInfo());

        return v;
    }
}

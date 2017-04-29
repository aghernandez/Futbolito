package com.example.a28061.pachanga01;

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

public class AdapterList extends BaseAdapter {
    private Context context;
    private ArrayList<Jugador> items;

    public AdapterList(Context context, ArrayList<Jugador> items) {
        this.context = context;
        this.items = items;
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
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (convertView == null) {
            LayoutInflater inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.items, null);
        }
        Jugador jugador = items.get(position);

        ImageView foto = (ImageView) v.findViewById(R.id.imageView2);
        foto.setImageResource(jugador.getFoto());

        TextView nombre = (TextView) v.findViewById(R.id.textView);
        nombre.setText(jugador.getNombre());

        return v;
    }
}

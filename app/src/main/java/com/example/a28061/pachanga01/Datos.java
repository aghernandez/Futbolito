package com.example.a28061.pachanga01;

import android.graphics.drawable.Drawable;

/**
 * Created by 28061 on 17/04/2017.
 */

public class Datos {
    protected Drawable foto;
    protected String nombre;
    protected String info;
    protected long id;

    public Datos(Drawable foto, String nombre, String info){
        this.foto = foto;
        this.nombre =nombre;
        this.info=info;
        //this.id=id;
    }

    public Drawable getFoto(){
        return foto;
    }

    public void setFoto(Drawable foto){
        this.foto=foto;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getInfo(){
        return info;
    }

    public void setInfo(String info){
        this.info=info;
    }

    public long getId (){
        return id;
    }

    public void setId (long id){
        this.id=id;
    }


}

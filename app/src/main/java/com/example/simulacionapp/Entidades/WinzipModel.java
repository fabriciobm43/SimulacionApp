package com.example.simulacionapp.Entidades;

public class WinzipModel {
    String nombre, detalle;
    int imagen;
    public void WinzipModel(){

    }

    public WinzipModel(String nombre, String detalle, int imagen) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}

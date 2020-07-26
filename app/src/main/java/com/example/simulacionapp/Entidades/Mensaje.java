package com.example.simulacionapp.Entidades;

public class Mensaje {
    private String titulo, asunto, mensaje, hora;
    private int imagenid;
    public Mensaje(){

    }

    public Mensaje(String titulo, String asunto, String mensaje, String hora, int imagenid) {
        this.titulo = titulo;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.hora = hora;
        this.imagenid = imagenid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
}

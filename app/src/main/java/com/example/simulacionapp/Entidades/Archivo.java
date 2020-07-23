package com.example.simulacionapp.Entidades;

public class Archivo {
    private String titulo, subido;
    private int imagenid, imagenpdf,imagenpoint;
    public Archivo(){}

    public Archivo(String titulo, String subido, int imagenid, int imagenpdf, int imagenpoint) {
        this.titulo = titulo;
        this.subido = subido;
        this.imagenid = imagenid;
        this.imagenpdf = imagenpdf;
        this.imagenpoint = imagenpoint;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubido() {
        return subido;
    }

    public void setSubido(String subido) {
        this.subido = subido;
    }

    public int getImagenid() {
        return imagenid;
    }

    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }

    public int getImagenpdf() {
        return imagenpdf;
    }

    public void setImagenpdf(int imagenpdf) {
        this.imagenpdf = imagenpdf;
    }

    public int getImagenpoint() {
        return imagenpoint;
    }

    public void setImagenpoint(int imagenpoint) {
        this.imagenpoint = imagenpoint;
    }
}

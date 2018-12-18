package com.alan.unitytest2.recycler;

public class cuento {

    private String nombre,descripcion;
    int url;
    private int img;

    public cuento(String nombre, String descripcion, int img,int url) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.img = img;
        this.url = url;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getUrl() {
        return url;
    }

    public void setUrl(int url) {
        this.url = url;
    }
}

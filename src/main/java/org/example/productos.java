package org.example;

public class productos {

    private String nombre;

    private Double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "productos{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}

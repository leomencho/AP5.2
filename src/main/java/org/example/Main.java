package org.example;
//En un programa main, lea de un archivo, por ejemplo separado por Tabs o comas, una
//lista de items, arme los objetos correspondientes y con el método de carrito “precio”,
//retorne el resultado. Por ejemplo:
//cant precioUnitario producto
//1 40 jabón en polvo
//3 10 esponjas
//2 100 chocolates
//carrito.precio() == 270
public class Main {
    public static void main(String[] args) {

        String nombre = "D:\\project\\java\\intelj\\AP5.2\\src\\main\\java\\org\\example\\pedido.txt";

        listadoCompra listado = new listadoCompra();
        listado.leerArchivo(nombre);
    }
}
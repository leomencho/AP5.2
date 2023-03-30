package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class listadoCompra {
    public void leerArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor= new FileWriter(archivo, true);
            escritor.append("3\t").append("yerba\n");
            escritor.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

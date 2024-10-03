package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercise31 {

    public static void main(String[] args) {

        String filePath = "src/main/resources/lorem.txt"; // Ruta del archivo

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Imprime cada línea en la consola
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage()); // Manejo de errores
        }

    }
}

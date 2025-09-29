/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.tareahashmap;

import java.util.HashMap;

public class TareaHashMap {

    public static void main(String[] args) {
        // 1. Crear el mapa
        HashMap<String, Object> informacionPersonal = new HashMap<>();
        informacionPersonal.put("nombre", "Melissa");
        informacionPersonal.put("edad", 31);
        informacionPersonal.put("ciudad", "La Concordia");

        // 2. Acceder y modificar valores
        informacionPersonal.put("ciudad", "Quito"); // cambiar ciudad
        informacionPersonal.put("profesion", "Estudiante"); // agregar nueva clave

        // 3. Verificar existencia de clave "telefono"
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.putIfAbsent("telefono", "0986273600");
        }

        // 4. Eliminar la clave "edad"
        informacionPersonal.remove("edad");

        // 5. Imprimir el resultado final
        System.out.println("Información personal final: " + informacionPersonal);
    }
}



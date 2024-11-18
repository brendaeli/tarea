package com.ms_paractica1.controller;

import com.ms_paractica1.Asegurado;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@RestController
public class AseguradoController {


    @GetMapping("/asegurados")
    public List<Asegurado> tenerAsegurados() {
        List<Asegurado> asegurados = new ArrayList<>();

        // Crear asegurados con datos de ejemplo
        Asegurado asegurado1 = new Asegurado();
        asegurado1.setNumeroDePoliza("410230009871");
        asegurado1.setNombre("Juan");
        asegurado1.setApellidoPaterno("Pérez");
        asegurado1.setApellidoMaterno("López");
        asegurado1.setEmail("juan.perez@example.com");
        asegurado1.setNumeroDeCelular("5551234567");
        asegurado1.setCalle("Av. Principal");
        asegurado1.setColonia("Centro");
        asegurado1.setCiudad("Ciudad de México");

        Asegurado asegurado2 = new Asegurado();
        asegurado2.setNumeroDePoliza("410230006548");
        asegurado2.setNombre("María");
        asegurado2.setApellidoPaterno("González");
        asegurado2.setApellidoMaterno("Ramírez");
        asegurado2.setEmail("maria.gonzalez@example.com");
        asegurado2.setNumeroDeCelular("5557654321");
        asegurado2.setCalle("Calle 10");
        asegurado2.setColonia("Reforma");
        asegurado2.setCiudad("Monterrey");

        Asegurado asegurado3 = new Asegurado();
        asegurado3.setNumeroDePoliza("410230001597");
        asegurado3.setNombre("Carlos");
        asegurado3.setApellidoPaterno("Hernández");
        asegurado3.setApellidoMaterno("Fernández");
        asegurado3.setEmail("carlos.hernandez@example.com");
        asegurado3.setNumeroDeCelular("5559876543");
        asegurado3.setCalle("Calle 20");
        asegurado3.setColonia("Las Flores");
        asegurado3.setCiudad("Guadalajara");

        // Agregar asegurados a la lista
        asegurados.add(asegurado1);
        asegurados.add(asegurado2);
        asegurados.add(asegurado3);

        // Ordenar por número de póliza
        asegurados.sort(Comparator.comparing(Asegurado::getNumeroDePoliza));

        return asegurados;
    }
}


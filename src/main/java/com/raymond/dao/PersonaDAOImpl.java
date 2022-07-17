package com.raymond.dao;

import com.raymond.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImpl implements PersonaDAO{


    @Override
    public List<Persona> listar() {
        List<Persona> lista=new ArrayList<>();

        Persona per=new Persona();
        per.setId(1);
        per.setNombre("Pepe");
        per.setEdad(20);
        lista.add(per);

        per=new Persona();
        per.setId(2);
        per.setNombre("Lola");
        per.setEdad(19);
        lista.add(per);

        return lista;
    }
}

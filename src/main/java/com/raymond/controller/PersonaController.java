package com.raymond.controller;

import com.raymond.dao.PersonaDAOImpl;
import com.raymond.model.Persona;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class PersonaController implements Serializable {

    private List<Persona> lista;
    private PersonaDAOImpl dao;

    public PersonaController(){
        lista=new ArrayList<>();
        dao=new PersonaDAOImpl();
        this.listar();
    }

    public void listar(){
        lista=dao.listar();
    }

    public List<Persona> getLista() {
        return lista;
    }

    public void setLista(List<Persona> lista) {
        this.lista = lista;
    }

    public PersonaDAOImpl getDao() {
        return dao;
    }

    public void setDao(PersonaDAOImpl dao) {
        this.dao = dao;
    }
}

package com.taller.colombia.controladores;

import com.taller.colombia.modelos.Perro;
import com.taller.colombia.persistencia.PerroDAO;
import com.taller.colombia.persistencia.PerroDaoImpl;

import java.util.List;

public class PerroController {

    private PerroDAO dao = new PerroDaoImpl();

    public void agregarPerro(Perro perro) {
        dao.agregarPerro(perro);
    }

    public List<Perro> obtenerPerros() {
        return dao.obtenerPerros();
    }

    public Perro buscarPerro(String nombre) {
        return dao.buscarPerro(nombre);
    }

    public void actualizarPerro(Perro perro) {
        dao.actualizarPerro(perro);
    }

    public void eliminarPerro(String nombre) {
        dao.eliminarPerro(nombre);
    }


}

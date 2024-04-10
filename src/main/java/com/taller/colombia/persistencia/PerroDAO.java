package com.taller.colombia.persistencia;

import com.taller.colombia.modelos.Departamento;
import com.taller.colombia.modelos.Perro;

import java.util.List;

public interface PerroDAO {

    void agregarPerro(Perro perro);

    List<Perro> obtenerPerros();

    Perro buscarPerro(String nombre);

    void actualizarPerro(Perro perro);

    void eliminarPerro(String nombre);

}

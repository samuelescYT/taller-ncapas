package com.taller.colombia.persistencia;

import com.taller.colombia.modelos.Departamento;
import com.taller.colombia.modelos.Perro;

import java.util.ArrayList;
import java.util.List;

public class PerroDaoImpl implements PerroDAO {

    private List<Perro> perros = new ArrayList<>();

    @Override
    public void agregarPerro(Perro perro) {
        this.perros.add(perro);
    }

    @Override
    public List<Perro> obtenerPerros() {
        return new ArrayList<>(perros);
    }

    @Override
    public Perro buscarPerro(String nombre) {
        return perros.stream()
                .filter(perro -> perro.getNombre().equalsIgnoreCase(nombre))
                .findFirst().orElse(null);
    }

    @Override
    public void actualizarPerro(Perro perro) {
        int index = perros.indexOf(buscarPerro(perro.getNombre()));
        if(index >= 0) {
            perros.set(index, perro);
        }
    }

    @Override
    public void eliminarPerro(String nombre) {
        perros.removeIf(perro -> perro.getNombre
                ().equalsIgnoreCase(nombre));
    }
}

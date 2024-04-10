package com.taller.colombia.persistencia;

import com.taller.colombia.modelos.Departamento;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoDAOImpl implements DepartamentoDAO {

    private List<Departamento> departamentos = new ArrayList<>();

    @Override
    public void agregarDepartamento(Departamento departamento) {
        this.departamentos.add(departamento);
    }

    @Override
    public List<Departamento> obtenerDepartamentos() {
        return new ArrayList<>(departamentos);
    }

    @Override
    public Departamento buscarDepartamento(String nombre) {
        return departamentos.stream()
                .filter(departamento -> departamento.getNombre
                        ().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void actualizarDepartamento(Departamento departamento) {
        int index = departamentos.indexOf(buscarDepartamento(departamento.getNombre()));
        if(index >= 0) {
            departamentos.set(index, departamento);
        }
    }

    @Override
    public void eliminarDepartamento(String nombre) {
        departamentos.removeIf(departamento -> departamento.getNombre
                ().equalsIgnoreCase(nombre));
    }
}

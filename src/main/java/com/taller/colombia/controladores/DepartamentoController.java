package com.taller.colombia.controladores;

import com.taller.colombia.modelos.Departamento;
import com.taller.colombia.persistencia.DepartamentoDAO;
import com.taller.colombia.persistencia.DepartamentoDAOImpl;

import java.util.List;

public class DepartamentoController {

    private DepartamentoDAO dao = new DepartamentoDAOImpl();

    public void agregarDepartamento(Departamento departamento) {
        dao.agregarDepartamento(departamento);
    }

    public List<Departamento> obtenerDepartamentos() {
        return dao.obtenerDepartamentos();
    }

    public Departamento buscarDepartamento(String nombre) {
        return dao.buscarDepartamento(nombre);
    }

    public void actualizarDepartamento(Departamento departamento) {
        dao.actualizarDepartamento(departamento);
    }

    public void eliminarDepartamento(String nombre) {
        dao.eliminarDepartamento(nombre);
    }

}

package com.taller.colombia.persistencia;

import com.taller.colombia.modelos.Departamento;

import java.util.List;
public interface DepartamentoDAO {

    void agregarDepartamento(Departamento departamento);

    List<Departamento> obtenerDepartamentos();

    Departamento buscarDepartamento(String nombre);

    void actualizarDepartamento(Departamento departamento);

    void eliminarDepartamento(String nombre);

}

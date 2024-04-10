package com.taller.colombia.presentacion;

import com.taller.colombia.controladores.DepartamentoController;
import com.taller.colombia.modelos.Departamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DepartamentoController controller = new DepartamentoController();
        int opcion = 0;

        System.out.println("CRUD Departamentos");

        do {
            System.out.println("1. Agregar departamento");
            System.out.println("2. Obtener departamentos");
            System.out.println("3. Buscar departamentos");
            System.out.println("4. Actualizar departamento");
            System.out.println("5. Eliminar departamento");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch(opcion) {
                case 1: {
                    String nombre, capital, descripcion;
                    int poblacion;

                    System.out.print("Ingrese el nombre del departamento: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la capital del departamento: ");
                    capital = scanner.nextLine();
                    System.out.print("Ingrese la poblacion del departamento: ");
                    poblacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la descripcion del departamento: ");
                    descripcion = scanner.nextLine();

                    Departamento departamento = new Departamento(nombre, capital, poblacion, descripcion);
                    controller.agregarDepartamento(departamento);
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("Los departamentos que hay son: \n");
                    for(Departamento d: controller.obtenerDepartamentos()) {
                        System.out.println("Nombre: "+d.getNombre());
                        System.out.println("Capital: "+d.getCapital());
                        System.out.println("Poblacion: "+d.getPoblacion());
                        System.out.println("Descripcion: "+d.getDescripcion());
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    String nombreDepartamento;
                    System.out.print("Ingrese el nombre del departamento que va a buscar: ");
                    nombreDepartamento = scanner.nextLine();

                    Departamento departamento = controller.buscarDepartamento(nombreDepartamento);

                    if(departamento != null) {
                        System.out.println("Departamento encontrado!");
                        System.out.println("Nombre: "+departamento.getNombre());
                        System.out.println("Capital: "+departamento.getCapital());
                        System.out.println("Poblacion: "+departamento.getPoblacion());
                        System.out.println("Descripcion: "+departamento.getDescripcion());

                    } else {
                        System.out.println("No hay un departamento que tenga ese nombre");
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    String nombre, capital, descripcion;
                    int poblacion;

                    System.out.print("Ingrese el nombre del departamento que va a modificar: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva capital del departamento: ");
                    capital = scanner.nextLine();
                    System.out.print("Ingrese la nueva poblacion del departamento: ");
                    poblacion = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese la nueva descripcion del departamento: ");
                    descripcion = scanner.nextLine();
                    System.out.println();

                    Departamento departamento = new Departamento(nombre, capital, poblacion, descripcion);
                    controller.actualizarDepartamento(departamento);
                    System.out.println();
                    break;
                }
                case 5: {
                    String nombre;
                    System.out.print("Ingrese el nombre del departamento que desea eliminar: ");
                    nombre = scanner.nextLine();

                    controller.eliminarDepartamento(nombre);
                    System.out.println();
                    break;
                }
                case 6:
                    System.out.println("Gracias por usar!");
                    break;
                default:
                    System.out.println("Opcion incorrecta, vuelva a intentar");
                    System.out.println();
            }
        } while(opcion != 6);
    }

}

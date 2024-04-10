package com.taller.colombia.presentacion;

import com.taller.colombia.controladores.DepartamentoController;
import com.taller.colombia.controladores.PerroController;
import com.taller.colombia.modelos.Departamento;
import com.taller.colombia.modelos.Perro;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        System.out.println("Bienvenido");
        System.out.println("Ingrese 1 para entrar al CRUD de departamentos");
        System.out.println("Ingrese 2 para entrar al CRUD de perros");
        System.out.print("Opcion: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1: {
                DepartamentoController controller = new DepartamentoController();
                opcion = 0;
                crudDepartamentos(controller, scanner, opcion);
                break;
            }
            case 2: {
                PerroController controller = new PerroController();
                opcion = 0;
                crudPerritos(controller, scanner, opcion);
                break;
            }
            default:
                System.out.println("Opcion incorrecta");
        }


    }

    public static void crudDepartamentos(DepartamentoController controller, Scanner scanner, int opcion) {
        System.out.println("\nCRUD Departamentos");

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

    public static void crudPerritos(PerroController controller, Scanner scanner, int opcion) {
        System.out.println("\nCRUD perros");

        do {
            System.out.println("1. Agregar perro");
            System.out.println("2. Obtener perros");
            System.out.println("3. Buscar perro");
            System.out.println("4. Actualizar perro");
            System.out.println("5. Eliminar perro");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch(opcion) {
                case 1: {
                    String nombre, raza, color, apodo;

                    System.out.print("Ingrese el nombre del perro: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la raza del perro: ");
                    raza = scanner.nextLine();
                    System.out.print("Ingrese el color del perro: ");
                    color = scanner.nextLine();
                    System.out.print("Ingrese el apodo del perro: ");
                    apodo = scanner.nextLine();

                    Perro perro = new Perro(nombre, raza, color, apodo);
                    controller.agregarPerro(perro);
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("Los perros que hay son: \n");
                    for(Perro p: controller.obtenerPerros()) {
                        System.out.println("Nombre: "+p.getNombre());
                        System.out.println("Raza: "+p.getRaza());
                        System.out.println("Color: "+p.getColor());
                        System.out.println("Apodo: "+p.getApodo());
                        System.out.println();
                    }
                    break;
                }
                case 3: {
                    String nombrePerro;
                    System.out.print("Ingrese el nombre del perro que va a buscar: ");
                    nombrePerro = scanner.nextLine();

                    Perro perro = controller.buscarPerro(nombrePerro);

                    if(perro != null) {
                        System.out.println("Perro encontrado!");
                        System.out.println("Nombre: "+perro.getNombre());
                        System.out.println("Raza: "+perro.getRaza());
                        System.out.println("Color: "+perro.getColor());
                        System.out.println("Apodo: "+perro.getApodo());

                    } else {
                        System.out.println("No hay un perro que tenga ese nombre");
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    String nombre, raza, color, apodo;

                    System.out.print("Ingrese el nombre del perro que va a modificar: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese la nueva raza del perro: ");
                    raza = scanner.nextLine();
                    System.out.print("Ingrese el nuevo color del perro: ");
                    color = scanner.nextLine();
                    System.out.print("Ingrese el nuevo apodo del perro: ");
                    apodo = scanner.nextLine();
                    System.out.println();

                    Perro perro = new Perro(nombre, raza, color, apodo);
                    controller.actualizarPerro(perro);
                    System.out.println();
                    break;
                }
                case 5: {
                    String nombre;
                    System.out.print("Ingrese el nombre del perro que desea eliminar: ");
                    nombre = scanner.nextLine();

                    controller.eliminarPerro(nombre);
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

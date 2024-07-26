/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoriodos;
import java.util.HashMap;
import java.util.Map;
    import java.util.Scanner;

/**
 *
 * @author dany8
 */
public class Cano_Daniel_Laboratorio2 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Notas");
            
            
            System.out.println("3. Clases");
            System.out.print("Seleccione una opción: ");

            int opcion = lea.nextInt();

            if (opcion == 1) {
              System.out.println("Ingrese una cadena:");
        String cadena = lea.nextLine();
        
        Map<Character, Integer> frecuencia = new HashMap<>();
        int indice = 0;
        int longitud = cadena.length();
        
        while (indice < longitud) {
            char caracter = cadena.charAt(indice);
            frecuencia.put(caracter, frecuencia.getOrDefault(caracter, 0) + 1);
            indice++;
        }
        
        char caracterMasRepetido = ' ';
        int maxFrecuencia = 0;
        
        for (Map.Entry<Character, Integer> entrada : frecuencia.entrySet()) {
            if (entrada.getValue() > maxFrecuencia) {
                caracterMasRepetido = entrada.getKey();
                maxFrecuencia = entrada.getValue();
            }
        }
        
        System.out.println("El caracter que más se repite es '" + caracterMasRepetido + "' y se repite " + maxFrecuencia + " veces.");
        
            } else if (opcion == 2) {
                int cantidadNotas = 0;
        while (true) {
            System.out.println("Ingrese la cantidad de notas:");
            cantidadNotas = lea.nextInt();
            if (cantidadNotas > 0) {
                break;
            } else {
                System.out.println("Numero positivo! ");
            }
        }

        double[] notas = new double[cantidadNotas];
        
        for (int notass = 0; notass < cantidadNotas; notass++) {
            while (true) {
                System.out.println("Nota# " + (notass + 1) + ":");
                double nota = lea.nextDouble();
                if (nota >= 0 && nota <= 100) {
                    notas[notass] = nota;
                    break;
                } else {
                    System.out.println("La nota debe estar en el rango de 0 a 100.");
                }
            }
        }

        int suma = 0;
        double notaMayor = notas[0];
        double notaMenor = notas[0];
        
        for (double nota : notas) {
            suma += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }
        
        int promedio = suma / cantidadNotas;
        
        
        
                
        System.out.println("Promedio: %"+ promedio);
        System.out.println("Nota mayor: "+ notaMayor);
        System.out.println("Nota menor: "+ notaMenor);
                
                
                System.out.println("Has seleccionado la Opción 2");
            } else if (opcion == 3) {
                
                 System.out.println("Ingrese la fecha actual en formato \"dia, DD/MM\":");
        String fecha = lea.nextLine().trim();

        // Buscar la coma y el espacio en la cadena
        int comaIndice = fecha.indexOf(',');
        if (comaIndice == -1 || comaIndice == fecha.length() - 1) {
            System.out.println("Se produjo un error.");
            return;
        }

        // Separar el día y la fecha manualmente
        String dia = fecha.substring(0, comaIndice).toLowerCase();
        String fechaParte = fecha.substring(comaIndice + 2);

        // Validar que la fecha tenga el formato correcto
        if (fechaParte.length() != 5 || fechaParte.charAt(2) != '/') {
            System.out.println("Se produjo un error.");
            return;
        }

        int diaNumero, mesNumero;
        try {
            diaNumero = Integer.parseInt(fechaParte.substring(0, 2));
            mesNumero = Integer.parseInt(fechaParte.substring(3));
        } catch (NumberFormatException e) {
            System.out.println("Se produjo un error.");
            return;
        }

        // Validar la fecha
        if (diaNumero < 1 || diaNumero > 31 || mesNumero < 1 || mesNumero > 12) {
            System.out.println("Se produjo un error.");
            return;
        }

        boolean diaValido = false;
        while (!diaValido) {
            if (dia.equals("lunes")) {
                diaValido = true;
                System.out.println("Se tomaron exámenes en el nivel inicial? (si/no):");
                String respuesta = lea.nextLine().trim().toLowerCase();
                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("Ingrese la cantidad de alumnos que aprobaron:");
                    int aprobados = lea.nextInt();
                    System.out.println("Ingrese la cantidad de alumnos que no aprobaron:");
                    int noAprobados = lea.nextInt();
                    lea.nextLine(); // Limpiar el buffer

                    int total = aprobados + noAprobados;
                    if (total > 0) {
                        double porcentajeAprobados = (double) aprobados / total * 100;
                        System.out.println("Porcentaje de aprobados: "+ porcentajeAprobados);
                    } else {
                        System.out.println("No se ingresaron alumnos.");
                    }
                }
            } else if (dia.equals("martes")) {
                diaValido = true;
                System.out.println("Se tomaron exámenes en el nivel intermedio? (si/no):");
                String respuesta = lea.nextLine().trim().toLowerCase();
                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("Ingrese la cantidad de alumnos que aprobaron:");
                    int aprobados = lea.nextInt();
                    System.out.println("Ingrese la cantidad de alumnos que no aprobaron:");
                    int noAprobados = lea.nextInt();
                    lea.nextLine(); 

                    int total = aprobados + noAprobados;
                    if (total > 0) {
                        double porcentajeAprobados = (double) aprobados / total * 100;
                        System.out.println("Porcentaje de aprobados:"+ porcentajeAprobados);
                    } else {
                        System.out.println("No se ingresaron alumnos.");
                    }
                }
            } else if (dia.equals("miercoles")) {
                diaValido = true;
                System.out.println("¿Se tomaron exámenes en el nivel avanzado? (sí/no):");
                String respuesta = lea.nextLine().trim().toLowerCase();
                if (respuesta.equals("sí") || respuesta.equals("si")) {
                    System.out.println("Ingrese la cantidad de alumnos que aprobaron:");
                    int aprobados = lea.nextInt();
                    System.out.println("Ingrese la cantidad de alumnos que no aprobaron:");
                    int noAprobados = lea.nextInt();
                    lea.nextLine(); 

                    int total = aprobados + noAprobados;
                    if (total > 0) {
                        double porcentajeAprobados = (double) aprobados / total * 100;
                        System.out.println("Porcentaje de aprobados: %"+ porcentajeAprobados);
                    } else {
                        System.out.println("No se ingresaron alumnos.");
                    }
                }
            } else if (dia.equals("jueves")) {
                diaValido = true;
                System.out.println("Ingrese el porcentaje de asistencia a clase:");
                double asistencia = lea.nextDouble();
                lea.nextLine(); 

                if (asistencia > 50) {
                    System.out.println("Asistio la mayoria.");
                } else {
                    System.out.println("No asistio la mayoria. :(");
                }
            } else if (dia.equals("viernes")) {
                diaValido = true;
                if ((diaNumero == 1 && mesNumero == 1) || (diaNumero == 1 && mesNumero == 7)) {
                    System.out.println("Comienzo de nuevo ciclo.");
                    System.out.println("Ingrese la cantidad de alumnos del nuevo ciclo:");
                    int cantidadAlumnos = lea.nextInt();
                    System.out.println("Ingrese el precio en $ por cada alumno:");
                    double precioPorAlumno = lea.nextDouble();
                    lea.nextLine(); 

                    double ingresoTotal = cantidadAlumnos * precioPorAlumno;
                    System.out.println("Ingreso total en $: %d"+ ingresoTotal);
                }
            } else {
                System.out.println("Se produjo un error.");
                return;
            }
        }

        
        
 

            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                salir = true;
            } else {
                System.out.println("Opción no válida, por favor seleccione una opción entre 1 y 4.");
            }
        }

        lea.close();
    }
}


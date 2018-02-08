import java.util.Calendar;
import java.util.Scanner;

/*
Introducir metodo para validar dia y el mes.
 */


public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda(Calendar.getInstance().get(Calendar.YEAR));
        int opcion, mes, dia, hora, minutos;
        String titulo, descripcion;


        do {
            System.out.print("Introduce mes: ");
            mes = scanner.nextInt();
            System.out.print("Introduce dia: ");
            dia = scanner.nextInt();
            menu();
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Introduce titulo: ");
                    titulo = scanner.nextLine();
                    System.out.print("Introduce descripcion: ");
                    descripcion = scanner.nextLine();
                    System.out.print("Introduce hora: ");
                    hora = scanner.nextInt();
                    System.out.print("Introduce minutos: ");
                    minutos = scanner.nextInt();
                    agenda.buscarPagina(dia, mes).anadirCita(new Cita(titulo, descripcion, hora, minutos));
                    for (Cita c :
                            agenda.buscarPagina(dia, mes).getCitas()) {
                        System.out.println(c.leerCita());
                    }
                    break;

                case 2:
                    System.out.print("Introduce hora: ");
                    hora = scanner.nextInt();
                    System.out.print("Introduce minutos: ");
                    minutos = scanner.nextInt();
                    agenda.buscarPagina(dia, mes).borrarCita(new Cita("", "", hora, minutos));
                    for (Cita c :
                            agenda.buscarPagina(dia, mes).getCitas()) {
                        System.out.println(c.leerCita());
                    }
                    break;

                case 3:
                    System.out.print("Introduce hora: ");
                    hora = scanner.nextInt();
                    System.out.print("Introduce minutos: ");
                    minutos = scanner.nextInt();
                    System.out.println(agenda.buscarPagina(dia, mes).buscarCita(hora, minutos).leerCita());
                    for (Cita c :
                            agenda.buscarPagina(dia, mes).getCitas()) {
                        System.out.println(c.leerCita());
                    }
                    break;

                case 4:
                    System.out.print("Introduce hora: ");
                    hora = scanner.nextInt();
                    System.out.print("Introduce minutos: ");
                    minutos = scanner.nextInt();
                    System.out.print("Introduce texto a cambiar: ");
                    descripcion = scanner.nextLine();
                    agenda.buscarPagina(dia, mes).buscarCita(hora, minutos).setDescripcion(descripcion);
                    for (Cita c :
                            agenda.buscarPagina(dia, mes).getCitas()) {
                        System.out.println(c.leerCita());
                    }
                    break;

                default:

                    break;
            }

        } while (opcion != 0);
    }

    private static void menu() {
        System.out.println("1.- Añadir cita\n2.- Borrar cita\n3.- Buscar cita\n4.- Modificar cita\n" +
                "Elige opción: ");
    }
}

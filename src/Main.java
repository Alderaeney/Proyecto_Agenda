import java.util.Calendar;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int ano = Calendar.getInstance().get(Calendar.YEAR);
        Agenda agenda = new Agenda(ano);
        int opcion, mes, dia, hora, minutos;
        String titulo, descripcion;
        boolean correcto;

        do {
            do {
                System.out.print("Introduce mes: ");
                mes = scanner.nextInt();
                System.out.print("Introduce dia: ");
                dia = scanner.nextInt();
                if (correcto = comprovarDiaMes(dia, mes, ano % 4 == 0))
                    System.out.println("Dia y mes correctos.");
                else System.out.println("Dia o mes incorrectos.");
            } while (!correcto);
            agenda.setPaginaAbierta(agenda.buscarPagina(dia, mes));
            menu();
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Introduce titulo: ");
                    scanner.nextLine();
                    titulo = scanner.nextLine();
                    System.out.print("Introduce descripcion: ");
                    descripcion = scanner.nextLine();
                    System.out.print("Introduce hora: ");
                    hora = scanner.nextInt();
                    System.out.print("Introduce minutos: ");
                    minutos = scanner.nextInt();
                    agenda.getPaginaAbierta().anadirCita(new Cita(titulo, descripcion, hora, minutos));
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
                    agenda.getPaginaAbierta().borrarCita(new Cita("", "", hora, minutos));
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
                    System.out.println(agenda.getPaginaAbierta().buscarCita(hora, minutos).leerCita());
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
                    agenda.getPaginaAbierta().buscarCita(hora, minutos).setDescripcion(descripcion);
                    for (Cita c :
                            agenda.buscarPagina(dia, mes).getCitas()) {
                        System.out.println(c.leerCita());
                    }
                    break;

                case 0:
                    System.out.println("Adios...");
                    break;

                default:
                    System.out.println("Opción incorrecta...");
                    break;
            }

        } while (opcion != 0);
    }

    private static void menu() {
        System.out.print("1.- Añadir cita\n2.- Borrar cita\n3.- Buscar cita\n4.- Modificar cita\n0.- Salir\n" +
                "Elige opción: ");
    }

    private static boolean comprovarDiaMes(int dia, int mes, boolean bisiesto) {
        if (mes > 0 && mes <= 12){
            if (mes == 2){
                return dia > 0 && dia <= (bisiesto ? 29 : 28);
            } else if (mes % 2 == 0 && mes < 7){
                return dia > 0 && dia <= 30;
            } else if (mes % 2 != 0 && mes < 8){
                return dia > 0 && dia <= 31;
            } else if (mes % 2 == 0 && mes > 7){
                return dia > 0 && dia <= 31;
            } else {
                return dia > 0 && dia <= 30;
            }
        } else return false;
    }
}

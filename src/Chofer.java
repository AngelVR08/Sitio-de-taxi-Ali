import java.util.Scanner;

class Chofer {
    Scanner scanner = new Scanner(System.in);
    Servicio servicio = new Servicio();

    public void menuChofer() {
        int opcion;
        do {
            System.out.println("+++++++++++Menu Chofer+++++++++++");
            System.out.println("1.Guardar servicios a mi historial");
            System.out.println("2.Ver mi historial");
            System.out.println("3.Mis ganancias");
            System.out.println("4.Salir");
            System.out.println("----------------------------------");
            System.out.print("Elija una opcion:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    guardarServicio();
                    break;
                case 2:
                    servicio.verHistorial();
                    break;
                case 3:
                    calcularGanancias();
                    break;
                case 4:
                    System.out.println("Volviendo al menu principal.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 4);
    }

    public void guardarServicio() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la hora del servicio (Hora:Minutos): ");
        String hora = scanner.nextLine();
        System.out.print("Ingrese el total cobrado: ");
        double total = scanner.nextDouble();
        servicio.agregarServicio("Hora: " + hora + ", Total cobrado: " + total);
        System.out.println("Servicio guardado en el historial correctamente.");
    }

    public void calcularGanancias() {
        System.out.print("Ingrese el total de sus cobros: ");
        double totalServicios = scanner.nextDouble();
        double ganancias = servicio.calcularGanancias(totalServicios);
        System.out.println("Sus ganancias son: $" + ganancias);
    }
}
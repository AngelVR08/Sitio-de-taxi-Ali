import java.util.Map;
import java.util.Scanner;

class Admin {
    Scanner scanner = new Scanner(System.in);
    Map<String, String> asignaciones = new java.util.HashMap<>();

    public void menuAdmin() {
        int opcion;
        do {
            System.out.println("++++++++++++Menu Administrador++++++++++++");
            System.out.println("1. Realizar un registro de nuevo vehiculo");
            System.out.println("2. Asignar un chofer a un vehiculo");
            System.out.println("3. Ver asignaciones");
            System.out.println("4. Salir");
            System.out.println("-------------------------------------------");
            System.out.print("Elija una opcion:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarVehiculo();
                    break;
                case 2:
                    asignarChofer();
                    break;
                case 3:
                    verAsignaciones();
                    break;
                case 4:
                    System.out.println("Volviendo al menu principal.");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
        } while (opcion != 4);
    }

    public void registrarVehiculo() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la marca del vehiculo: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el año del vehiculo: ");
        int año = scanner.nextInt();
        // Aquí podrías guardar los datos en alguna estructura de datos si lo necesitas
        System.out.println("Vehiculo registrado correctamente.");
    }

    public void asignarChofer() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del chofer: ");
        String nombreChofer = scanner.nextLine();
        System.out.print("Ingrese el vehiculo a asignar: ");
        String vehiculo = scanner.nextLine();
        asignaciones.put(nombreChofer, vehiculo);
        System.out.println("Asignacion realizada correctamente.");
    }

    public void verAsignaciones() {
        System.out.println("Asignaciones:");
        for (Map.Entry<String, String> asignacion : asignaciones.entrySet()) {
            System.out.println("Chofer: " + asignacion.getKey() + ", Vehiculo: " + asignacion.getValue());
        }
    }
}

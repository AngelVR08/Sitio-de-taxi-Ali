import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();
        Chofer chofer = new Chofer();

        int opcion;
        do {
            System.out.println("------------Menu-------------");
            System.out.println("1.Iniciar como Administrador");
            System.out.println("2.Iniciar como Chofer");
            System.out.println("3.Salir");
            System.out.println("-----------------------------");
            System.out.print("Elija una opcion:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    admin.menuAdmin();
                    break;
                case 2:
                    chofer.menuChofer();
                    break;
                case 3:
                    System.out.println("Saliendo.");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);

        scanner.close();
    }
}
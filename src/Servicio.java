import java.util.ArrayList;
import java.util.List;

class Servicio {
    List<String> historial = new ArrayList<>();

    public void agregarServicio(String servicio) {
        historial.add(servicio);
    }

    public void verHistorial() {
        System.out.println("Historial de Servicios:");
        for (String servicio : historial) {
            System.out.println(servicio);
        }
    }

    public double calcularGanancias(double total) {
        return total * 0.1;
    }
}

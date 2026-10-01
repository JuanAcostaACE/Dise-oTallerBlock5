import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(
            "1087654321", "Carlos Perez", "carlos@gmail.com",
            "20261025", "Ingenieria de Software"
        );

        Ejemplar ejemplar = new Ejemplar("EJ-001", "Disponible");

        Prestamo prestamo = new Prestamo(
            estudiante, ejemplar, LocalDate.of(2026, 10, 10)
        );

        System.out.println("Fecha inicial: " +
            prestamo.getFechaPrevistaDevolucion());

        // Renovacion valida
        prestamo.renovar(LocalDate.of(2026, 10, 15));
        estudiante.notificar("Su prestamo fue renovado correctamente.");

        System.out.println("Nueva fecha: " +
            prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones: " +
            prestamo.getCantidadRenovaciones());

        // Renovacion invalida
        try {
            prestamo.renovar(LocalDate.of(2026, 10, 12));
        } catch (IllegalArgumentException e) {
            System.out.println("Renovacion invalida: " + e.getMessage());
        }
    }
}

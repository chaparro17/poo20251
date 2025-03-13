import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

class Moto {
    String placa;
    int cilindraje;
    LocalTime horaIngreso;

    public Moto(String placa, int cilindraje, LocalTime horaIngreso) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.horaIngreso = horaIngreso;
    }
}

class Parqueadero {
    private final ArrayList<Moto> bajoCilindraje = new ArrayList<>();
    private final ArrayList<Moto> altoCilindraje = new ArrayList<>();
    private final int maxBajoCilindraje = 20;
    private final int maxAltoCilindraje = 10;
    private final Scanner sc = new Scanner(System.in);
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    public void registrarMoto() {
        System.out.print("Ingrese la placa de la moto: ");
        String placa = sc.next();
        System.out.print("Ingrese el cilindraje de la moto: ");
        int cilindraje = sc.nextInt();
        System.out.print("Ingrese la hora de ingreso (formato 24h HH:mm): ");
        String horaStr = sc.next();
        LocalTime horaIngreso = LocalTime.parse(horaStr, formatter);

        Moto moto = new Moto(placa, cilindraje, horaIngreso);
        if (cilindraje < 400) {
            if (bajoCilindraje.size() < maxBajoCilindraje) {
                bajoCilindraje.add(moto);
                System.out.println("Moto registrada en bajo cilindraje.");
            } else {
                System.out.println("No hay espacios en bajo cilindraje.");
            }
        } else {
            if (altoCilindraje.size() < maxAltoCilindraje) {
                altoCilindraje.add(moto);
                System.out.println("Moto registrada en alto cilindraje.");
            } else {
                System.out.println("No hay espacios en alto cilindraje.");
            }
        }
    }

    public void cobrarTarifa() {
        System.out.print("Ingrese la placa de la moto: ");
        String placa = sc.next();
        
        if (eliminarMotoYCalcularCobro(bajoCilindraje, placa) || eliminarMotoYCalcularCobro(altoCilindraje, placa)) {
            return;
        }
        System.out.println("Moto no encontrada.");
    }

    private boolean eliminarMotoYCalcularCobro(ArrayList<Moto> lista, String placa) {
        Iterator<Moto> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Moto moto = iterator.next();
            if (moto.placa.equals(placa)) {
                LocalTime horaActual = LocalTime.now();
                long tiempoEstacionado = Duration.between(moto.horaIngreso, horaActual).toMinutes();
                int costo = (tiempoEstacionado <= 30) ? 0 : (tiempoEstacionado <= 60) ? 800 : 2000;
                System.out.println("Tiempo estacionado: " + tiempoEstacionado + " minutos.");
                System.out.println("Costo total: $" + costo);
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public void mostrarEstado() {
        System.out.println("Puestos de bajo cilindraje: " + bajoCilindraje.size() + "/" + maxBajoCilindraje);
        System.out.println("Puestos de alto cilindraje: " + altoCilindraje.size() + "/" + maxAltoCilindraje);
    }
}

public class SistemaParqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero();
        int opcion;
        do {
            System.out.println("\nMenú Principal:");
            System.out.println("1. Registrar moto");
            System.out.println("2. Cobrar tarifa");
            System.out.println("3. Mostrar estado del parqueadero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> parqueadero.registrarMoto();
                case 2 -> parqueadero.cobrarTarifa();
                case 3 -> parqueadero.mostrarEstado();
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
        sc.close();
    }
}
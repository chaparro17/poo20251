import java.util.Scanner;

public class JuegoLucha {
    private Personaje jugador1;
    private Personaje jugador2;

    public JuegoLucha(Personaje jugador1, Personaje jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public void iniciarPelea() {
        System.out.println("🔥 La pelea comienza entre " + jugador1.getNombre() + " y " + jugador2.getNombre() + "...\n");

        while (jugador1.estaVivo() && jugador2.estaVivo()) {
            turno(jugador1, jugador2);
            if (jugador2.estaVivo()) {
                turno(jugador2, jugador1);
            }
        }

        if (jugador1.estaVivo()) {
            System.out.println("\n🏆 " + jugador1.getNombre() + " ha ganado la pelea.");
        } else {
            System.out.println("\n🏆 " + jugador2.getNombre() + " ha ganado la pelea.");
        }
    }

    private void turno(Personaje atacante, Personaje defensor) {
        System.out.println("Turno de " + atacante.getNombre() + ". Puntos de vida de " + defensor.getNombre() + ": " + defensor.getPuntosDeVida());
        atacante.atacar(defensor);
        System.out.println(defensor.getNombre() + " ahora tiene " + defensor.getPuntosDeVida() + " puntos de vida.\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre del Dragón: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Introduce el nombre del Cazador: ");
        String nombre2 = scanner.nextLine();

        Personaje dragon = new Dragon(nombre1);
        Personaje cazador = new Cazador(nombre2);

        JuegoLucha juego = new JuegoLucha(dragon, cazador);
        juego.iniciarPelea();
    }
}
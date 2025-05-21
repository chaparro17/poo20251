import java.util.Random;

public class Cazador extends Personaje {

    public Cazador(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int chance = rand.nextInt(100);

        if (chance < 30) {
            System.out.println(nombre + " dispara una flecha explosiva 🎯!");
            int dano = rand.nextInt((MAX_DANO - MIN_DANO + 1)) + MIN_DANO + 5; // daño ligeramente mayor
            if (dano > 35) dano = 35;
            oponente.recibirDano(dano);
            System.out.println(nombre + " causa " + dano + " puntos de daño con su ataque especial.");
        } else {
            System.out.println(nombre + " ataca con su ballesta.");
            super.atacar(oponente);
        }
    }
}
import java.util.Random;

public class Dragon extends Personaje {

    public Dragon(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int chance = rand.nextInt(100); // 0 a 99

        if (chance < 30) { // 30% probabilidad de ataque especial
            System.out.println(nombre + " lanza un aliento de fuego feroz 🔥!");
            int dano = rand.nextInt((MAX_DANO - MIN_DANO + 1)) + MIN_DANO + 10; // más 10 extra
            if (dano > 40) dano = 40; // límite superior opcional
            oponente.recibirDano(dano);
            System.out.println(nombre + " causa " + dano + " puntos de daño con su ataque especial.");
        } else {
            System.out.println(nombre + " golpea con sus garras.");
            super.atacar(oponente);
        }
    }
}
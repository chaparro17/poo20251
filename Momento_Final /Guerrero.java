public class Guerrero extends Personaje {

    public Guerrero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        System.out.println(nombre + " usa su espada...");
        super.atacar(oponente);
    }
}
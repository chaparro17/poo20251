public class Hechicero extends Personaje {

    public Hechicero(String nombre) {
        super(nombre);
    }

    @Override
    public void atacar(Personaje oponente) {
        System.out.println(nombre + " lanza un hechizo mágico...");
        super.atacar(oponente);
    }
}
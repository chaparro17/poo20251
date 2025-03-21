
public class EjecutarHerencia {
    public static void main(String[] args) {

        // Creacion de los objetos (instanciar)
        Trabajador objT1 = new Operario(1, "Pepito", "puertas", 135.0);
        Trabajador objT2 = new Operario(2, "Juan", "Puertas", 10);

        System.out.println(objT1);
        System.out.println(objT2);
    }
}

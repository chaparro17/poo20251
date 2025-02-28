public class Vehiculo {

    // Atributos de la clase
    private String marca;
    private String color;
    private double cilindraje;
    private String chasis;
    private double peso;
    private String potencia;

    // constructor de la clase = permite inicializar el objeto
    // el constructor de la clase se reconoce porque tiene el mismo nombre de la
    // clase

    public Vehiculo(String marca, String color, double cilindraje, String chasis, double peso, String potencia) {
        this.marca = marca;
        this.color = color;
        this.cilindraje = cilindraje;
        this.chasis = chasis;
        this.peso = peso;
        this.potencia = potencia;
    }

    // metodos getter / setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //permite mostrar el objeto
    public String toString() {
        return "Vehiculo { Marca: " + marca + " Color: " + color + " Cilindraje: " + cilindraje + " Chasis: " + chasis
                + " Peso: " + peso + " Potencia: " + potencia + " }";
    }

    //metodos de la clase propios 
    public void acelerar(){
        System.out.println("Vehiculo acelerando.....");
    }

    public void frenar(){
        System.out.println("Vehiculo frenando.....");
}
    public void girarIzquierda(){
    System.out.println("Vehiculo girando izquierda.....");
}

public void girarDerecha(){
    System.out.println("Vehiculo girando derecha.....");
}

public void retroceder(){
    System.out.println("Vehiculo retrocediendo.....");
}
}
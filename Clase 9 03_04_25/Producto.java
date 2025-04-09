// Clase abstracta: no se puede crear directamente un objeto Producto, solo se usa como base
public abstract class Producto {
    // Atributo protegido: accesible desde las clases hijas
    protected int numero;
 
    // Constructor que inicializa el número del producto
    public Producto(int numero) {
        this.numero = numero;
    }
 
    // Método que devuelve el número del producto
    public int getNumero() {
        return numero;
    }
 
    // Método abstracto: cada clase hija debe implementarlo con su propia versión
    public abstract void mostrarDetalle();
}
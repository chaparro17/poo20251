import java.util.Date;
 
// Clase principal que contiene el método main para ejecutar el programa
public class Main {
    public static void main(String[] args) {
 
        // Se crea un cliente con su cédula y nombre
        Cliente cliente = new Cliente("123456789", "Laura Torres");
 
        // Se crea una cámara (producto) con número, marca y modelo
        Camara cam = new Camara(1, "Canon", "EOS R50");
 
        // Se crean dos fotos que se van a imprimir
        Foto[] fotos = {
            new Foto("foto1.jpg"),
            new Foto("foto2.jpg")
        };
 
        // Se crea una impresión que contiene las fotos
        Impresion imp = new Impresion(2, "Color", fotos);
 
        // Se agrupan los productos en un arreglo del tipo Producto
        // Esto permite aplicar polimorfismo porque Camara e Impresion son productos
        Producto[] productos = { cam, imp };
 
        // Se crea un pedido con el cliente, los productos, la fecha actual y un número de tarjeta
        Pedido pedido = new Pedido(cliente, productos, new Date(), 987654321);
 
        // Se muestra toda la información del pedido por pantalla
        pedido.mostrarPedido();
    }
}
import java.util.Scanner;

public class ParqueaderoCali {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] bajoCilindraje = new String[20]; //se colocan 20 puestos porque son los puestos que debe de tener disponible el parqueadero de baja cilindrarda 
    String[] altoCilindraje = new String[10]; //10 puestos para alta 
    int[] minutosIngresoBajo = new int[20];
    int[] minutosIngresoAlto = new int[10];
    int opcion; 

    do{
    System.out.println("\nMenu opciones:");
    System.out.println("1.Registrar moto");
    System.out.println("2.Cobrar tarifa");
    System.out.println("3.Visualizar estado parqueadero");
    System.out.println("4.Abandonar manu");
    System.out.print("Digite una opcion: ");
    opcion = sc.nextInt();
    sc.nextLine(); //Limpiar buffer 
    }

}
}

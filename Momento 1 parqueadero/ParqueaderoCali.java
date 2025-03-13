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

    if (opcion == 1){
        System.out.println("Digite la placa de la moto:");
        String placa = sc.next();
        System.out.println("Digite cilindraje de la moto");
        int cilindraje = sc.nextInt();
        sc.nextLine(); //limpiar buffer 
        System.out.println("Digite la hora de ingreso en formato HH:MM (ejemplo 12:30):");
        
        String[]timepo= sc.nextLine().split(":");
        int minutosIngreso = Integer.parseInt(timepo[0]) * 60 + Integer.parseInt(timepo[1]);

        if (cilindraje < 400){
            System.out.println("Digite la posicion (1-20):");
            int pos = sc.nextInt()-1;
            if (pos >=0 && pos < 20 && bajoCilindraje[pos] == null){
                bajoCilindraje[pos] = placa;
                minutosIngresoBajo[pos]=minutosIngreso;
                System.out.println("Moto registrada en puesto" + (pos + 1));
            }else{
                System.out.println("Posicion ocupada o invalida.");
            }
        }else{
            System.out.println("Digite la posicion (1-10):");
            int pos = sc.nextInt()-1;
            if (pos >=0 && pos < 10 &&altoCilindraje[pos]==null){
                altoCilindraje[pos]=placa;
                minutosIngresoAlto[pos]=minutosIngreso;
                System.out.println("Moto registrada en puesto" + (pos + 1));
            }else {
                System.out.println("Posicion ocupada o invalida.");
            }
        }
    }
}

}
}

public class Ejercicio13 {
    public static void main(String[] args) {
        /*
         * Dado un arreglo A de N elementos alamcenar los elementos mayores y menores
         * que la media,
         * almacenarlos en arreglos diferentes
         * 
         * Analisis: necesitamos crear el arreglo de tamaño aleatorio y generar numeros
         * aleatorios
         * para que sean almacenados en el arreglo, posteriormente obtenemos la media
         * del arreglo
         * y comparamos cada posicion del arreglo para determinar si es mayor o menor a
         * la media.
         */

        // n sera el numero aleatorio para el tamaño del arreglo
        int n = (int) (Math.random() * (15 - 5)) + 5;
        // declarar el arreglo
        int[] a = new int[n];

        // llenar el arreglo con numeros aleatorios entre 0 y 50
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * (50 - 0)) + 0;
            System.out.println(a[i] + " ");

        }
        // calcular la media del arreglo a
        // declarar una variable que almacene la suma del arreglo
        int sumaArreglo = 0;
        for (int i = 0; i < a.length; i++) {
            sumaArreglo += a[i];
        }
        double media = sumaArreglo / a.length;
        System.out.println("media del arreglo..." + media);

        // definir la cantidad de elementos que tiene el arreglos por encima de la media
        // y por debajo de la media
        int contadorMayorMedia = 0, contadorMenorMedia = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= media) {
                contadorMayorMedia++;
            } else {
                contadorMenorMedia++;
            }
        }
        // creacion de los arreglos que almacenaran los numeros mayores y menores a la
        // media
        int[] mayores = new int[contadorMayorMedia];
        int[] menores = new int[contadorMenorMedia];

        int posMayores = 0, PosMenores = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= media) {
                mayores[posMayores] = a[i];
                posMayores++;
            } else {
                menores[PosMenores] = a[i];
                PosMenores++;
            }
        }
        // mostrar el arreglo de los mayores a la media
        for (int i = 0; i < mayores.length; i++) {
            System.out.print(mayores[i] + " ");
        }
        System.out.println();

        // mostrar el arreglo de los menores a la media
        for (int i = 0; i < menores.length; i++) {
            System.out.print(menores[i] + " ");
        }

    }
}

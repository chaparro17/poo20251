public class Ejercicio3 {
    public static void main(String[] args) {

        /*
         * //dado un arreglo lineal de numeros, sumar separadamente
         * los numeros pares y los imapares
         * 
         * Analisis: declarar un arreglo, en dos variablesir guardando ir guardando
         * la suma de los numeros pares y numeros impares, lo anterios debe iterar
         * en un "for" con las condicion de validar si el numero es par o impar
         * (n%2 == o -> par)
         */
        int[] b = { 5, 2, 6, 9, 90, 1, 8, 15 };

        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                sumaPares += b[i];
            } else {
                sumaImpares += b[i];
            }
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }

}

public class EjecutarClase {
    public static void main(String[] args) {

        // creacion de los objetos de la clase vehiculos

        // Forma 1
        Vehiculo objVehiculo1 = new Vehiculo("Toyota", "Blanca", 4500.0, "TS54WE", 2.3, "150HP");

        // forma2
        Vehiculo objVehiculo2;
        objVehiculo2 = new Vehiculo("ferrari", "rojo", 5000.0, "sewr45i", 1.8, "450hp");

        // mostrar la marca del vehiculo del objeto vehiculo1
        System.out.println(objVehiculo1.getMarca());

        // se va a modificar la marca del vehiculo objeto objvehiculo1
        objVehiculo1.setMarca("checrolet");

        // mostrar todo el objeto
        System.out.println(objVehiculo1.toString());
        System.out.println(objVehiculo2);

        System.out.println(objVehiculo1.getMarca());
        objVehiculo1.acelerar();
        System.out.println(objVehiculo2.getMarca());
       objVehiculo2.frenar();
    }
}

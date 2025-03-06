package ProyectoParqueadero;

import java.time.LocalTime;

public class moto{
private String placa;
private int cilindraje;
private LocalTime horaEntrada;

public Moto(String placa, int cilindraje){
    this.placa=placa;
    this.cilindraje=cilindraje;
    this.horaEntrada=LocalTime.now();
}


}    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

//OBJETO VEHICULO
public class Vehiculo {
    //CARACTERISTICAS = ATRIBUTOS = variable
    private String hp;
    private int ruedas;
    private String modelo;
    private String color;
    private String marca;
    private int capacidad;
    private int añoFabrica;
    private boolean encendido;
    
    //constructor = inicializar variables
    public Vehiculo(){
       this .hp = "100";
       this .ruedas = 2;
       this .modelo = "Huracan";
       this .color = "Rojo";
       this .marca = "Honda";
       this .añoFabrica = 2024;


    }
            
    public void transportar(){
        System.out.println("El vehículo esta en transporte");

    }

    public void encender(){
        System.out.println("El vehículo esta en encendido");
        this.encendido = true;
    }
}  



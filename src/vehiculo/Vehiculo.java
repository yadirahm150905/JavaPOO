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
    //constructor = añadir datos
    //constructor = inicializar variables
    public Vehiculo(String caballoFuerza,int ruedas, String modelo, String marca, int capacidad, String color,int añoFabrica )
   {
       this .hp = caballoFuerza;
       this .ruedas = ruedas;
       this .modelo = modelo;  //que diga
       this .color = color;
       this .marca = marca;
       this .añoFabrica = añoFabrica;
       this .capacidad = capacidad;


    }
            
    public void transportar(){
        System.out.println("El vehiculo esta en transporte");

    }

    public void encender(){
        System.out.println("El vehiculo esta en encendido");
        this.encendido = true;
    }
//concatenar - mostrar informacion de la clase   y sus ATRIBUTOS
    public void Informacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("añoFabrica: " + añoFabrica);
        System.out.println("Caballos de Fuerza: " + hp);
        System.out.println("Ruedas: " + ruedas);
        System.out.println("Capacidad: " + capacidad);

    }
    
    
}  








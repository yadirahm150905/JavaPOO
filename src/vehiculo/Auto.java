/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;


public class Auto extends Vehiculo {
    //constructor = recibe datos
    private int numeroPuertas;
    
    public Auto(String caballoFuerza, int ruedas, String modelo, String marca, int capacidad, String color, int añoFabrica,int numeroPuertas) {
        super(caballoFuerza, ruedas, modelo, marca, capacidad, color, añoFabrica);
        this.numeroPuertas = numeroPuertas;
    }
    
    //polimorfisno
    @Override 
     public void Informacion() {
         super.Informacion();
         System.out.println("Numero de puertas:" + numeroPuertas);
    
     }
    
}
    


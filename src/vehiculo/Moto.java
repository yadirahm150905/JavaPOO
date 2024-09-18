/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;


public class Moto extends Vehiculo{
    
    public Moto(String caballoFuerza,int ruedas, String modelo, String marca, int capacidad, String color,int añoFabrica){
       super(caballoFuerza,ruedas,modelo,marca,capacidad,color,añoFabrica);
    }
    
    
    public void frenar(){
        System.out.println("La moto frena");
        
}
    
    public void encendido(){
        System.out.println("La moto esta encendida");
        
}
    public void apagado(){
        System.out.println("La moto esta apagada");
        
}
     public void acelerar(){
        System.out.println("La moto esta en acelerando");
        
}
}






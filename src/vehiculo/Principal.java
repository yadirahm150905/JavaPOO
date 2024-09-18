/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;
//autor:Yadira Yahaira Huaman Meza
public class Principal {
    public static void main(String[] args) {
    //instanciar = invocar = llamar a un objeto
    
        Moto moto = new Moto("1700",2,"ToyotaHonda","toyota",4,"rojo",2024);

        moto.encender();
        moto.transportar();
        moto.frenar();
        moto.acelerar();
        moto.encendido();
        moto.apagado();
        moto.Informacion ();
        
        Moto moto1 = new Moto("7000",2,"ToyotaHonda","Purser",4,"negro",2025);

        moto.encender();
        moto.transportar();
        moto.frenar();
        moto.acelerar();
        moto.encendido();
        moto.apagado();
        moto.Informacion ();
   //
   Auto autito = new Auto("500",4,"toyotaX","toyota",4,"azul",2028,6);
   autito.Informacion();
    }
}

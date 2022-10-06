/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.polimorfismo;

/**
 *
 * @author LABORATORIO_2
 */
public class Loro extends Animal{
    
    @Override   //polimorfismo
    public void emitirSonido(){
        System.out.println("Estoy cambioando de comportamiento!!");
    }
    
    public void comer(){
        System.out.println("comiendo a las 12:00pm");
    }
    
}

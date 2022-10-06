/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.abstractx;

/**
 *
 * @author LABORATORIO_2
 */
public class Loro extends Animal{

    @Override
    public void emitirSonido() {
        System.out.println("Estoy durmiendo no molestar");
    }    
    //Polimorfismo
    @Override
    public void dormir(){
        System.out.println("Durmiendo....Zzzz....");
    }
    
}

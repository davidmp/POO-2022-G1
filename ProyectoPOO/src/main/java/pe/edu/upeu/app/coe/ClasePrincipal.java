/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.coe;

/**
 *
 * @author LABORATORIO_2
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Persona p;//Variable de tipo Persona
        p=new Persona();//Un Objeto de Persona
        p.setEdad(25); //usando atributo edad
        p.edad=20;
        p.setNombre("Dario");//usando el atributo nombre
        
        System.out.println("Nombre: "+p.getNombre() +"  edad:" +p.getEdad());
        
    }
}

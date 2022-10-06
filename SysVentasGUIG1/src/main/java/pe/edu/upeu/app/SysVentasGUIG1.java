/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package pe.edu.upeu.app;

import javax.swing.JOptionPane;
import pe.edu.upeu.app.gui.Login;
import pe.edu.upeu.app.util.MsgBox;

/**
 *
 * @author LABORATORIO_2--------------
 */
public class SysVentasGUIG1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //new MsgBox("Mensaje de alerta", JOptionPane.WARNING_MESSAGE, "secrecy-icon.png");
        new Login().setVisible(true);
    }
}

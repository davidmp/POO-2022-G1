/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.component;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import pe.edu.upeu.app.util.UtilsX;

/**
 *
 * @author LABORATORIO_2
 */
public class FondoPanel extends JPanel{
    
    public Image imageX;
    UtilsX obj=new UtilsX();
    
    @Override
    public void paint(Graphics g){
        imageX=new ImageIcon(obj.getFile("secrecy-icon.png")).getImage();
        
        setOpaque(false);
        g.setColor(getBackground());
        //g.fillRoundRect(0, 0, getWidth(), getHeight(), 25, 25);       
        g.drawImage(imageX, 0, 0,getWidth(),getHeight(),this);
         
        super.paint(g);
    }
    
}

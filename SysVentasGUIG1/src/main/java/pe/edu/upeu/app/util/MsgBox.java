/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.util;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Clase Principal para manejo de alertas
 *
 * @see <br>
 * El constructor resive 3 parametros (mensaje, tipo_de_alerta,
 * icono_personalizado)
 * <h1>El parámetro tipoDialog tiene las siguientes opciones: JOptionPane</h1>
 * <ol><li>WARNING_MESSAGE</li><li>ERROR_MESSAGE</li><li>PLAIN_MESSAGE</li><li>INFORMATION_MESSAGE</li>
 * <li>QUESTION_MESSAGE</li></ol>
 *
 * @see <a href = "https://github.com/davidmp" />Aqui Github</a>
 * @return No hay retorno de metodos
 */
public class MsgBox {

    UtilsX obj = new UtilsX();
    JPanel p;
    ImageIcon icon = null;

    public MsgBox() {
    }

    public MsgBox(String msg, int tipoDialog, String iconPropio) {
        if (!iconPropio.trim().equals("")) {
            icon = new ImageIcon(obj.getFile(iconPropio));
            JOptionPane.showMessageDialog(p, msg, "Holas", tipoDialog, icon);
        } else {
            JOptionPane.showMessageDialog(p, msg, "Holas", tipoDialog);
        }

    }

    public int showConfirmCustom(String msg, String title, String iconPropio) {
        int input;
        // 0=ok, 2=cancel
        if (!iconPropio.trim().equals("")) {
            icon = new ImageIcon(obj.getFile(iconPropio));
            input = JOptionPane.showConfirmDialog(p, msg, title, JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            input = JOptionPane.showConfirmDialog(p, msg, title, JOptionPane.OK_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return input;
    }

}

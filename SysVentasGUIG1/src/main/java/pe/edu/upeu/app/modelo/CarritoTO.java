/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.modelo;

import lombok.Data;

@Data
public class CarritoTO {
    public int idCarrito, idProducto,estado;
    public String dniruc, nombreProducto;
    public double cantidad, punitario, ptotal;
}
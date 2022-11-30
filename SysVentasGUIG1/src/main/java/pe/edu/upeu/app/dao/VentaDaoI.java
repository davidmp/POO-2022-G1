/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.util.List;
import pe.edu.upeu.app.modelo.VentaDetalleTO;
import pe.edu.upeu.app.modelo.VentaTO;

/**
 *
 * @author DTI-Laboratorio
 */
public interface VentaDaoI {
    
    public int createVenta(VentaTO to);
    
    public List listarVentas();
    
    
    public int createVentaDetalle(VentaDetalleTO vdTo);
    
    public List listarVentaDetalle();
}

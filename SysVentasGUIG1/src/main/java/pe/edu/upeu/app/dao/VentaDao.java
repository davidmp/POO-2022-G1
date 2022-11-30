/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import pe.edu.upeu.app.dao.conx.ConnS;
import pe.edu.upeu.app.modelo.VentaDetalleTO;
import pe.edu.upeu.app.modelo.VentaTO;

/**
 *
 * @author DTI-Laboratorio
 */
public class VentaDao implements VentaDaoI{
    ConnS instance=ConnS.getInstance();
    Connection coneccionx=instance.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public int createVenta(VentaTO to) {
        String[] returns = {"id_venta"};
        int idx=0;
        int i=0;
        String sql="insert into venta(preciobase, igv, preciototal, dniruc) values(?,?,?,?)";
        try {
            ps=coneccionx.prepareStatement(sql);
            ps.setDouble(++i, to.getPreciobase());
            ps.setDouble(++i, to.getIgv());
            ps.setDouble(++i, to.getPreciototal());
            ps.setString(++i, to.getDniruc());
           idx= ps.executeUpdate();
            try ( ResultSet rs = ps.getGeneratedKeys()) {
                if (rs.next()) {
                    idx = rs.getInt(1);
                }
                rs.close();
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return idx;        
        
    }



    @Override
    public int createVentaDetalle(VentaDetalleTO to) {
        int idx=0;
        int i=0;
        String sql="insert into venta_detalle(pu, cantidad, descuento, subtotal, id_venta, id_producto) values(?,?,?,?,?,?)";
        try {
            ps=coneccionx.prepareStatement(sql);
            ps.setDouble(++i, to.getPu());
            ps.setDouble(++i, to.getCantidad());
            ps.setDouble(++i, to.getDescuento());
            ps.setDouble(++i, to.getSubtotal());
            ps.setInt(++i, to.getIdVenta());
            ps.setInt(++i, to.getIdProducto());
           idx= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return idx;        
                
    }

    @Override
    public List listarVentas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List listarVentaDetalle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.edu.upeu.app.dao.conx.ConnS;
import pe.edu.upeu.app.modelo.CarritoTO;

/**
 *
 * @author DTI-Laboratorio
 */
public class CarritoDao implements CarritoDaoI{
    ConnS instance=ConnS.getInstance();
    Connection coneccionx=instance.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List<CarritoTO> lista(String dniruc) {
        List<CarritoTO> listaCarrito=new ArrayList();
        String sql="select * from carrito where dniruc=?";
        try {
            ps=coneccionx.prepareStatement(sql);
            ps.setString(1, dniruc);
            rs=ps.executeQuery();
            while (rs.next()) {
                CarritoTO to=new CarritoTO();
                to.setIdCarrito(rs.getInt("id_carrito"));
                to.setDniruc(rs.getString("dniruc"));
                to.setIdProducto(rs.getInt("id_producto"));
                to.setNombreProducto(rs.getString("nombre_producto"));
                to.setCantidad(rs.getDouble("cantidad"));
                to.setPunitario(rs.getDouble("punitario"));
                to.setPtotal(rs.getDouble("ptotal"));
                to.setEstado(rs.getInt("estado"));
                listaCarrito.add(to);
            }            
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }
        return listaCarrito;
    }

    @Override
    public int crear(CarritoTO to) {
        int idx=0;
        int i=0;
        String sql="insert into carrito(dniruc, id_producto, nombre_producto, "
                + "cantidad, punitario,ptotal,estado) values(?,?,?,?,?,?,?)";
        try {
            ps=coneccionx.prepareStatement(sql);
            ps.setString(++i, to.getDniruc());
            ps.setInt(++i, to.getIdProducto());
            ps.setString(++i, to.getNombreProducto());
            ps.setDouble(++i, to.getCantidad());
            ps.setDouble(++i, to.getPunitario());
            ps.setDouble(++i, to.getPtotal());
            ps.setInt(++i, to.getEstado());
           idx= ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return idx;
    }

    @Override
    public int delete(int id) {
        int idx=0;
        int i=0;
        String sql="delete from carrito where id_carrito=?";
        try {
             ps=coneccionx.prepareStatement(sql);
             ps.setInt(++i, id);
             idx=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error :"+e.getMessage());
        }        
        return idx;
    }

    @Override
    public int deleteCarAll(String dni) {
        int idx=0;
        int i=0;
        String sql="delete from carrito where dniruc=?";
        try {
             ps=coneccionx.prepareStatement(sql);
             ps.setString(++i, dni);
             idx=ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error :"+e.getMessage());
        }        
        return idx;        
    }
    
}
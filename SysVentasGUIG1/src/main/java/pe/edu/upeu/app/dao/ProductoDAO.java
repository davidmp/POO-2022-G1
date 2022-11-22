package pe.edu.upeu.app.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import pe.com.syscenterlife.autocomp.ModeloDataAutocomplet;
import pe.edu.upeu.app.dao.conx.ConnS;
import pe.edu.upeu.app.modelo.ProductoTO;
import pe.edu.upeu.app.util.ErrorLogger;

/**
 *
 * @author Lab Software
 */
public class ProductoDAO implements ProductoDaoI{
    Statement stmt = null;
    Vector columnNames;
    Vector visitdata;
    Connection connection;
    static PreparedStatement ps;
    static ErrorLogger log = new ErrorLogger(ProductoDAO.class.getName());
    ResultSet rs = null;

    public ProductoDAO() {
         connection = ConnS.getInstance().getConnection();
    }
    
    
    
    @Override
    public int create(ProductoTO d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(ProductoTO d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ProductoTO> listCmb(String filter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ProductoTO> listarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ProductoTO buscarProducto(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void reportarProducto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModeloDataAutocomplet> listAutoComplet(String filter) {
        List<ModeloDataAutocomplet> listarProducto = new ArrayList();
        String sql = "select * from producto where nombre like ?";
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, filter + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                ModeloDataAutocomplet data = new ModeloDataAutocomplet();
                ModeloDataAutocomplet.TIPE_DISPLAY = "ID";
                data.setIdx(rs.getString("nombre"));
                data.setNombreDysplay(rs.getString("id_producto"));
                data.setOtherData(rs.getDouble("pu")+":"+rs.getDouble("stock"));
                listarProducto.add(data);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return listarProducto;        
    }
    
}
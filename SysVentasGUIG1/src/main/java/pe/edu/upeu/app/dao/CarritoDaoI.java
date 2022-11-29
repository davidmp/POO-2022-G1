/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.util.List;
import pe.edu.upeu.app.modelo.CarritoTO;

/**
 *
 * @author DTI-Laboratorio
 */
public interface CarritoDaoI {
    public List<CarritoTO> lista(String dniruc);
    public int crear(CarritoTO to);
    public int delete(int id);
    public int deleteCarAll(String dni);
}
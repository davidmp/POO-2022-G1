/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.app.dao;

import java.util.List;
import pe.edu.upeu.app.modelo.ClienteTO;

/**
 *
 * @author LABORATORIO_2
 */
public interface ClienteDaoI {

    public int create(ClienteTO d);

    public int update(ClienteTO d);

    public int delete(String id) throws Exception;

    public List<ClienteTO> listCmb(String filter);

    public List listarClientes();

    public ClienteTO buscarClientes(String dni);

    public void reportarCliente();

}

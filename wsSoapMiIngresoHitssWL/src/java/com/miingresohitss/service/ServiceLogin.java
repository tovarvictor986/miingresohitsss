/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miingresohitss.service;

import com.miingresohitss.DAO.UsuarioDAO;
import com.miingresohitss.Model.UsuarioModel;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ServiceLogin")
public class ServiceLogin {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    @WebMethod(operationName = "logueo")
    public UsuarioModel logueo(@WebParam(name = "usuario") String usuario,@WebParam(name = "password") String password) {
        UsuarioModel usr;
        UsuarioDAO usrDAO = new UsuarioDAO();
        usr = usrDAO.validarLoguin(usuario, password);
        return usr;//"Hello " + usuario + " !";
    }
}

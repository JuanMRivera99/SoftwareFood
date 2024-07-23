/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.rivera.domain.model;

/**
 *
 * @author Rivera
 */
public class Restaurante {
    private int res_nit;
    private int clid_id;
    private String res_nombre;
    private String res_direccion;
    private String res_foto;

    public Restaurante() {
    }

    public int getRes_nit() {
        return res_nit;
    }

    public void setRes_nit(int res_nit) {
        this.res_nit = res_nit;
    }

    public int getClid_id() {
        return clid_id;
    }

    public void setClid_id(int clid_id) {
        this.clid_id = clid_id;
    }

    public String getRes_nombre() {
        return res_nombre;
    }

    public void setRes_nombre(String res_nombre) {
        this.res_nombre = res_nombre;
    }

    public String getRes_direccion() {
        return res_direccion;
    }

    public void setRes_direccion(String res_direccion) {
        this.res_direccion = res_direccion;
    }

    public String getRes_foto() {
        return res_foto;
    }

    public void setRes_foto(String res_foto) {
        this.res_foto = res_foto;
    }
    
    
    
}

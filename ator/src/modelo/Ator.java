/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class Ator {
    private String nomeartistico;
    private String nomereal;

    public String getNomeartistico() {
        return nomeartistico;
    }

    @Override
    public String toString() {
        return "Autor{" + "nomeartistico=" + nomeartistico + ", nomereal=" + nomereal + '}';
    }

    public void setNomeartistico(String nomeartistico) {
        this.nomeartistico = nomeartistico;
    }

    public String getNomereal() {
        return nomereal;
    }

    public void setNomereal(String nomereal) {
        this.nomereal = nomereal;
    }
    
    
}

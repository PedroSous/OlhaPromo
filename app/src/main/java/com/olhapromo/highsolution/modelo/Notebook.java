package com.olhapromo.highsolution.modelo;

/**
 * Created by Pedro on 11/02/2015.
 */
public class Notebook  extends Produtos {

    private String hd;

    public Notebook(int id, String marca, String processador, String memoria, String valor, String hd) {
        super(id, marca, processador, memoria, valor);
        this.hd = hd;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;

    }

   /* @Override
    protected void atualiza(int id, String nome, String marca, String processador, String memoria, String valor, String hd) {

    }*/
}


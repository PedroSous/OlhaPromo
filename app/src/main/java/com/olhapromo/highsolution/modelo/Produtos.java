package com.olhapromo.highsolution.modelo;

/**
 * Created by Pedro on 11/02/2015.
 */
public abstract class Produtos {
    private int id;
    private String nome;
    private String marca;
    private String processador;
    private String memoria;
    private String valor;




    public Produtos(int id, String nome, String marca, String processador,
                    String memoria, String valor) {
        super();
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;

        this.valor = valor;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }


  //  protected abstract void atualiza(int id, String nome, String marca, String processador, String memoria, String valor, String hd);
}

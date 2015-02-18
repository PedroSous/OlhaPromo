package com.olhapromo.highsolution.modelo;

/**
 * Created by Pedro on 11/02/2015.
 */
public abstract class Produtos {
    private int id;

    private String marca;
    private String processador;
    private String memoria;
    private String valor;




    public Produtos(int id, String marca, String processador,
                    String memoria, String valor) {
        super();
        this.id = id;

        this.marca = marca;
        this.processador = processador;
        this.memoria = memoria;

        this.valor = valor;
    }

    /**
     *
     * @return retorna o id do produto
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id altera o id do produto, passando o novo id como parâmetro
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return retorna a marca do produto
     */
    public String getMarca() {
        return marca;
    }

    /**
     *
     * @param marca alera a marca do produto, passando a nova marca como parâmetro
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return retorna a capacidade do processador do produto
     */
    public String getProcessador() {

        return processador;
    }

    /**
     *
     * @param processador, altera a capacidade do processador do produto, passando a nova capacidade como parâmetro
     */
    public void setProcessador(String processador) {

        this.processador = processador;
    }

    /**
     *
     * @return retorna a memória ram do produto
     */
    public String getMemoria() {
        return memoria;
    }

    /**
     *
     * @param memoria altera a memória ram do produto, passando a nova memória como parâmetro
     */
    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    /**
     *
     * @return retorna o valor em R$ do produto
     */
    public String getValor() {
        return valor;
    }

    /**
     *
     * @param valor altera o valor em R$ do produto, passando o nov valor como parâmetro
     */
    public void setValor(String valor) {
        this.valor = valor;
    }


  //  protected abstract void atualiza(int id, String nome, String marca, String processador, String memoria, String valor, String hd);
}

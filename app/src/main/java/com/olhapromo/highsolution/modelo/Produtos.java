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

    /**
     *
     * @return retorna o id do produto
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id altera o id do produto, passando o id como parâmetro
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return retorna o nome do produto
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome altera o nome o produto, passando o nome como parâmetro
     */
    public void setNome(String nome) {
        this.nome = nome;
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
     * @param marca altera a marca do produto, passando a marca como produto
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     *
     * @return retorna o processador do produto
     */
    public String getProcessador() {
        return processador;
    }

    /**
     *
     * @param processador altera o processador do produto, passando o processador como parâmetro
     */
    public void setProcessador(String processador) {
        this.processador = processador;
    }

    /**
     *
     * @return retorna a memoria ram do produto
     */
    public String getMemoria() {
        return memoria;
    }

    /**
     *
     * @param memoria altera a memoria do produto, passando a memoria como parâmetro
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
     * @param valor altera o valor em R$ do produto
     */
    public void setValor(String valor) {
        this.valor = valor;
    }


  //  protected abstract void atualiza(int id, String nome, String marca, String processador, String memoria, String valor, String hd);
}

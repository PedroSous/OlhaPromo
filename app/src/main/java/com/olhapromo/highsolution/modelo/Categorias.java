package com.olhapromo.highsolution.modelo;

import com.olhapromo.highsolution.olhapromo.R;

/**
 * Created by Pedro on 04/02/2015.
 */

//Classe de categorias
public class Categorias {
    public static final int Notebook =0;
    public static final int Tablet = 1;
    public static final int Smartphone =2;
    public String nome;
    private final int tipo;

    public Categorias(String nome, int tipo){
        this.nome=nome;
        this.tipo=tipo;
    }

    /**
     *
     * @return retorna a imagem da categoria de acordo com o item selecionado
     */
    public int getImagem(){
        switch (tipo){
            case Notebook:
                return R.drawable.hardware_computer;
            case Tablet:
                return R.drawable.hardware_tablet;
            case Smartphone:
                return R.drawable.hardware_phone;
        }
        return R.drawable.ic_launcher;//colocar outra opção  de imagem

    }


}

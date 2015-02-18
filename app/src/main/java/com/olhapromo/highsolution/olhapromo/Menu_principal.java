package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Classe menu_principal, onde terá as opções de Buscar promoções, Alerta de promoção e Compartilhar promoção.
 */
public class Menu_principal extends Activity {

    protected void onCreate(Bundle icicle){
        super.onCreate(icicle);
        setContentView(R.layout.menu_principal);

        //botão de Buscar Promo
        Button botaobusca = (Button) findViewById(R.id.buscar);
        botaobusca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu_principal.this, ListaCategorias.class);
                startActivity(it);
            }
        });

        //botão de Alerta Promo
        Button botaoalerta =(Button) findViewById(R.id.alerta);
        botaoalerta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Menu_principal.this, AlertaPromo.class);
                startActivity(it);
            }
        });

        //botão de Compartilhar Promo
        Button botaocomparilhar =(Button) findViewById(R.id.compartilhar);
        botaocomparilhar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //verificar o evento correto para adicionar aqui
            }
        });
    }


}

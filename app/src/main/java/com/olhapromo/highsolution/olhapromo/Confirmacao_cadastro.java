package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Pedro on 12/02/2015.
 */
public class Confirmacao_cadastro extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmacao);

        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        alerta.setTitle("Cadastro");
        alerta.setMessage("Seu Produto foi Registrado, aguarde! Em breve receberá as melhores promoções");

        //bottão de confirmação

        alerta.setNeutralButton("OK",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent it = new Intent(Confirmacao_cadastro.this, Menu_principal.class);
                startActivity(it);
            }
        });
        alerta.show();
    }
}

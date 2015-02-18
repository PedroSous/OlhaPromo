package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.olhapromo.highsolution.modelo.Produtos;

/**
 * Created by Rafael on 9/02/2015.
 */
public class CompartilharPromo extends Activity implements View.OnClickListener, Runnable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_compartilhar);


    }

    @Override
    /**
     * @param v - recebe a view e realiza alguma ação após clique no elemento
     */
    public void onClick(View v) {

    }

    @Override
    public void run() {

    }

}

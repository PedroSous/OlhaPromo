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

import com.olhapromo.highsolution.Controlado.NotebookDAO;
import com.olhapromo.highsolution.modelo.Notebook;
import com.olhapromo.highsolution.modelo.Produtos;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

/**
 * Created by Pedro on 07/02/2015.
 */
public class Cadastros_Produto extends Activity implements View.OnClickListener, Runnable {

    private ProgressDialog dialog;
    Notebook note;

    //Variaveis
    private static String todasMarcas;
    private static String processa;
    private static String memori;
    private static String hds;
    private static String preco;

    //Marcas por categoria
    private String[]notebook = new String[]{"Marca","Dell","HP","Lenovo","Sony","Acer","Asus","Positivo","Samsung"};
    private String[]tablet = new String[]{"Dell","HP","Lenovo","Samsung", "Positivo"};
    private String[]smartphone = new String[]{"LG","Motorola","Lenovo", "Nokia","Samsung","Sony"};

    //Processadore
    private String[]processador = new String[]{"Processador","I3","I5","I7"};

    // Memoria
    private String[]memor = new String[]{"Memória","4GB","6GB","8GB","1TB"};

    //HD
    private String[]hd = new String[]{"HD", "320GB","500GB","750GB","1TB"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro_produtos);

        Button cadastrar = (Button) findViewById(R.id.cadastrar);
        cadastrar.setOnClickListener(this);

        // conectando com o spinner do spinner_item_marca
        final Spinner marcas = (Spinner)findViewById(R.id.todasMarcas);
        final Spinner process = (Spinner)findViewById(R.id.processa);
        final Spinner memoria = (Spinner)findViewById(R.id.memoria);
        final Spinner harddisc = (Spinner)findViewById(R.id.hd);
        // deve receber a categoria da pagina anterior

        ArrayAdapter adaptador = new ArrayAdapter<String>(this,R.layout.spinner_item_marca, notebook);
        ArrayAdapter adaptador_processador = new ArrayAdapter<String>(this,R.layout.spinner_item_marca, processador);
        ArrayAdapter adaptador_memoria = new ArrayAdapter<String>(this,R.layout.spinner_item_marca, memor);
        ArrayAdapter adaptador_hd = new ArrayAdapter<String>(this,R.layout.spinner_item_marca, hd);

        //ArrayAdapter adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, tablet);
        //ArrayAdapter adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, smartphone);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        marcas.setAdapter(adaptador);
        process.setAdapter(adaptador_processador);
        memoria.setAdapter(adaptador_memoria);
        harddisc.setAdapter(adaptador_hd);

        //Selecionar alguma marca

        marcas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                todasMarcas = (String)marcas.getSelectedItem();
            }

            public void onNothingSelected(AdapterView parent){

            }
        });

        process.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                processa = (String)process.getSelectedItem();
            }

            public void onNothingSelected(AdapterView parent){

            }
        });

        memoria.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                memori = (String)memoria.getSelectedItem();
            }

            public void onNothingSelected(AdapterView parent){

            }
        });
        harddisc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                hds = (String)harddisc.getSelectedItem();
            }

            public void onNothingSelected(AdapterView parent){

            }
        });

        EditText valor = (EditText) findViewById(R.id.valor);
        // alterar para float----
        preco = valor.getText().toString();

    }


    @Override
    public void onClick(View v) {

       note = new Notebook(0, "Xing ling",todasMarcas, processa,memori, hds, preco);
        AtualizaThread t = new AtualizaThread();
        t.novaThread(note);
        Intent it = new Intent(Cadastros_Produto.this, Confirmacao_cadastro.class);
        startActivity(it);

    }

    @Override
    public void run() {

    }
}

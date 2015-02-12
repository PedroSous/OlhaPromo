package com.olhapromo.highsolution.olhapromo;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.olhapromo.highsolution.Adaptador.ListaCategoriaAdapter;
import com.olhapromo.highsolution.modelo.Categorias;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pedro on 05/02/2015.
 */
public class ListaCategorias extends Activity implements AdapterView.OnItemClickListener {
//Criando a lsita de categorias

    protected static final String CATEGORIA ="ca";
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categoria);
        Intent it =getIntent();

        FrameLayout cate = (FrameLayout) findViewById(R.id.categoria);
        if(it.getBooleanExtra("opcao",equals(true)))  {

            cate.setBackgroundColor(Color.parseColor("#ffb300"));
        }else {
            cate.setBackgroundColor(Color.parseColor("#0ac60a"));
        }

        //Array com a lista de itens
        ArrayList<Categorias> lista = new ArrayList<Categorias>();
        lista.add(new Categorias("Notebook",Categorias.Notebook));
        lista.add(new Categorias("Tablet",Categorias.Tablet));
        lista.add(new Categorias("Smartphone",Categorias.Smartphone));

        //adaptador customizado
        ListaCategoriaAdapter adapter = new ListaCategoriaAdapter(this, lista);

        //ListView
        listView = (ListView) findViewById(R.id.listar);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i(CATEGORIA,"Exemplo " + position + ", id: : " + id );
        //recupera o item na posição
        Categorias categoria =(Categorias)listView.getAdapter().getItem(position);
        //ir para a tela de produro
        Intent next = new Intent(this ,Cadastros_Produto.class);
        startActivity(next);

        //Exibe um alerta
       // Toast.makeText(this, "Categoria selecionada: " +categoria.nome, Toast.LENGTH_SHORT).show();


    }


}
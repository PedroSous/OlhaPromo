package com.olhapromo.highsolution.olhapromo;

import android.app.AlertDialog;
import android.util.Log;
import android.widget.Button;

import com.olhapromo.highsolution.Controlado.NotebookDAO;
import com.olhapromo.highsolution.modelo.Notebook;


/**
 * Created by Pedro on 11/02/2015.
 */
public class AtualizaThread extends Cadastros_Produto {


    public void novaThread(final Notebook note){
        //cria aum thread
        new Thread() {
            @Override
            public void run() {
                NotebookDAO dao =new NotebookDAO();
                //faz o processo em background
                boolean  resultado = dao.inserirNotebook(note);

                Log.d("Teste server", resultado +" ");


            }
        }.start();

    }

    }





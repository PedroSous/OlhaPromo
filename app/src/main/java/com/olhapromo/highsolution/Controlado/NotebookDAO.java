package com.olhapromo.highsolution.Controlado;

import com.olhapromo.highsolution.modelo.Notebook;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;

import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Pedro on 11/02/2015.
 */
public class NotebookDAO {

    private static final String URL ="http://192.168.25.112:8080/ServerOlhaPromo/services/NotebookDAO?wsdl";
    private static final String NAMESPACE= "http://server.olhapromo.com.br";
    private static final String SOAP_ACTION ="http://server.olhapromo.com.br/inserirNotebook";


    // operation
    private static final String INSERIR = "inserirNotebook";
    private static final String EXCLUIR = "excluirNotebook";
    private static final String ATUALIZAR = "atualizarNotebook";
    private static final String BUSCAR_TODOS = "buscarTodosNotebook";
    private static final String BUSCAR_POR_ID = "buscarNotebookPorID";


    //Inserir ------------------------
    public boolean inserirNotebook(Notebook notebook) {

            SoapObject request = new SoapObject(NAMESPACE, INSERIR);

            // estrutura para inserir notebook  no webserver ----
            SoapObject note = new SoapObject(NAMESPACE, "notebook");
            note.addProperty("id", notebook.getId());

            note.addProperty("marca", notebook.getMarca());
            note.addProperty("procesador", notebook.getProcessador());
            note.addProperty("memoria", notebook.getMemoria());
            note.addProperty("valor", notebook.getValor());
            note.addProperty("hd", notebook.getHd());

            // acescentando propriedades basicas da estrutura
            request.addSoapObject(note);
            //craindo evelope para enviar estrutura para o webserver
            SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
            envelope.setOutputSoapObject(request);
            //habilitar o envio do envelope
            envelope.implicitTypes = true;
            // enviar atraves da url o envelope
            HttpTransportSE http = new HttpTransportSE(URL);

            //passar a ação para o http
            try {
                http.call(SOAP_ACTION, envelope);

                // vericar se deu certo a conexão com webserver
                SoapPrimitive resposta = (SoapPrimitive) envelope.getResponse();

                return Boolean.parseBoolean(resposta.toString());

            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
    }



    //Atualizar dados ----------
    public boolean atualizarNotebook(Notebook notebook){

        return true;
    }

    // Excluir -------------
    public boolean excluirNotebook(Notebook notebook){


        return true;
    }

    //Listar todos os produtos ---------------
    public ArrayList<Notebook> buscarTodosNotebook(){

        ArrayList<Notebook> lista = new ArrayList<Notebook>();



        return lista;
    }


    //Buscar por ID ----------------------------------
    public Notebook buscarNotebookPorID(int ID){

        return null;
    }

    //Excluir por ID -----------
    public boolean excluirNotebook(int id){

        return excluirNotebook(new Notebook(id, "", "", "", "", ""));
    }


}

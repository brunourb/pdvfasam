package br.edu.fasam.mobile.pdvfasam.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import br.edu.fasam.mobile.pdvfasam.R;
import br.edu.fasam.mobile.pdvfasam.config.DebugActivity;

public class ProdutoActivity extends DebugActivity {

    protected EditText txtNome;
    protected EditText txtDescricao;
    protected EditText txtNcm;
    protected EditText txtCodBarra;
    protected ImageView imgViewFoto;
    protected EditText txtQtd;
    protected EditText txtValorUnitario;
    protected ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
    }

    public void addProduct(View view) {

        //CAPTURAR DADOS DA TELA

        //Processar os dados


        //Entregar os dados para o usuario
    }
}

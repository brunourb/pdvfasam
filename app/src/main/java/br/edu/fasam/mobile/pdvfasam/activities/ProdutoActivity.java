package br.edu.fasam.mobile.pdvfasam.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
    protected List<HashMap<String,String>> listaHasMap = new ArrayList<HashMap<String,String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
    }

    public void addProduct(View view) {

        //CAPTURAR DADOS DA TELA
        txtNome = findViewById(R.id.txtNome);
        txtDescricao = findViewById(R.id.txtDescricao);
        txtNcm = findViewById(R.id.txtNcm);
        txtCodBarra = findViewById(R.id.txtCodBarra);
        imgViewFoto = findViewById(R.id.imgViewFoto);
        txtQtd = findViewById(R.id.txtQtd);
        txtValorUnitario = findViewById(R.id.txtValorUnitario);
        listView = findViewById(R.id.listView);

        String nome, descricao, ncm, codBarra;
        BigDecimal qtd = BigDecimal.ZERO;
        BigDecimal valorUnitario = BigDecimal.ZERO;
        //Processar os dados
        nome = txtNome.getText().toString();
        descricao = txtDescricao.getText().toString();
        ncm = txtNcm.getText().toString();
        codBarra = txtCodBarra.getText().toString();

        qtd = new BigDecimal(txtQtd.getText().toString());
        valorUnitario = new BigDecimal(txtValorUnitario.getText().toString());

        BigDecimal valorTotal = qtd.multiply(valorUnitario);

        imgViewFoto.setImageResource(R.drawable.meme_obama);

        HashMap<String,String> map = new HashMap<String,String>();
        map.put("nome",nome);
        map.put("descricao",descricao);
        map.put("ncm",ncm);
        map.put("codBarra",codBarra);
        map.put("qtd",qtd.toPlainString());
        map.put("valorUnitario",valorUnitario.toPlainString());

        listaHasMap.add(map);


        String[] from = {"nome","descricao"};
        int[] to = {R.id.txtViewNome,R.id.txtViewDescricao};

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,listaHasMap,
                R.layout.item_produto,from,to);

        listView.setAdapter(simpleAdapter);

        //Entregar os dados para o usuario
    }
}

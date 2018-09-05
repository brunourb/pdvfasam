package br.edu.fasam.mobile.pdvfasam.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.fasam.mobile.pdvfasam.R;
import br.edu.fasam.mobile.pdvfasam.config.DebugActivity;
import br.edu.fasam.mobile.pdvfasam.models.Usuario;

public class UsuarioActivity extends DebugActivity {

    protected EditText txtNome;
    protected EditText txtEmail;
    protected EditText txtEndereco;
    protected List<Usuario> listaUsuarios = new ArrayList<Usuario>();

    //Criando a colecao de dados (simple adapter)
    List<HashMap<String,String>> listaMapUsuarios = new ArrayList<HashMap<String,String>>();

    protected ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
    }

    public void addUser(View view) {

        txtNome = findViewById(R.id.txtNome);
        txtEmail = findViewById(R.id.txtEmail);
        txtEndereco = findViewById(R.id.txtEndereco);

        //Criando item para a lista
        HashMap<String,String> mapUsuario = new HashMap<String,String>();

        //Adicionado o usuario para a colecao dados;
        String nome, email, endereco;
        nome = txtNome.getText().toString();
        email = txtEmail.getText().toString();
        endereco = txtEndereco.getText().toString();

        //Criar o objeto usuario
        Usuario usuario = new Usuario(nome,email,endereco);
        listaUsuarios.add(usuario);

        //Adicionar o objeto usuario no hashmap<key,value>
        mapUsuario.put("nome",usuario.getNome());
        mapUsuario.put("email",usuario.getEmail());
        mapUsuario.put("endereco",usuario.getEndereco());

        //Adicionar mapUsuario aa listaMapusuarios
        listaMapUsuarios.add(mapUsuario);

        //Entregar a colecao para o simple adapter imprimir
        listView = findViewById(R.id.listView);

        String[] from = {"nome","email"};
        int[] to = {R.id.txtViewNome,R.id.txtViewEmail};


        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                listaMapUsuarios,
                R.layout.item_usuario,
                from,
                to);

        //Fazer o bind da listView com o adapter
        listView.setAdapter(simpleAdapter);

    }
}

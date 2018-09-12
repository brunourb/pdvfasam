package br.edu.fasam.mobile.pdvfasam.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import br.edu.fasam.mobile.pdvfasam.R;
import br.edu.fasam.mobile.pdvfasam.config.DebugActivity;
import br.edu.fasam.mobile.pdvfasam.models.Pedido;

public class HomeActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void exibir(View view) {

        Intent intent = null;

        switch (view.getId()){
            case R.id.btnUser:
                //call user view

                intent = new Intent(this,
                        UsuarioActivity.class);

                Bundle bundle = new Bundle();
                bundle.putString("teste","Passagem de parametro");

                intent.putExtras(bundle);

                startActivity(intent);

                break;

            case R.id.btnProduct:
                //call product view
                intent = new Intent(this,ProdutoActivity.class);
                startActivity(intent);

                break;

            case R.id.btnOrder:
                //call order view
                intent = new Intent(this, PedidoActivity.class);
                startActivity(intent);

                break;

                default:
                    Toast.makeText(this,
                            "Opção inválida",
                            Toast.LENGTH_LONG).show();

                    break;
        }

    }
}

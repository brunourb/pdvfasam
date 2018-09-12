package br.edu.fasam.mobile.pdvfasam.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.edu.fasam.mobile.pdvfasam.R;
import br.edu.fasam.mobile.pdvfasam.config.DebugActivity;

public class ProdutoActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);
    }

    public void addProduct(View view) {
        //
    }
}

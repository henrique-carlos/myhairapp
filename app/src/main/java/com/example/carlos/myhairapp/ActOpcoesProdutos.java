package com.example.carlos.myhairapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class ActOpcoesProdutos extends AppCompatActivity implements View.OnClickListener {

    private Button btnOpcaoGel;
    private Button btnOpcaoMousse;
    private Button btnOpcaoPomada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_opcoes_produtos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //referência aos objetos da tela
        btnOpcaoGel = (Button)findViewById(R.id.btnOpcaoGel);
        btnOpcaoMousse = (Button)findViewById(R.id.btnOpcaoMousse);
        btnOpcaoPomada = (Button)findViewById(R.id.btnOpcaoPomada);

        //chama os eventos de click dos botões
        btnOpcaoGel.setOnClickListener(this);
        btnOpcaoMousse.setOnClickListener(this);
        btnOpcaoPomada.setOnClickListener(this);
    }

    //chama a tela ActTelaProduto
    @Override
    public void onClick(View v) {
        Bundle params = new Bundle();

        if( v == btnOpcaoGel )
        {
            params.putString("opcao","Gel");
        }
        else if( v == btnOpcaoMousse )
        {
            params.putString("opcao","Mousse");
        }
        else if( v == btnOpcaoPomada )
        {
            params.putString("opcao","Pomada");
        }

        Intent it = new Intent(this,ActTelaProduto.class);
        it.putExtras(params);
        startActivity(it);
    }
}

package com.example.carlos.myhairapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActTelaProduto extends /*FragmentActivity*/AppCompatActivity implements View.OnClickListener{

    private TextView txtNomeProduto;
    private TextView txtSobre;
    private ImageView imgModel;

    //swipe
    private Button btnSwipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tela_produto);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        txtNomeProduto = (TextView)findViewById(R.id.txtNomeProduto);
        txtSobre = (TextView)findViewById(R.id.txtSobre);
        imgModel = (ImageView)findViewById(R.id.imgModel);
        Intent intent = getIntent();

        if( intent != null)
        {
            Bundle params = intent.getExtras();
            String nome = params.getString("opcao");

            txtNomeProduto.setText(nome);
            String string = new String();

            if(nome.equals("Gel")) {
                string = getString(R.string.sobreGel);
                imgModel.setImageResource(R.drawable.imggel);
            }
            else if( nome.equals("Mousse") )
            {
                string = getString(R.string.sobreMousse);
                imgModel.setImageResource(R.drawable.imgmousse);
            }
            else if( nome.equals("Pomada"))
            {
                string = getString(R.string.sobrePomada);
                imgModel.setImageResource(R.drawable.imgpomada);
            }
            txtSobre.setText(string);
        }
        /*
        btnSwipe = (Button)findViewById(R.id.btnSwipe);
        btnSwipe.setOnClickListener(this);
        */
    }

    @Override
    public void onClick(View v) {
        /*
        if( v == btnSwipe ){
            Intent it = new Intent(this,swipe_layout.class);
            startActivity(it);
        }*/
    }
}

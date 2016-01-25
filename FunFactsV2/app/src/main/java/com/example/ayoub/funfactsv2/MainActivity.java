package com.example.ayoub.funfactsv2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
//La page d'acceuil(le menu)

public class MainActivity extends AppCompatActivity
{
    View.OnClickListener clickcommencer=new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
         Intent i=new Intent(MainActivity.this,Pageprincipalle.class);
            startActivity(i);

        }
    };
    Button commencer,propos,parametre;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        commencer=(Button)findViewById(R.id.commencer);
        propos=(Button)findViewById(R.id.propos);
        parametre=(Button)findViewById(R.id.parametre);

        //Démarer l'activity pageprincipale
        commencer.setOnClickListener(clickcommencer);


    }


}

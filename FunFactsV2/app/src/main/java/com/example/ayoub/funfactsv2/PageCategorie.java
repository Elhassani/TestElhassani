package com.example.ayoub.funfactsv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PageCategorie extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.typecategorie);
        Intent intent=this.getIntent();
        int id=intent.getExtras().getInt("identifiant");
        Toast.makeText(this,"la valeur envoyer est : "+intent.getExtras().getInt("identifiant"),Toast.LENGTH_LONG).show();
        ListView listView=(ListView)findViewById(R.id.listetype);
        AdapterType adapterType=new AdapterType(this,id);
        listView.setAdapter(adapterType);
    }


}

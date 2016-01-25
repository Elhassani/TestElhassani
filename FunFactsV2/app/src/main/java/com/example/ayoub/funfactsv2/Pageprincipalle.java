package com.example.ayoub.funfactsv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

// La page principale
public class Pageprincipalle extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagecategorie);
        ListView listView=(ListView)findViewById(R.id.liste);
        CustomAdapter customAdapter=new CustomAdapter(this);
        listView.setAdapter(customAdapter);
    }


}

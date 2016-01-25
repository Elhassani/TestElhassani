package com.example.ayoub.funfactsv2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ayoub on 23/01/2016.
 */
public class CustomAdapter extends BaseAdapter
{
    ArrayList<Categorie> categories;
    Context context;
    //Le constructeur de notre Adapter personnaliser
    public CustomAdapter(Context context)
    {
        this.context=context;
        categories=new ArrayList<Categorie>();
        categories.add(new Categorie("Monde Animaux",R.drawable.animal,R.drawable.fleche));
        categories.add(new Categorie("Monde Informatique",R.drawable.informatique,R.drawable.fleche));
        categories.add(new Categorie("Monde Sport",R.drawable.sport,R.drawable.fleche));
        categories.add(new Categorie("Monde Couleur",R.drawable.couleur,R.drawable.fleche));
    }


    @Override
    public int getCount()
    {
        return categories.size();
    }

    @Override
    public Object getItem(int position)
    {
        return categories.get(position);
    }

    @Override
    public long getItemId(int position)

    {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.modelecategorie,parent,false);
        TextView textView=(TextView)view.findViewById(R.id.categorie);
        ImageView imageView1=(ImageView)view.findViewById(R.id.image1);
        ImageView imageView2=(ImageView)view.findViewById(R.id.image2);

        final Categorie categorie=categories.get(position);
        textView.setText(categorie.getType());
        imageView1.setImageResource(categorie.getImage1());
        imageView2.setImageResource(categorie.getImage2());
        imageView2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //Maintemenant je vais passer l'identifiant du position pour recuperer dans l'autre activity;
                Toast.makeText(context,"Vous avez choisi  "+categories.get(position).getType(),Toast.LENGTH_LONG).show();
                Intent i=new Intent(context,PageCategorie.class);
                i.putExtra("identifiant",position);
                context.startActivity(i);

            }
        });
        return view;
    }
}

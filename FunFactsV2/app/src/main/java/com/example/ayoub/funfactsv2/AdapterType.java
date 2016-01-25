package com.example.ayoub.funfactsv2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Ayoub on 24/01/2016.
 */
public class AdapterType extends BaseAdapter
{
    Context context;
    ArrayList<Type> arrayList;
    public AdapterType(Context context,int id)
    {
        this.context=context;
        arrayList=new ArrayList<Type>();
        if(id==0)
        {
            arrayList.add(new Type("Lion","Mamifère",R.drawable.lion));
            arrayList.add(new Type("Léopard","Mamifère",R.drawable.leopard));
            arrayList.add(new Type("Eléphant","Mamifère",R.drawable.elephant));
            arrayList.add(new Type("M3rfsh smito","Mamifère",R.drawable.ecu));
            arrayList.add(new Type("Panda","Mamifère",R.drawable.panda));
            arrayList.add(new Type("Lapin","Mamifère",R.drawable.lapin));
        }

        if(id==1)
        {
            arrayList.add(new Type("Processeur","",R.drawable.processeur));
            arrayList.add(new Type("Ram","",R.drawable.ram));
            arrayList.add(new Type("Unité","",R.drawable.unite));
            arrayList.add(new Type("Carte Graphique","",R.drawable.cartegraphique));
        }

        if(id==2)
        {
            //arrayList.add(new Type("Football","Mamifère",R.drawable.football));
            //arrayList.add(new Type("Handball","Mamifère",R.drawable.handball));
            //arrayList.add(new Type("Basketball","Mamifère",R.drawable.basketball));
            arrayList.add(new Type("Tennis","",R.drawable.tennis));
        }




    }
    @Override
    public int getCount()
    {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.modeletype,parent,false);
        TextView textView1=(TextView)view.findViewById(R.id.nom);
        TextView textView2=(TextView)view.findViewById(R.id.type);
        ImageView imageView=(ImageView)view.findViewById(R.id.imagetype);

        Type type=arrayList.get(position);

        textView1.setText(type.getNom());
        textView2.setText(type.getType());
        imageView.setImageResource(type.getImage());
        return view;
    }
}

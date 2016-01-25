package com.example.ayoub.funfactsv2;

/**
 * Created by Ayoub on 24/01/2016.
 */
public class Type
{
    String nom,type;
    int image;
    public Type(String nom, String type, int image)
    {
        this.nom=nom;
        this.type=type;
        this.image=image;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getImage()
    {
        return image;
    }

    public void setImage(int image)
    {
        this.image = image;
    }
}

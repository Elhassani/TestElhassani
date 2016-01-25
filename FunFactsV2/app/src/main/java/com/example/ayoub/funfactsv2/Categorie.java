package com.example.ayoub.funfactsv2;

/**
 * Created by Ayoub on 23/01/2016.
 */
public class Categorie
{
    String type;
    int image1,image2;

    public Categorie(String type,int image1,int image2)
    {
        this.type=type;
        this.image1=image1;
        this.image2=image2;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getImage1()
    {
        return image1;
    }

    public void setImage1(int image1)
    {
        this.image1 = image1;
    }

    public int getImage2()
    {
        return image2;
    }

    public void setImage2(int image2)
    {
        this.image2 = image2;
    }
}

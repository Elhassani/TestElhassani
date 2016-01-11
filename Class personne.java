
public class personne()
{
   private String nom;
   private String prenom;
   private int age;
   //Constructeur 

   public personne(String nom,String prenom,int age)
   {
   	this.nom=nom;
   	this.prenom=prenom;
   	this.age=age;
   }
   //fonction pour ajouter personne
   public void ajoutpersonne(String n,String p,int a)
   {
    Arraylist<personne> p=new Arraylist();
    p.add(n,p,a);
   }
}	
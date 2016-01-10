class main String(args [])
{
	personne p =new personne();
	p.Ajouter(5,6);
	p.Soustraire(6,4);
	System.out.println("Salut");
}
class personne
{
	public int Soustraire(int a,int b)
	{
		if(a>=b)
		{
			return a-b;
		}
		if(a<b)
		{
			return null;
		}

	}
	public int multiplication(int a,int b)
	{
		return a*b;
	}

}
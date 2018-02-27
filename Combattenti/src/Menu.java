
public class Menu {

	public static void scelta1(Eroe e1)
	{
		Goblin mostri[]=new Goblin[5];
		
		
		for(int i=0;i<5;i++)
		{
			mostri[i]=new Goblin(200*e1.getLivello(),50*e1.getLivello(),80*e1.getLivello(),50*i,i+1);
			
			Attacca.attaccaMostri(mostri[i],e1);
			
			
		}
		
		
		
		
	}
	public void scelta2()
	{
		
		
	}
	public static void scelta3 (Eroe E1)
	{
		
		System.out.println("Nome:\n"+E1.getNome());
		System.out.println("Vita:\n"+E1.getVita());
		System.out.println("Forza:\n"+E1.getForza());
		System.out.println("Difesa:\n"+E1.getDifesa());
		System.out.println("Esperienza:\n"+E1.getEsperienza());
		System.out.println("Livello:\n"+E1.getLivello());
		
	}
}

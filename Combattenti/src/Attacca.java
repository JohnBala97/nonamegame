
public class Attacca {
	static boolean victory=false;
	private static int esperienza;
	public static void attaccaMostri(Goblin m1,Eroe e)
	
	{
		do {
		System.out.println("Vita "+e.getNome()+": "+e.getVita());
		System.out.println("Vita mostro"+ m1.getVita());
		e.setVita(e.getVita()-m1.getForza());
		m1.setVita(m1.getVita()-e.getForza());
		if(e.getVita()<0 || m1.getVita()<0) break;
		
		
		}while(e.getVita()>0 || m1.getVita()>0);
		
		if (e.getVita()>0)victory=true;
		
		else if(m1.getVita()>0)victory=false;
		
		
		if(victory==true) {
			System.out.println("Vittoria!");
			System.out.println("Hai guadagnato: ");
			esperienza=m1.getEsperienza();
			e.setEsperienza(e.getEsperienza()+esperienza);
			System.out.println(esperienza+" punti esperienza");
			
			
		
			
		}
		else if(victory==false) {
			System.out.println("GameOver");
			
		}
	}
}

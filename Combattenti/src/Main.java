import it.unibs.fp.mylib.InputDati;
import it.unibs.fp.mylib.MyMenu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		int scelta;
		nome=InputDati.leggiStringaNonVuota("Inserire il nome del giocatore: ");
		Eroe E1 = new Eroe(nome,500,80,50,0,1);
		
		
		System.out.println(E1.getNome());
		
		do
		{
			scelta=InputDati.leggiIntero("Cosa vuoi fare?:\n1-Attacca un mostro\n2-Usa un oggetto\n3-Vedi info personaggio\n\n\n\n0-Esci");
			
		switch(scelta) {
		
		case 1: if(E1.getVita()>0) Menu.scelta1(E1);
			break;
		
		case 3:	Menu.scelta3(E1);
			break;
				
				
		}
			
			
		}while(scelta!= 0);
		System.out.println("Addio");

	}

}

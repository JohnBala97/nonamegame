
public class Goblin {
	
	
	private int vita;
	private int forza;
	private int difesa;
	private int esperienza;
	private int livello;
	
	public Goblin (int vita, int forza, int difesa, int esperienza,int livello) {
	

	this.setVita(vita);
	this.setForza(forza);
	this.setDifesa(difesa);
	this.setEsperienza(esperienza);
	this.setLivello(livello);
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}

	public int getForza() {
		return forza;
	}

	public void setForza(int forza) {
		this.forza = forza;
	}

	public int getDifesa() {
		return difesa;
	}

	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}

	public int getEsperienza() {
		return esperienza;
	}

	public void setEsperienza(int esperienza) {
		this.esperienza = esperienza;
	}

	public int getLivello() {
		return livello;
	}

	public void setLivello(int livello) {
		this.livello = livello;
	}

}

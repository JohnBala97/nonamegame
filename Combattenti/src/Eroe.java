
public class Eroe {
	private String nome;
	private int vita;
	private int forza;
	private int difesa;
	private int esperienza;
	private int livello;
	
	public Eroe(String nome,int vita, int forza, int difesa, int esperienza,int livello)
	{
		this.nome=nome;
		this.vita=vita;
		this.forza=forza;
		this.difesa=difesa;
		this.esperienza=esperienza;
		this.livello=livello;
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	public String getNome()
	{
		return this.nome;
	}

	public void setVita(int vita)
	{
		this.vita=vita;
	}
	public int getVita()
	{
		return vita;
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
	public void setLivello(int livello)
	{
		this.livello=livello;
	}
	public int getLivello()
	{
		return livello;
	}
}

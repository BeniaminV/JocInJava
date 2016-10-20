public class Zombi extends Creatura
{
	//caracteristicile zobiului
	public String nume;
	public int viata_zombi;
	
	private int gelatina=300;
	private int muscatura_dubla=250;
	private int muscatura=200;
				
	//variabilele private
	public int getMuscatura()
	{
		return this.muscatura;
	}
	public int getGelatina()
	{
		return this.gelatina;
	}
	public int getMuscaturaDubla()
	{
		return this.muscatura_dubla;
	}
		
	//viata zobiului
	public int Viata()
	{
		return viata_zombi=Creatura.corp+Creatura.mana_stanga+Creatura.mana_dreapta+Creatura.cap+Creatura.gura+Creatura.ochi_stang+Creatura.ochi_drept+Creatura.armura+getGelatina();
	}
		
	public int Musca()
	{
		return getMuscatura()+getMuscaturaDubla();
	}
}
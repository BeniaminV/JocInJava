public class Monstru extends Creatura
{
	//caracteristicile monstrului
	public String nume;
	public int viata_monstru;
	
	private int carapace=100;
	private int laser=350;
	private int pumnul=200;
		
	//variabilele private
	public int getCarapace()
	{
		return this.carapace;
	}
	public int getLaser()
	{
		return this.laser;
	}
	public int getPumnul()
	{
		return this.pumnul;
	}
		
	//viata monstrului 
	public int Viata()
	{
		return viata_monstru=Creatura.corp+Creatura.cap+Creatura.gura+Creatura.ochi+Creatura.mana_dreapta+Creatura.mana_stanga+Creatura.picior_drept+Creatura.picior_stang+Creatura.armura+getCarapace();
	}
		
	public int Atac()
	{
		return getPumnul()+getLaser();
	}
}
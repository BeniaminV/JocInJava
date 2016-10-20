public class Om extends Creatura
{
	//caracteristicile caracterului si caracteristicile particulare
	public String nume="";
	public int viata_om;
	public int atac1,atac2,atac3;
	
	private int sabie=30,sulita=60,topor=90;
	private int armura_umana=100;
	private int pumn=200;	
		
	//accesarea varabilelor private
	public int getPumn()
	{
		return this.pumn;
	}
	public int getArmura_Umana()
	{
		return this.armura_umana;
	}
	public int getSabie()
	{
		return this.sabie;
	}
	public int getSulita()
	{
		return this.sulita;
	}
	public int getTopor()
	{
		return this.topor;
	}
		
	//functia unde se aduna viata pe care o are omul 
	public int Viata()
	{
		return viata_om=Creatura.picior_drept+Creatura.picior_stang+Creatura.corp+Creatura.mana_dreapta+Creatura.mana_stanga+Creatura.cap+Creatura.ochi_drept+Creatura.ochi_stang+Creatura.gura+Creatura.armura+getArmura_Umana();
	}
		
	//functiile de atac combinate cu alte atacuri
	public int atac1()
	{
		return atac1=getPumn()+getSabie();
	}
	public int atac2()
	{
		return atac2=getPumn()+getSulita();
	}
	public int atac3()
	{
		return atac3=getPumn()+getTopor();
	}
}

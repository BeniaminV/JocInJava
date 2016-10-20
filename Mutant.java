public class Mutant extends Creatura
{
	//caracteristicile mutatului
	public String nume;
	public int viata_mutant;
	
	private int lava=200, radio_activ=400;
	private int atac_radio_activ=500;
	private int arunca_foc=200;
				
	//variabile private
	public int getAruncaFoc()
	{
		return this.arunca_foc;
	}
	public int getLava()
	{
		return this.lava;
	}
	public int getRadioActiv()
	{
		return this.radio_activ;
	}
	public int getAtacRadioActiv()
	{
		return this.atac_radio_activ;
	}
		
	//viata mutatului 
	public int Viata()
	{
		return viata_mutant=Creatura.corp+Creatura.picior_drept+Creatura.picior_stang+Creatura.mana_dreapta+Creatura.armura+getLava()+getRadioActiv();
	}
		
	public int Atac()
	{
		return getAruncaFoc()+getRadioActiv();
	}
}

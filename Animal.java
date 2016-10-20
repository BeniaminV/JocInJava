public class Animal extends Creatura
{
	//caracteristicile animalului
	public String nume;
	public int viata_animal;
	public int atac;
	
	private int blana=100;
	private int otrava=150;
	private int musca=200;
	
	//accesarea variabilelor private
	public int getMusca()
	{
		return this.musca;
	}
	public int getBlana()
	{
		return this.blana;
	}
	public int getOtrava()
	{
		return this.otrava;
	}
	
	//viata animalului 
	public int Viata()
	{
		return viata_animal=Creatura.picior_stang_fata+Creatura.picior_drept_fata+Creatura.picior_drept_spate+Creatura.picior_stang_spate+Creatura.corp+Creatura.cap+Creatura.gura+Creatura.ochi_drept+Creatura.ochi_stang+Creatura.armura+getBlana();
	}
		
	public int AtacCuOtravaSiMusca()
	{
		return atac=getMusca()+getOtrava();
	}
}
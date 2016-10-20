//pachete pentru a utiliza anumite functii din java
import java.util.Random;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//initializarea obiectelor
		Scanner input=new Scanner(System.in);
		Random rand = new Random(); 
		Om om=new Om();
		Animal animal=new Animal();
		Monstru monstru=new Monstru();
		Mutant mutant=new Mutant();
		Zombi zombi=new Zombi();
		ModDeLupta mod=new ModDeLupta();
		
		//locul unde de initializeaza variabilele de care ne folosim
		int optiune, numar_caracter, numar_arma;
		int random = rand.nextInt(5)+1;
		String arma_aleasa;
		String p;
		int vrei;
		do{
			
		//locul functiilor si a obiectelor care se vor folosi in joc
		mod.DisplayFirstPage();
		System.out.print("Introdu optiunea dorita si apasa 'Enter': ");
		optiune=input.nextInt();
		
		//locul unde se face delimitarea intre un meci jucator vs calculator si jucator vs jucator
		switch(optiune)
		{
			//cazul in care se joaca JUCATOR VS CALCULATOR
			case 1:
			{	
				mod.DisplayCaracter();
				System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
				numar_caracter=input.nextInt();
				switch(numar_caracter)
				{
					case 1:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
						System.out.print("-Da-mi si un nume:"); 
						om.nume=input.next();
						mod.DisplyWepon();
						System.out.print("-Introdu numarul armei:");
						numar_arma=input.nextInt();
						System.out.print("Scrie numele armei alese de tine: ");
						arma_aleasa=input.next();
						System.out.println("-------------------------------------------------------------");
								
						//locul unde se ca afisa ce ai introdus
						switch(numar_arma)
						{
							case 1:
							{
								//locul unde se afiseaza detalile caracterului tau si a caraterului ales de calculator
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterPentruOm(om.nume, arma_aleasa, om.Viata(), om.atac1());
								System.out.println("*************************************************************");
								System.out.println("Oponetul a fost selectat");
								System.out.println("*************************************************************");
									
								//alegerea oponetului de catre calculator
								if(random==5)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(zombi.nume="Zoto", zombi.Viata(), zombi.Musca());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac1(), zombi.Viata(), zombi.Musca(), om.nume, zombi.nume="Zoto");
								}	
								else if(random==4)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(mutant.nume="Righ", mutant.Viata(), mutant.getAruncaFoc());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac1(), mutant.Viata(), mutant.getAruncaFoc(), om.nume, mutant.nume="Righ");
								}
								else if(random==3)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(monstru.nume="Turbg", monstru.Viata(), monstru.getPumnul());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac1(), monstru.Viata(), monstru.getPumnul(), om.nume, monstru.nume="Turbg");
								}
								else if(random==2)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(animal.nume="Bingo", animal.Viata(), animal.AtacCuOtravaSiMusca());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac1(), animal.Viata(), animal.AtacCuOtravaSiMusca(), om.nume, animal.nume="Bingo");
								}
								else if(random==1)
								{
									mod.DisplayDetaliCaracterPentruOmDeCalculator(om.nume="Bula",arma_aleasa, om.Viata(), om.atac2());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac1(), om.Viata(), om.atac2(), om.nume, om.nume="Bula");
								}
							}break;
											
							case 2:
							{
								//locul unde se afiseaza detalile caracterului tau si a caraterului ales de calculator
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterPentruOm(om.nume, arma_aleasa, om.Viata(), om.atac2());
								System.out.println("*************************************************************");
								System.out.println("Oponetul a fost selectat");
								System.out.println("*************************************************************");
								
								//alegerea oponetului de catre calculator
								if(random==5)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(zombi.nume="Zoto", zombi.Viata(), zombi.Musca());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac2(), zombi.Viata(), zombi.Musca(), om.nume, zombi.nume="Zoto");
								}	
								else if(random==4)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(mutant.nume="Righ", mutant.Viata(), mutant.getAruncaFoc());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac2(), mutant.Viata(), mutant.getAruncaFoc(), om.nume, mutant.nume="Righ");
								}
								else if(random==3)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(monstru.nume="Turbg", monstru.Viata(), monstru.getPumnul());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac2(), monstru.Viata(), monstru.getPumnul(), om.nume, monstru.nume="Turbg");
								}
								else if(random==2)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(animal.nume="Bingo", animal.Viata(), animal.AtacCuOtravaSiMusca());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac2(), animal.Viata(), animal.AtacCuOtravaSiMusca(), om.nume, animal.nume="Bingo");
								}
								else if(random==1)
								{
									mod.DisplayDetaliCaracterPentruOmDeCalculator(om.nume="Bula",arma_aleasa, om.Viata(), om.atac2());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac2(), om.Viata(), om.atac2(), om.nume, om.nume="Bula");
								}
							}break;
											
							case 3:
							{
								//locul unde se afiseaza detalile caracterului tau si a caraterului ales de calculator
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
								System.out.println("*************************************************************");
								System.out.println("Oponetul a fost selectat");
								System.out.println("*************************************************************");
									
								//alegerea oponetului de catre calculator
								if(random==5)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(zombi.nume="Zoto", zombi.Viata(), zombi.Musca());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac3(), zombi.Viata(), zombi.Musca(), om.nume, zombi.nume="Zoto");
								}	
								else if(random==4)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(mutant.nume="Righ", mutant.Viata(), mutant.getAruncaFoc());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac3(), mutant.Viata(), mutant.getAruncaFoc(), om.nume, mutant.nume="Righ");
								}
								else if(random==3)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(monstru.nume="Turbg", monstru.Viata(), monstru.getPumnul());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac3(), monstru.Viata(), monstru.getPumnul(), om.nume, monstru.nume="Turbg");
								}
								else if(random==2)
								{
									mod.DisplayDetaliCaracterStandardDeCalculator(animal.nume="Bingo", animal.Viata(), animal.AtacCuOtravaSiMusca());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac3(), animal.Viata(), animal.AtacCuOtravaSiMusca(), om.nume, animal.nume="Bingo");
								}
								else if(random==1)
								{
									mod.DisplayDetaliCaracterPentruOmDeCalculator(om.nume="Bula",arma_aleasa, om.Viata(), om.atac2());
									System.out.println("*************************************************************");
									mod.Lupta(om.Viata(), om.atac3(), om.Viata(), om.atac2(), om.nume, om.nume="Bula");
								}
							}break;
						}	
					}break;
					
					case 2:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Ham, Ham, Marrrrr");
						System.out.print("-Da-i si un nume animalului:"); 
						animal.nume=input.next();
						System.out.println("-------------------------------------------------------------");
						
						//locul unde se ca afisa ce ai introdus
						//locul unde se afiseaza detalile caracterului tau si a caraterului ales de calculator
						System.out.println("*************************************************************");
						mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
						System.out.println("*************************************************************");
						System.out.println("Oponetul a fost selectat");
						System.out.println("*************************************************************");
						
						//alegerea oponetului de catre calculator
						if(random==5)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(zombi.nume="Zoto", zombi.Viata(), zombi.Musca());
							System.out.println("*************************************************************");
							mod.Lupta(animal.Viata(), animal.AtacCuOtravaSiMusca(), zombi.Viata(), zombi.Musca(), animal.nume, zombi.nume="Zoto");
						}	
						else if(random==4)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(mutant.nume="Righ", mutant.Viata(), mutant.getAruncaFoc());
							System.out.println("*************************************************************");
							mod.Lupta(animal.Viata(), animal.AtacCuOtravaSiMusca(), mutant.Viata(), mutant.getAruncaFoc(), animal.nume, mutant.nume="Righ");
						}
						else if(random==3)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(monstru.nume="Turbg", monstru.Viata(), monstru.getPumnul());
							System.out.println("*************************************************************");
							mod.Lupta(animal.Viata(), animal.AtacCuOtravaSiMusca(), monstru.Viata(), monstru.getPumnul(), animal.nume, monstru.nume="Turbg");
						}
						else if(random==2)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(animal.nume="Bingo", animal.Viata(), animal.AtacCuOtravaSiMusca());
							System.out.println("*************************************************************");
							mod.Lupta(animal.Viata(), animal.AtacCuOtravaSiMusca(), animal.Viata(), animal.AtacCuOtravaSiMusca(), animal.nume, animal.nume="Bingo");
						}
						else if(random==1)
						{
							mod.DisplayDetaliCaracterPentruOmDeCalculator(om.nume="Bula",arma_aleasa="Sabie", om.Viata(), om.atac2());
							System.out.println("*************************************************************");
							mod.Lupta(animal.Viata(), animal.AtacCuOtravaSiMusca(), om.Viata(), om.atac2(), animal.nume, om.nume="Bula");
						}
					}break;
					
					case 3:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Wav, Wav WAAAAA");
						System.out.print("-Da-i si un nume monstrului:"); 
						monstru.nume=input.next();
						System.out.println("-------------------------------------------------------------");
						
						//locul unde se ca afisa ce ai introdus
						//locul unde se afiseaza detalile caracterului tau si a caraterului ales de calculator
						System.out.println("*************************************************************");
						mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
						System.out.println("*************************************************************");
						System.out.println("Oponetul a fost selectat");
						System.out.println("*************************************************************");
						
						//alegerea oponetului de catre calculator
						if(random==5)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(zombi.nume="Zoto", zombi.Viata(), zombi.Musca());
							System.out.println("*************************************************************");
							mod.Lupta(monstru.Viata(), monstru.Atac(), zombi.Viata(), zombi.Musca(), monstru.nume, zombi.nume="Zoto");
						}	
						else if(random==4)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(mutant.nume="Righ", mutant.Viata(), mutant.getAruncaFoc());
							System.out.println("*************************************************************");
							mod.Lupta(monstru.Viata(), monstru.Atac(), mutant.Viata(), mutant.getAruncaFoc(), monstru.nume, mutant.nume="Righ");
						}
						else if(random==3)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(monstru.nume="Turbg", monstru.Viata(), monstru.getPumnul());
							System.out.println("*************************************************************");
							mod.Lupta(monstru.Viata(), monstru.Atac(), monstru.Viata(), monstru.getPumnul(), monstru.nume, monstru.nume="Turbg");
						}
						else if(random==2)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(animal.nume="Bingo", animal.Viata(), animal.AtacCuOtravaSiMusca());
							System.out.println("*************************************************************");
							mod.Lupta(monstru.Viata(), monstru.Atac(), animal.Viata(), animal.AtacCuOtravaSiMusca(), monstru.nume, animal.nume="Bingo");
						}
						else if(random==1)
						{
							mod.DisplayDetaliCaracterPentruOmDeCalculator(om.nume="Bula",arma_aleasa="Sabie", om.Viata(), om.atac2());
							System.out.println("*************************************************************");
							mod.Lupta(monstru.Viata(), monstru.Atac(), om.Viata(), om.atac2(), monstru.nume, om.nume="Bula");
						}
					}break;
					
					case 4:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Waaaaa, Waaaa,Waaaaaa");
						System.out.print("-Da-i si un nume mutantului:"); 
						mutant.nume=input.next();
						System.out.println("-------------------------------------------------------------");
						
						//locul unde se ca afisa ce ai introdus
						//locul unde se afiseaza detalile caracterului tau si a caraterului ales de calculator
						System.out.println("*************************************************************");
						mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
						System.out.println("*************************************************************");
						System.out.println("Oponetul a fost selectat");
						System.out.println("*************************************************************");
						
						//alegerea oponetului de catre calculator
						if(random==5)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(zombi.nume="Zoto", zombi.Viata(), zombi.Musca());
							System.out.println("*************************************************************");
							mod.Lupta(mutant.Viata(), mutant.Atac(), zombi.Viata(), zombi.Musca(), mutant.nume, zombi.nume="Zoto");
						}	
						else if(random==4)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(mutant.nume="Righ", mutant.Viata(), mutant.getAruncaFoc());
							System.out.println("*************************************************************");
							mod.Lupta(mutant.Viata(), mutant.Atac(), mutant.Viata(), mutant.getAruncaFoc(), mutant.nume, mutant.nume="Righ");
						}
						else if(random==3)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(monstru.nume="Turbg", monstru.Viata(), monstru.getPumnul());
							System.out.println("*************************************************************");
							mod.Lupta(mutant.Viata(), mutant.Atac(), monstru.Viata(), monstru.getPumnul(), mutant.nume, monstru.nume="Turbg");
						}
						else if(random==2)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(animal.nume="Bingo", animal.Viata(), animal.AtacCuOtravaSiMusca());
							System.out.println("*************************************************************");
							mod.Lupta(mutant.Viata(), mutant.Atac(), animal.Viata(), animal.AtacCuOtravaSiMusca(), mutant.nume, animal.nume="Bingo");
						}
						else if(random==1)
						{
							mod.DisplayDetaliCaracterPentruOmDeCalculator(om.nume="Bula",arma_aleasa="Sabie", om.Viata(), om.atac2());
							System.out.println("*************************************************************");
							mod.Lupta(mutant.Viata(), mutant.Atac(), om.Viata(), om.atac2(), mutant.nume, om.nume="Bula");
						}
					}break;
					
					case 5:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Roaaaaa, Roooaaa");
						System.out.print("-Da-i un nume la zombi:"); 
						zombi.nume=input.next();
						System.out.println("-------------------------------------------------------------");
						
						//locul unde se ca afisa ce ai introdus
						//locul unde se afiseaza detalile caracterului tau si a caraterului ales de calculator
						System.out.println("*************************************************************");
						mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
						System.out.println("*************************************************************");
						System.out.println("Oponetul a fost selectat");
						System.out.println("*************************************************************");
						
						//alegerea oponetului de catre calculator
						if(random==5)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(zombi.nume="Zoto", zombi.Viata(), zombi.Musca());
							System.out.println("*************************************************************");
							mod.Lupta(zombi.Viata(), zombi.Musca(), zombi.Viata(), zombi.Musca(), zombi.nume, zombi.nume="Zoto");
						}	
						else if(random==4)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(mutant.nume="Righ", mutant.Viata(), mutant.getAruncaFoc());
							System.out.println("*************************************************************");
							mod.Lupta(zombi.Viata(), zombi.Musca(), mutant.Viata(), mutant.getAruncaFoc(), zombi.nume, mutant.nume="Righ");
						}
						else if(random==3)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(monstru.nume="Turbg", monstru.Viata(), monstru.getPumnul());
							System.out.println("*************************************************************");
							mod.Lupta(zombi.Viata(), zombi.Musca(), monstru.Viata(), monstru.getPumnul(), zombi.nume, monstru.nume="Turbg");
						}
						else if(random==2)
						{
							mod.DisplayDetaliCaracterStandardDeCalculator(animal.nume="Bingo", animal.Viata(), animal.AtacCuOtravaSiMusca());
							System.out.println("*************************************************************");
							mod.Lupta(zombi.Viata(), zombi.Musca(), animal.Viata(), animal.AtacCuOtravaSiMusca(), zombi.nume, animal.nume="Bingo");
						}
						else if(random==1)
						{
							mod.DisplayDetaliCaracterPentruOmDeCalculator(om.nume="Bula",arma_aleasa="Sabie", om.Viata(), om.atac2());
							System.out.println("*************************************************************");
							mod.Lupta(zombi.Viata(), zombi.Musca(), om.Viata(), om.atac2(), zombi.nume, om.nume="Bula");
						}
					}break;
				}break;
			}
			//cazul in care se joaca JUCATOR VS JUCATOR
			case 2:
			{
				System.out.println("*************************************************************************");
				System.out.println("|                                                                       |");
				System.out.println("|                                                                       |");
				System.out.println("|          Bun venit in sistemul de joc Jucator vs Jucator              |");
				System.out.println("|                                                                       |");
				System.out.println("|                                                                       |");
				System.out.println("*************************************************************************");
				
				System.out.println();
				
				mod.DisplayCaracter2();
				System.out.println("Primul jucator trebuie sa selecteze un caracter pentru inceperea luptei");
				System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
				numar_caracter=input.nextInt();
				switch(numar_caracter)
				{
					case 1:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Roaaaaa, Roooaaa");
						System.out.print("-Da-i un nume la zombi:"); 
						zombi.nume=input.next();
						String qwe=zombi.nume;
						System.out.println("Esti primul jucator si a posibilitatea de a alege daca vrei sa ataci prtimul..");
						System.out.println("Scrie atac sau aparare: ");
						p=input.next();
						System.out.println("-------------------------------------------------------------");
						
						mod.DisplayCaracter2();
						System.out.println("Jucatorul cu numarul doi trebuie sa isi aleaga un caracter pentru a incpe lupta ");
						System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
						numar_caracter=input.nextInt();
						switch(numar_caracter)
						{
							case 1:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Roooaaa");
								System.out.print("-Da-i un nume la zombi:"); 
								zombi.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								mod.LuptaMulti(zombi.Viata(), zombi.Musca(), zombi.Viata(), zombi.Musca(), qwe, zombi.nume, p);
							}break;
							
							case 2:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Marr, Hamm...");
								System.out.print("-Da-i si un nume animalului:"); 
								animal.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								mod.LuptaMulti(zombi.Viata(), zombi.Musca(), animal.Viata(),  animal.AtacCuOtravaSiMusca(), qwe, animal.nume, p);
							}break;
							
							case 3:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Waaa, Wowere...");
								System.out.print("-Da-i un nume mutatului:"); 
								mutant.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti(zombi.Viata(), zombi.Musca(),  mutant.Viata(), mutant.Atac(), qwe, mutant.nume, p);
							}break;
							
							case 4:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Rooaaa...");
								System.out.print("-Da-i un nume monstrului:"); 
								monstru.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti(zombi.Viata(), zombi.Musca(), monstru.Viata(), monstru.Atac(), qwe, monstru.nume, p);
							}break;
							
							case 5:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
								System.out.print("-Da-mi si un nume:"); 
								om.nume=input.next();
								mod.DisplyWepon();
								System.out.print("-Introdu numarul armei:");
								numar_arma=input.nextInt();
								System.out.print("Scrie numele armei alese de tine: ");
								arma_aleasa=input.next();
								System.out.println("-------------------------------------------------------------");
								
								switch(numar_arma)
								{
									case 1:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, zombi.Viata(), zombi.Musca());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										mod.LuptaMulti(zombi.Viata(), zombi.Musca(), om.Viata(), om.atac1(), qwe, om.nume, p);
									}break;
									
									case 2:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, zombi.Viata(), zombi.Musca());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										mod.LuptaMulti(zombi.Viata(), zombi.Musca(), om.Viata(), om.atac2(), qwe, om.nume, p);
									}break;
									
									case 3:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, zombi.Viata(), zombi.Musca());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										mod.LuptaMulti(zombi.Viata(), zombi.Musca(), om.Viata(), om.atac3(), qwe, om.nume, p);
									}break;
								}
							}break;
						}
					}break;
					
					case 2:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Hammm.., Hauuu...");
						System.out.print("-Da-i un nume la animalului:"); 
						animal.nume=input.next();
						String qwe=animal.nume;
						System.out.println("Esti primul jucator si a posibilitatea de a alege daca vrei sa ataci prtimul..");
						System.out.println("Scrie atac sau aparare: ");
						p=input.next();
						System.out.println("-------------------------------------------------------------");
						
						mod.DisplayCaracter2();
						System.out.println("Jucatorul cu numarul doi trebuie sa isi aleaga un caracter pentru a incpe lupta ");
						System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
						numar_caracter=input.nextInt();
						switch(numar_caracter)
						{
							case 1:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Roooaaa");
								System.out.print("-Da-i un nume la zombi:"); 
								zombi.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								mod.LuptaMulti(animal.Viata(), animal.AtacCuOtravaSiMusca(), zombi.Viata(), zombi.Musca(), qwe, zombi.nume, p);
							}break;
							
							case 2:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Marr, Hamm...");
								System.out.print("-Da-i si un nume animalului:"); 
								animal.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								mod.LuptaMulti(animal.Viata(), animal.AtacCuOtravaSiMusca(), animal.Viata(), animal.AtacCuOtravaSiMusca(), qwe, animal.nume, p);
							}break;
							
							case 3:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Waaa, Wowere...");
								System.out.print("-Da-i un nume mutatului:"); 
								mutant.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti(animal.Viata(), animal.AtacCuOtravaSiMusca(), mutant.Viata(),  mutant.Atac(), qwe, mutant.nume, p);
							}break;
							
							case 4:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Rooaaa...");
								System.out.print("-Da-i un nume monstrului:"); 
								monstru.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti(animal.Viata(), animal.AtacCuOtravaSiMusca(), monstru.Viata(), monstru.Atac(), qwe, monstru.nume, p);
							}break;
							
							case 5:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
								System.out.print("-Da-mi si un nume:"); 
								om.nume=input.next();
								mod.DisplyWepon();
								System.out.print("-Introdu numarul armei:");
								numar_arma=input.nextInt();
								System.out.print("Scrie numele armei alese de tine: ");
								arma_aleasa=input.next();
								System.out.println("-------------------------------------------------------------");
								
								switch(numar_arma)
								{
									case 1:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, animal.Viata(), animal.AtacCuOtravaSiMusca());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										mod.LuptaMulti(animal.Viata(), animal.AtacCuOtravaSiMusca(), om.Viata(), om.atac1(), qwe, om.nume, p);
									}break;
									
									case 2:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, animal.Viata(), animal.AtacCuOtravaSiMusca());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										mod.LuptaMulti(animal.Viata(), animal.AtacCuOtravaSiMusca(), om.Viata(), om.atac2(), qwe, om.nume, p);
									}break;
									
									case 3:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, animal.Viata(), animal.AtacCuOtravaSiMusca());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										mod.LuptaMulti(animal.Viata(), animal.AtacCuOtravaSiMusca(), om.Viata(), om.atac3(), qwe, om.nume, p);
									}break;
								}
							}break;
						}
					}break;
					
					case 3:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Hammm.., Hauuu...");
						System.out.print("-Da-i un nume la mutantului:"); 
						mutant.nume=input.next();
						String qwe=mutant.nume;
						System.out.println("Esti primul jucator si a posibilitatea de a alege daca vrei sa ataci prtimul..");
						System.out.println("Scrie atac sau aparare: ");
						p=input.next();
						System.out.println("-------------------------------------------------------------");
						
						mod.DisplayCaracter2();
						System.out.println("Jucatorul cu numarul doi trebuie sa isi aleaga un caracter pentru a incpe lupta ");
						System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
						numar_caracter=input.nextInt();
						switch(numar_caracter)
						{
							case 1:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Roooaaa");
								System.out.print("-Da-i un nume la zombi:"); 
								zombi.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								mod.LuptaMulti( mutant.Viata(), mutant.Atac(), zombi.Viata(), zombi.Musca(), qwe, zombi.nume, p);
							}break;
							
							case 2:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Marr, Hamm...");
								System.out.print("-Da-i si un nume animalului:"); 
								animal.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								mod.LuptaMulti(mutant.Viata(), mutant.Atac(), animal.Viata(), animal.AtacCuOtravaSiMusca(), qwe, animal.nume, p);
							}break;
							
							case 3:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Waaa, Wowere...");
								System.out.print("-Da-i un nume mutatului:"); 
								mutant.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti(mutant.Viata(), mutant.Atac(),  mutant.Viata(), mutant.Atac(), qwe, mutant.nume, p);
							}break;
							
							case 4:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Rooaaa...");
								System.out.print("-Da-i un nume monstrului:"); 
								monstru.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti( mutant.Viata(), mutant.Atac(), monstru.Viata(), monstru.Atac(), qwe, monstru.nume, p);
							}break;
							
							case 5:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
								System.out.print("-Da-mi si un nume:"); 
								om.nume=input.next();
								mod.DisplyWepon();
								System.out.print("-Introdu numarul armei:");
								numar_arma=input.nextInt();
								System.out.print("Scrie numele armei alese de tine: ");
								arma_aleasa=input.next();
								System.out.println("-------------------------------------------------------------");
								
								switch(numar_arma)
								{
									case 1:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, mutant.Viata(), mutant.Atac());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										mod.LuptaMulti(mutant.Viata(), mutant.Atac(), om.Viata(), om.atac1(), qwe, om.nume, p);
									}break;
									
									case 2:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, mutant.Viata(), mutant.Atac());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										mod.LuptaMulti(mutant.Viata(), mutant.Atac(), om.Viata(), om.atac2(), qwe, om.nume, p);
									}break;
									
									case 3:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, mutant.Viata(), mutant.Atac());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										mod.LuptaMulti(mutant.Viata(), mutant.Atac(), om.Viata(), om.atac3(), qwe, om.nume, p);
									}break;
								}
							}break;
						}
					}break;
					
					case 4:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Roaaa.., Wooaaaa...");
						System.out.print("-Da-i un nume la mutantului:"); 
						monstru.nume=input.next();
						String qwe=monstru.nume;
						System.out.println("Esti primul jucator si a posibilitatea de a alege daca vrei sa ataci prtimul..");
						System.out.println("Scrie atac sau aparare: ");
						p=input.next();
						System.out.println("-------------------------------------------------------------");
						
						mod.DisplayCaracter2();
						System.out.println("Jucatorul cu numarul doi trebuie sa isi aleaga un caracter pentru a incpe lupta ");
						System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
						numar_caracter=input.nextInt();
						switch(numar_caracter)
						{
							case 1:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Roooaaa");
								System.out.print("-Da-i un nume la zombi:"); 
								zombi.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
								System.out.println("*************************************************************");
								mod.LuptaMulti(monstru.Viata(),  monstru.Atac(), zombi.Viata(), zombi.Musca(), qwe, zombi.nume, p);
							}break;
							
							case 2:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Marr, Hamm...");
								System.out.print("-Da-i si un nume animalului:"); 
								animal.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
								System.out.println("*************************************************************");
								mod.LuptaMulti(monstru.Viata(), monstru.Atac(), animal.Viata(), animal.AtacCuOtravaSiMusca(), qwe, animal.nume, p);
							}break;
							
							case 3:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Waaa, Wowere...");
								System.out.print("-Da-i un nume mutatului:"); 
								mutant.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti( monstru.Viata(), monstru.Atac(),  mutant.Viata(), mutant.Atac(), qwe, mutant.nume, p);
							}break;
							
							case 4:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Roaaaaa, Rooaaa...");
								System.out.print("-Da-i un nume monstrului:"); 
								monstru.nume=input.next();
								System.out.println("-------------------------------------------------------------");
								
								//locul unde se vor afisa detaliile introduse de catre jucatorii
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(qwe, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								System.out.println("Oponetul tau");
								System.out.println("*************************************************************");
								mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
								System.out.println("*************************************************************");
								mod.LuptaMulti(monstru.Viata(), monstru.Atac(), monstru.Viata(), monstru.Atac(), qwe, monstru.nume, p);
							}break;
							
							case 5:
							{
								//locul unde interactionez cu, caracterul ales de tine
								System.out.println("-------------------------------------------------------------");
								System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
								System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
								System.out.print("-Da-mi si un nume:"); 
								om.nume=input.next();
								mod.DisplyWepon();
								System.out.print("-Introdu numarul armei:");
								numar_arma=input.nextInt();
								System.out.print("Scrie numele armei alese de tine: ");
								arma_aleasa=input.next();
								System.out.println("Esti primul jucator si a posibilitatea de a alege daca vrei sa ataci prtimul..");
								System.out.println("Scrie atac sau aparare: ");
								p=input.next();
								System.out.println("-------------------------------------------------------------");
								
								switch(numar_arma)
								{
									case 1:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, monstru.Viata(), monstru.Atac());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										mod.LuptaMulti(monstru.Viata(), monstru.Atac(), om.Viata(), om.atac1(), qwe, om.nume, p);
									}break;
									
									case 2:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, monstru.Viata(), monstru.Atac());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										mod.LuptaMulti(monstru.Viata(), monstru.Atac(), om.Viata(), om.atac2(), qwe, om.nume, p);
									}break;
									
									case 3:
									{
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, monstru.Viata(), monstru.Atac());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										mod.LuptaMulti(monstru.Viata(), monstru.Atac(), om.Viata(), om.atac3(), qwe, om.nume, p);
									}break;
								}
							}break;
						}
					}break;
					
					case 5:
					{
						//locul unde interactionez cu, caracterul ales de tine
						System.out.println("-------------------------------------------------------------");
						System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
						System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
						System.out.print("-Da-mi si un nume:"); 
						om.nume=input.next();
						String qwe=om.nume;
						mod.DisplyWepon();
						System.out.print("-Introdu numarul armei:");
						numar_arma=input.nextInt();
						System.out.print("Scrie numele armei alese de tine: ");
						arma_aleasa=input.next();
						System.out.println("Esti primul jucator si a posibilitatea de a alege daca vrei sa ataci prtimul..");
						System.out.println("Scrie atac sau aparare: ");
						p=input.next();
						System.out.println("-------------------------------------------------------------");
						
						switch(numar_arma)
						{
							case 1:
							{
								mod.DisplayCaracter2();
								System.out.println("Jucatorul cu numarul doi trebuie sa isi aleaga un caracter pentru a incpe lupta ");
								System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
								numar_caracter=input.nextInt();
								switch(numar_caracter)
								{
									case 1:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Roaaaaa, Roooaaa");
										System.out.print("-Da-i un nume la zombi:"); 
										zombi.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac1(), zombi.Viata(), zombi.Musca(), qwe, zombi.nume, p);
									}break;
									
									case 2:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Marr, Hamm...");
										System.out.print("-Da-i si un nume animalului:"); 
										animal.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac2(), animal.Viata(), animal.AtacCuOtravaSiMusca(), qwe, animal.nume, p);
									}break;
									
									case 3:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Waaa, Wowere...");
										System.out.print("-Da-i un nume mutatului:"); 
										mutant.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac2(), mutant.Viata(), mutant.Atac(), qwe, mutant.nume, p);
									}break;
									
									case 4:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Roaaaaa, Rooaaa...");
										System.out.print("-Da-i un nume monstrului:"); 
										monstru.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac2(), mutant.Viata(), mutant.Atac(), qwe, mutant.nume, p);
									}break;
									
									case 5:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
										System.out.print("-Da-mi si un nume:"); 
										om.nume=input.next();
										mod.DisplyWepon();
										System.out.print("-Introdu numarul armei:");
										numar_arma=input.nextInt();
										System.out.print("Scrie numele armei alese de tine: ");
										arma_aleasa=input.next();
										System.out.println("-------------------------------------------------------------");
										
										switch(numar_arma)
										{
											case 1:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac1(), qwe,om.nume, p);
											}break;
											
											case 2:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac2());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac2(), qwe,om.nume, p);
											}break;
											
											case 3:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac3(), qwe,om.nume, p);
											}break;
										}
									}break;
								}
							}break;
							
							case 2:
							{
								mod.DisplayCaracter2();
								System.out.println("Jucatorul cu numarul doi trebuie sa isi aleaga un caracter pentru a incpe lupta ");
								System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
								numar_caracter=input.nextInt();
								switch(numar_caracter)
								{
									case 1:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Roaaaaa, Roooaaa");
										System.out.print("-Da-i un nume la zombi:"); 
										zombi.nume=input.next();
										
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac2(), zombi.Viata(), zombi.Musca(), qwe, zombi.nume, p);
									}break;
									
									case 2:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Marr, Hamm...");
										System.out.print("-Da-i si un nume animalului:"); 
										animal.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac2(), animal.Viata(), animal.AtacCuOtravaSiMusca(), qwe, animal.nume, p);
									}break;
									
									case 3:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Waaa, Wowere...");
										System.out.print("-Da-i un nume mutatului:"); 
										mutant.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac2(), mutant.Viata(), mutant.Atac(), qwe, mutant.nume, p);
									}break;
									
									case 4:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Roaaaaa, Rooaaa...");
										System.out.print("-Da-i un nume monstrului:"); 
										monstru.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac2());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac2(), monstru.Viata(), monstru.Atac(), qwe, monstru.nume, p);
									}break;
									
									case 5:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
										System.out.print("-Da-mi si un nume:"); 
										om.nume=input.next();
										mod.DisplyWepon();
										System.out.print("-Introdu numarul armei:");
										numar_arma=input.nextInt();
										System.out.print("Scrie numele armei alese de tine: ");
										arma_aleasa=input.next();
										System.out.println("-------------------------------------------------------------");
										
										switch(numar_arma)
										{
											case 1:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac1(), qwe, om.nume, p);
											}break;
											
											case 2:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac2());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac2(), qwe, om.nume, p);
											}break;
											
											case 3:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac3(), qwe, om.nume, p);
											}break;
										}
									}break;
								}
							}break;
							
							case 3:
							{
								mod.DisplayCaracter2();
								System.out.println("Jucatorul cu numarul doi trebuie sa isi aleaga un caracter pentru a incpe lupta ");
								System.out.print("Alege un caracter si scrie numarul lui si apasa 'Enter': ");
								numar_caracter=input.nextInt();
								switch(numar_caracter)
								{
									case 1:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Roaaaaa, Roooaaa");
										System.out.print("-Da-i un nume la zombi:"); 
										zombi.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(zombi.nume, zombi.Viata(), zombi.Musca());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac1(), zombi.Viata(), zombi.Musca(), qwe, zombi.nume, p);
									}break;
									
									case 2:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Marr, Hamm...");
										System.out.print("-Da-i si un nume animalului:"); 
										animal.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(animal.nume, animal.Viata(), animal.AtacCuOtravaSiMusca());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac1(), animal.Viata(), animal.AtacCuOtravaSiMusca(), qwe, animal.nume, p);
									}break;
									
									case 3:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Waaa, Wowere...");
										System.out.print("-Da-i un nume mutatului:"); 
										mutant.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(mutant.nume, mutant.Viata(), mutant.Atac());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac1(), mutant.Viata(), mutant.Atac(), qwe, mutant.nume, p);
									}break;
									
									case 4:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Roaaaaa, Rooaaa...");
										System.out.print("-Da-i un nume monstrului:"); 
										monstru.nume=input.next();
										System.out.println("-------------------------------------------------------------");
										
										//locul unde se vor afisa detaliile introduse de catre jucatorii
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac3());
										System.out.println("*************************************************************");
										System.out.println("Oponetul tau");
										System.out.println("*************************************************************");
										mod.DisplayDetaliCaracterStandard(monstru.nume, monstru.Viata(), monstru.Atac());
										System.out.println("*************************************************************");
										mod.LuptaMulti(om.Viata(), om.atac1(),  monstru.Viata(), monstru.Atac(), qwe, monstru.nume, p);
									}break;
									
									case 5:
									{
										//locul unde interactionez cu, caracterul ales de tine
										System.out.println("-------------------------------------------------------------");
										System.out.println("-Dupa fiecare actiune sau introducere de la tastatura apasati Enter");
										System.out.println("-Salut ai luat cea mai buna decizie alegandu-ma..., Nu o sa te dezamagesc..");
										System.out.print("-Da-mi si un nume:"); 
										om.nume=input.next();
										mod.DisplyWepon();
										System.out.print("-Introdu numarul armei:");
										numar_arma=input.nextInt();
										System.out.print("Scrie numele armei alese de tine: ");
										arma_aleasa=input.next();
										System.out.println("-------------------------------------------------------------");
										
										switch(numar_arma)
										{
											case 1:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac1(), qwe, om.nume, p);
											}break;
											
											case 2:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac2());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac2(), qwe, om.nume, p);
											}break;
											
											case 3:
											{
												//locul unde se vor afisa detaliile introduse de catre jucatorii
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterStandard(qwe, om.Viata(), om.atac1());
												System.out.println("*************************************************************");
												System.out.println("Oponetul tau");
												System.out.println("*************************************************************");
												mod.DisplayDetaliCaracterPentruOm(om.nume,arma_aleasa, om.Viata(), om.atac3());
												System.out.println("*************************************************************");
												mod.LuptaMulti(om.Viata(), om.atac1(), om.Viata(), om.atac3(), qwe, om.nume, p);
											}break;
										}
									}break;
								}
							}break;
						}
					}break;
				}
			}break;
		}
		System.out.println();
		System.out.println("daca mai vrei sa te joci o data introdu orice numara in afara de 0...");
		System.out.print("nr=");
		vrei=input.nextInt();
		}while(vrei!=0);
	}
}
		
		
		

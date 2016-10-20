public class ModDeLupta 
{
	public int a,a1,a2,a3,a4,a5,a6,a7,b,b1,b2,b3,b4,b5,b6,b7;
	
	//aspectul primului contact cu jocul
	public void DisplayFirstPage()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("*                                                           *");
		System.out.println("*                                                           *");
		System.out.println("*                                                           *");
		System.out.println("*                   Bun Venit la Arena                      *");
		System.out.println("*                                                           *");
		System.out.println("*                                                           *");
		System.out.println("*                                                           *");
		System.out.println("-------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------");
		System.out.println("*                                                           *");
		System.out.println("*                                                           *");
		System.out.println("*                   1.Jucator vs Calculator                 *");
		System.out.println("*                   2.Jucator vs Jucator                    *");
		System.out.println("*                                                           *");
		System.out.println("*                                                           *");
		System.out.println("-------------------------------------------------------------");
	}
	
	//posibilitatea de ati alege un carater
	public void DisplayCaracter()

	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("*                                                           *");
		System.out.println("* Bun venit in sistemul de joc Jucator vs Calculator        *");
		System.out.println("*                                                           *");
		System.out.println("* Lista de caractere disponibile                            *");
		System.out.println("*       1.Om                                                *");
		System.out.println("*       2.Animal                                            *");
		System.out.println("*       3.Monstru                                           *");
		System.out.println("*       4.Mutant                                            *");
		System.out.println("*       5.Zombi                                             *");
		System.out.println("-------------------------------------------------------------");
	}
	
	public void DisplayCaracter2()

	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("*                                                           *");
		System.out.println("* Bun venit in sistemul de joc Jucator vs Jucator           *");
		System.out.println("*                                                           *");
		System.out.println("* Lista de caractere disponibile                            *");
		System.out.println("*       1.Zombi                                             *");
		System.out.println("*       2.Animal                                            *");
		System.out.println("*       3.Mutant                                            *");
		System.out.println("*       4.Monstru                                           *");
		System.out.println("*       5.Om                                                *");
		System.out.println("-------------------------------------------------------------");
	}
	
	//lista de arme
	public void DisplyWepon()
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("Alege o arma:");
		System.out.println("1.Sabie");
		System.out.println("2.Sulita");
		System.out.println("3.Topor");
	}
	
	public void DisplayDetaliCaracterPentruOm(String nume,String arma_aleasa,int viata,int atac_normal)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("Detalile caracterului ales de tine");
		System.out.println("Numele: " + nume);
		System.out.println("Arma aleasa: " + arma_aleasa);
		System.out.println("Viata: " + viata);
		System.out.println("Valoarea atacului: " + atac_normal);
		System.out.println("-------------------------------------------------------------");
	}
	
	public void DisplayDetaliCaracterPentruOmDeCalculator(String nume,String arma_aleasa,int viata,int atac_normal)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("Detalile caracterului ales de calculator");
		System.out.println("Numele: " + nume);
		System.out.println("Arma aleasa: " + arma_aleasa);
		System.out.println("Viata: " + viata);
		System.out.println("Valoarea atacului: " + atac_normal);
		System.out.println("-------------------------------------------------------------");
	}
	
	public void DisplayDetaliCaracterStandard(String nume1,int viata1,int atac_normal1)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("Detalile caracterului ales de tine");
		System.out.println("Numele: " + nume1);
		System.out.println("Viata: " + viata1);
		System.out.println("Valoarea atacului: "+ atac_normal1);
		System.out.println("-------------------------------------------------------------");
	}
	
	public void DisplayDetaliCaracterStandardDeCalculator(String nume1,int viata1,int atac_normal1)
	{
		System.out.println("-------------------------------------------------------------");
		System.out.println("Detalile caracterului ales de calculator");
		System.out.println("Numele: " + nume1);
		System.out.println("Viata: " + viata1);
		System.out.println("Valoarea atacului: "+ atac_normal1);
		System.out.println("-------------------------------------------------------------");
	}

	public void Lupta(int viata, int atac, int viata1, int atac1, String name, String name1)
	{
		a=viata1-atac;
		System.out.println("-------------------------------------------------------------");
		System.out.println(name1 + "a mai ramas cu " + a + " puncte de viata");
		b=viata-atac1;
		System.out.println("-------------------------------------------------------------");
		System.out.println(name + "a mai ramas cu " + b + " puncte de viata");
		if(a>0 && b>0)
		{		
			a2=a-atac;
			System.out.println("-------------------------------------------------------------");
			System.out.println(name1 + "a mai ramas cu " + a2 + " puncte de viata");
			if(a2<=0)
				System.out.println(name + "a castigat meciul");
			else
			{
				b2=b-atac1;
				System.out.println("-------------------------------------------------------------");
				System.out.println(name + "a mai ramas cu " + b2 + " puncte de viata");
				if(b2<=0)
					System.out.println(name1 + "a castigat meciul");
				else
				{
					a3=a2-atac;
					System.out.println("-------------------------------------------------------------");
					System.out.println(name1 + "a mai ramas cu " + a3 + " puncte de viata");
					if(a3<=0)
						System.out.println(name + "a castigat meciul");
					else
					{
						b3=b2-atac1;
						System.out.println("-------------------------------------------------------------");
						System.out.println(name + "a mai ramas cu " + b3 + " puncte de viata");
						if(b3<=0)
							System.out.println(name1 + "a castigat meciul");
						else
						{
							a4=a3-atac;
							System.out.println("-------------------------------------------------------------");
							System.out.println(name1 + "a mai ramas cu " + a4 + " puncte de viata");
							if(a4<=0)
								System.out.println(name + "a castigat meciul");
							else
							{
								b4=b3-atac1;
								System.out.println("-------------------------------------------------------------");
								System.out.println(name + "a mai ramas cu " + b4 + " puncte de viata");
								if(b4<=0)
									System.out.println(name1 + "a castigat meciul");
								else
								{
									a5=a4-atac;
									System.out.println("-------------------------------------------------------------");
									System.out.println(name1 + "a mai ramas cu " + a5 + " puncte de viata");
									if(a5<=0)
										System.out.println(name + "a castigat meciul");
									else
									{
										b5=b4-atac1;
										System.out.println("-------------------------------------------------------------");
										System.out.println(name + "a mai ramas cu " + b5 + " puncte de viata");
										if(b5<=0)
											System.out.println(name1 + "a castigat meciul");
										else
										{
											a6=a5-atac;
											System.out.println("-------------------------------------------------------------");
											System.out.println(name1 + "a mai ramas cu " + a6 + " puncte de viata");
											if(a6<=0)
												System.out.println(name + "a castigat meciul");
											else
											{
												b6=b5-atac1;
												System.out.println("-------------------------------------------------------------");
												System.out.println(name + "a mai ramas cu " + b6 + " puncte de viata");
												if(b6<=0)
													System.out.println(name1 + "a castigat meciul");
												else
												{
													a7=a6-atac;
													System.out.println("-------------------------------------------------------------");
													System.out.println(name1 + "a mai ramas cu " + a7 + " puncte de viata");
													if(a7<=0)
														System.out.println(name + "a castigat meciul");
													else
													{
														b7=b6-atac1;
														System.out.println("-------------------------------------------------------------");
														System.out.println(name + "a mai ramas cu " + b7 + " puncte de viata");
														if(b7<=0)
															System.out.println(name1 + "a castigat meciul");
													}
												}
											}											
										}
									}
								}
							}
						}
					}
				}
			}
		}		
	}

	public void LuptaMulti(int viata, int atac, int viata1, int atac1, String name, String name1, String per)
	{
		if(per=="atac")
		{
			a=viata1-atac;
			System.out.println("-------------------------------------------------------------");
			System.out.println(name1 + "a mai ramas cu " + a + " puncte de viata");
			b=viata-atac1;
			System.out.println("-------------------------------------------------------------");
			System.out.println(name + "a mai ramas cu " + b + " puncte de viata");
			if(a>0 && b>0)
			{		
				a2=a-atac;
				System.out.println("-------------------------------------------------------------");
				System.out.println(name1 + "a mai ramas cu " + a2 + " puncte de viata");
				if(a2<=0)
					System.out.println(name + "a castigat meciul");
				else
				{
					b2=b-atac1;
					System.out.println("-------------------------------------------------------------");
					System.out.println(name + "a mai ramas cu " + b2 + " puncte de viata");
					if(b2<=0)
						System.out.println(name1 + "a castigat meciul");
					else
					{
						a3=a2-atac;
						System.out.println("-------------------------------------------------------------");
						System.out.println(name1 + "a mai ramas cu " + a3 + " puncte de viata");
						if(a3<=0)
							System.out.println(name + "a castigat meciul");
						else
						{
							b3=b2-atac1;
							System.out.println("-------------------------------------------------------------");
							System.out.println(name + "a mai ramas cu " + b3 + " puncte de viata");
							if(b3<=0)
								System.out.println(name1 + "a castigat meciul");
							else
							{
								a4=a3-atac;
								System.out.println("-------------------------------------------------------------");
								System.out.println(name1 + "a mai ramas cu " + a4 + " puncte de viata");
								if(a4<=0)
									System.out.println(name + "a castigat meciul");
								else
								{
									b4=b3-atac1;
									System.out.println("-------------------------------------------------------------");
									System.out.println(name + "a mai ramas cu " + b4 + " puncte de viata");
									if(b4<=0)
										System.out.println(name1 + "a castigat meciul");
									else
									{
										a5=a4-atac;
										System.out.println("-------------------------------------------------------------");
										System.out.println(name1 + "a mai ramas cu " + a5 + " puncte de viata");
										if(a5<=0)
											System.out.println(name + "a castigat meciul");
										else
										{
											b5=b4-atac1;
											System.out.println("-------------------------------------------------------------");
											System.out.println(name + "a mai ramas cu " + b5 + " puncte de viata");
											if(b5<=0)
												System.out.println(name1 + "a castigat meciul");
											else
											{
												a6=a5-atac;
												System.out.println("-------------------------------------------------------------");
												System.out.println(name1 + "a mai ramas cu " + a6 + " puncte de viata");
												if(a6<=0)
													System.out.println(name + "a castigat meciul");
												else
												{
													b6=b5-atac1;
													System.out.println("-------------------------------------------------------------");
													System.out.println(name + "a mai ramas cu " + b6 + " puncte de viata");
													if(b6<=0)
														System.out.println(name1 + "a castigat meciul");
													else
													{
														a7=a6-atac;
														System.out.println("-------------------------------------------------------------");
														System.out.println(name1 + "a mai ramas cu " + a7 + " puncte de viata");
														if(a7<=0)
															System.out.println(name + "a castigat meciul");
														else
														{
															b7=b6-atac1;
															System.out.println("-------------------------------------------------------------");
															System.out.println(name + "a mai ramas cu " + b7 + " puncte de viata");
															if(b7<=0)
																System.out.println(name1 + "a castigat meciul");
														}
													}
												}											
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		else
		{
			b=viata-atac1;
			System.out.println("-------------------------------------------------------------");
			System.out.println(name1 + "a mai ramas cu " + b + " puncte de viata");
			a=viata1-atac;
			System.out.println("-------------------------------------------------------------");
			System.out.println(name + "a mai ramas cu " + a + " puncte de viata");
			if(b>0 && a>0)
			{		
				b2=b-atac1;
				System.out.println("-------------------------------------------------------------");
				System.out.println(name1 + "a mai ramas cu " + b2 + " puncte de viata");
				if(b2<=0)
					System.out.println(name + "a castigat meciul");
				else
				{
					a2=a-atac;
					System.out.println("-------------------------------------------------------------");
					System.out.println(name + "a mai ramas cu " + a2 + " puncte de viata");
					if(a2<=0)
						System.out.println(name1 + "a castigat meciul");
					else
					{
						b3=b2-atac1;
						System.out.println("-------------------------------------------------------------");
						System.out.println(name1 + "a mai ramas cu " + b3 + " puncte de viata");
						if(b3<=0)
							System.out.println(name + "a castigat meciul");
						else
						{
							a3=a2-atac;
							System.out.println("-------------------------------------------------------------");
							System.out.println(name + "a mai ramas cu " + a3 + " puncte de viata");
							if(a3<=0)
								System.out.println(name1 + "a castigat meciul");
							else
							{
								b4=b3-atac1;
								System.out.println("-------------------------------------------------------------");
								System.out.println(name1 + "a mai ramas cu " + b4 + " puncte de viata");
								if(b4<=0)
									System.out.println(name + "a castigat meciul");
								else
								{
									a4=a3-atac;
									System.out.println("-------------------------------------------------------------");
									System.out.println(name + "a mai ramas cu " + a4 + " puncte de viata");
									if(a4<=0)
										System.out.println(name1 + "a castigat meciul");
									else
									{
										b5=b4-atac;
										System.out.println("-------------------------------------------------------------");
										System.out.println(name1 + "a mai ramas cu " + b5 + " puncte de viata");
										if(b5<=0)
											System.out.println(name + "a castigat meciul");
										else
										{
											a5=a4-atac;
											System.out.println("-------------------------------------------------------------");
											System.out.println(name + "a mai ramas cu " + a5 + " puncte de viata");
											if(a5<=0)
												System.out.println(name1 + "a castigat meciul");
											else
											{
												b6=b5-atac1;
												System.out.println("-------------------------------------------------------------");
												System.out.println(name1 + "a mai ramas cu " + b6 + " puncte de viata");
												if(b6<=0)
													System.out.println(name + "a castigat meciul");
												else
												{
													a6=a5-atac;
													System.out.println("-------------------------------------------------------------");
													System.out.println(name + "a mai ramas cu " + a6 + " puncte de viata");
													if(a6<=0)
														System.out.println(name1 + "a castigat meciul");
													else
													{
														b7=b6-atac1;
														System.out.println("-------------------------------------------------------------");
														System.out.println(name1 + "a mai ramas cu " + b7 + " puncte de viata");
														if(b7<=0)
															System.out.println(name + "a castigat meciul");
														else
														{
															a7=a6-atac;
															System.out.println("-------------------------------------------------------------");
															System.out.println(name + "a mai ramas cu " + a7 + " puncte de viata");
															if(a7<=0)
																System.out.println(name1 + "a castigat meciul");
														}
													}
												}											
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
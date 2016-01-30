package net.projecteuler.quatnovcin;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Operation {

	
	public void calc(long n, int k) {

		int numCifre = k;
		long prodotto = 1;
		int numeroSoluzioni = 0;
		List<Long> provati = new ArrayList<Long>();
		List<Long> soluzioni = new ArrayList<Long>();
		
		List<Long> cifre = new ArrayList<Long>(numCifre);
//		long cifre[] = new long [numCifre];
		
		List<Long> escludiDUplicati = new ArrayList<Long>();
		
		List<List<Long>> listaProvati = new ArrayList<List<Long>>();
		List<List<Long>> listaSoluzioni = new ArrayList<List<Long>>();
		
		//inizializzo il vettore di cifre
		for (int i=1; i<=numCifre; i++)
		{
			cifre.add((long)i);
		}
		
		//faccio le moltiplicazioni
		while (cifre.get(0) <= n)
		{
			for (int i=numCifre; i>=0; i--)
			{
				prodotto = 1;
				for (int j=0; j<numCifre; j++)
				{
					prodotto = prodotto * cifre.get(j);
				}
				
				
//				if (Collections.disjoint(listaProvati, cifre))
//					{
					 
					
					
					if (prodotto < n)
					{	
						long tempIncrease = cifre.get(i-1);
						tempIncrease ++;
						cifre.set(i-1, tempIncrease);
						listaProvati.add(cifre);
						break;
					} else if (prodotto == n){
								numeroSoluzioni++;
								for (int l=0; l<k; l++)
								{
									soluzioni.add(cifre.get(l));
								}
	//							System.out.println(Arrays.toString(cifre));
								listaSoluzioni.add(soluzioni);
								listaProvati.add(soluzioni);
								soluzioni.clear();
								
								long tempIncrease = cifre.get(i-1);
								tempIncrease ++;
								cifre.add(i-1, tempIncrease);
								break;
							} else {
								cifre.set((i-1), (long)1);
								listaProvati.add(cifre);
	//							cifre[i-1] = 1;
							}
				}
			}
//			System.out.println("["+cifre[0]+" "+cifre[1]+" "+cifre[2]+" "+cifre[3]+"] - "+prodotto);
			//System.out.println(Arrays.toString(listaSoluzioni));
		
//		}
	}	
	
	//numCifre = k
	public int checkDisposition (int k, List<List<Long>>  listaProvati, List<Long> ultimoProvato)
	{	
			// Check if one list contains element from the other 7 answers
			if (!Collections.disjoint(listaProvati, ultimoProvato))
			{
			  return 1;
			}
		return 0;
	}
	
}
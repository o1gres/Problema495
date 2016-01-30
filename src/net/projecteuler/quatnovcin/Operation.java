package net.projecteuler.quatnovcin;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Operation {

	
	public void calc(long n, int k) {

		int numCifre = k;
		long prodotto = 0;
		int numeroSoluzioni = 0;
		List<Integer> provati = new ArrayList<Integer>();
		long cifre[] = new long [numCifre];
		List<List<Integer>> listaProvati = new ArrayList<List<Integer>>();
		List<List<Integer>> listaSoluzioni = new ArrayList<List<Integer>>();
		
		//inizializzo il vettore di cifre
		for (int i=1; i<numCifre; i++)
		{
			cifre[i-1] = i;
		}
		
		//faccio le moltiplicazioni
		while (cifre[0] <= n)
		{
			for (int i=numCifre; i>=0; i--)
			{
				if (cifre[i-1] < n)
				{
					cifre[i-1]++;
					break;
				} else {
						cifre[i-1] = 1;
						}
			}

			System.out.println("["+cifre[0]+" "+cifre[1]+" "+cifre[2]+"]");
		
	}
	
	
	
//	public int checkDisposition (int i, int j, int k, int l, List<List<Integer>>  listaProvati)
//	{
//		int size = listaProvati.size();
//		List<Integer> provatiSupport = new ArrayList<Integer>();
//		boolean bi, bj, bk, bl = false;
//		
//		
//		for (int z=0; z<size; z++)for (int j=numCifre; j>0; j--)
////			{
////			cifre[j] = 1;
////		}
//		{
//			provatiSupport = (List<Integer>) listaProvati.get(z);
//			bi = provatiSupport.contains(i);
//			bj = provatiSupport.contains(j);
//			bk = provatiSupport.contains(k);
//			bl = provatiSupport.contains(l);
//			
//			if (bi && bj && bk && bl)
//			{
//				return 1;
//			}
//		}
//		
//		return 0;
//	}
}
}
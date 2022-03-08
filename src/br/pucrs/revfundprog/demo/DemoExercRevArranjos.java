package br.pucrs.revfundprog.demo;


import java.util.*;
import br.pucrs.util.TimeCounter;

import static java.util.Arrays.asList;


public class TestaExercRevisaoLista {
	private static final int SIZE_ARRAYLIST = 1500000;
	public static void main(String [] args) {
		ExercRevisaoLista ex = new ExercRevisaoLista();
		
		ArrayList<Integer> alRep1, alRep = new ArrayList<>(asList(10, 20, 10, 40, 50, 60, 20, 10));
		ArrayList<Integer> al = new ArrayList<>(asList(10, 20, 30, 40, 50, 60, 80, 90));
		ArrayList<Integer> alVazio = new ArrayList<>();
		
		System.out.println("\n\n-------------------------------");
		System.out.println("Com listas pequenas (8 elementos)");
		System.out.println("-------------------------------");
		
		System.out.println("alRep = " + alRep);
		System.out.println("al = " + al);
		System.out.println("alVazio = " + alVazio);

//		System.out.println("\nNro de ocorrencias:");
//		System.out.println("ListaArranjos invalida: " + ex.nOcorrencias(null, 20));
//		System.out.println("Elemento invalido: " + ex.nOcorrencias(alRep, null));
//		System.out.println("Elemento fora da lista: " + ex.nOcorrencias(alRep, 9));
//		System.out.println("Elemento na lista: \n");
//		for (Integer i:alRep)
//			System.out.println("Elemento " + i + ":" + ex.nOcorrencias(alRep, i));
//			
		System.out.println("\nSoluÃ§Ã£o (hasRepeat):");
		System.out.println("alRep tem repetidos? " + ex.hasRepeat(alRep));
		System.out.println("al tem repetidos? " + ex.hasRepeat(al));
		System.out.println("alVazio tem repetidos? " + ex.hasRepeat(alVazio));
		
		
//		System.out.println("\n\nPrimeira Soluï¿½ï¿½o (nroRepeat):");
//		System.out.println("alRep tem repetidos? " + ex.nroRepeat(alRep));
//		System.out.println("al tem repetidos? " + ex.nroRepeat(al));
//		System.out.println("alVazio tem repetidos? " + ex.nroRepeat(alVazio));
//		
//		System.out.println("\nSegunda Soluï¿½ï¿½o (nroRepeatAlt):");
//		System.out.println("alRep tem repetidos? " + ex.nroRepeatAlt(alRep));
//		System.out.println("al tem repetidos? " + ex.nroRepeatAlt(al));
//		System.out.println("alVazio tem repetidos? " + ex.nroRepeatAlt(alVazio));
//
//		System.out.println("\n\nUniï¿½o: ");
//		System.out.println(ex.union(al, alRep));
//		
//		System.out.println("\n\nIntersecï¿½ï¿½o: ");
//		System.out.println(ex.intersect(al, alRep));
//
		System.out.println("\n\n-------------------------------");
		System.out.println("Com listas grandes (" + SIZE_ARRAYLIST + " elementos)");
		System.out.println("-------------------------------");
		
		alRep = new ArrayList<>(SIZE_ARRAYLIST);
		alRep1= new ArrayList<>(SIZE_ARRAYLIST);
		Random rnd = new Random();
		for (int i = 0; i < SIZE_ARRAYLIST; i++)
			alRep.add(rnd.nextInt(SIZE_ARRAYLIST/2)+1);
		
		for (int i = 0; i < SIZE_ARRAYLIST; i++)
			alRep1.add(rnd.nextInt(SIZE_ARRAYLIST/2)+1);
		
		TimeCounter tc = new TimeCounter();
		
		System.out.println("SoluÃ§Ã£o (hasRepeat):");
		tc.initCounter();
		System.out.println("alRep tem repetidos? " + ex.hasRepeat(alRep));
		System.out.println("Tempo: " + tc.getCounter());
		
//		System.out.println("\n\nSegunda Soluï¿½ï¿½o (nroRepeatAlt):");
//		tc.initCounter();
//		System.out.println("alRep tem repetidos? " + ex.nroRepeatAlt(alRep));
//		System.out.println("Tempo: " + tc.getCounter());
//				
//		System.out.println("\n\nSegunda Soluï¿½ï¿½o (listRepeat):");
//		tc.initCounter();
//		System.out.println("alRep - lista repetidos? " + ex.listRepeat(alRep).size());
//		System.out.println("Tempo: " + tc.getCounter());
//
//		System.out.println("\n\nPrimeira Soluï¿½ï¿½o (union):");
//		tc.initCounter();
//		System.out.println("alRep - uniao " + ex.union(alRep, alRep1).size());
//		System.out.println("Tempo: " + tc.getCounter());
//		
//		System.out.println("\n\nPrimeira Soluï¿½ï¿½o (intersect):");
//		tc.initCounter();
//		System.out.println("alRep - intersectSet " + ex.intersect(alRep, alRep1).size());
//		System.out.println("Tempo: " + tc.getCounter());
		
	}
	
	
}

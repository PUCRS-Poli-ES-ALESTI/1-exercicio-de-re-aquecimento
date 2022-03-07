package br.pucrs.revfundprog;

import java.util.*;

public class ExercRevisaoArranjos {
	public int nOcorrencias(int[] al, int el) {
		int res = 0;

		if ((al != null)) {
//			for (Integer aux:al)
//				if (aux.equals(el))
//					res++;
			for (int i = 0; i < al.length; i++)
				if (al[i] == el)
					res++;
		}
		else res = -1;

		return res;
	}

	public boolean hasRepeat(ArrayList<Integer> al) {
		boolean res = false;

		if (al == null)
			throw new IllegalArgumentException("ArrayList nulo!");
		else {
			for (int i = 0; (i < al.size()) && ( res == false); i++)
				for (int j = i + 1; (j < al.size()) && (res == false); j++)
					if (al.get(i).equals(al.get(j)))
						res = true;
		}

		return res;
	}

	//*** Este nï¿½o funciona adequadamente. Porque?
	public int nroRepeat(ArrayList<Integer> al) {
		int res = 0;

		if (al == null)
			throw new IllegalArgumentException("ArrayList nulo!");
		else {
			for (int i = 0; i < al.size(); i++)
				for (int j = i + 1; j < al.size(); j++)
					if (al.get(i).equals(al.get(j)))
						res++;
		}

		return res;
	}

	protected boolean estaNaLista(ArrayList<Integer> al, Integer el){
		boolean res = false;

		for (int i = 0; (i < al.size()) && (res == false); i++)
			if (el.equals(al.get(i)))
				res = true;

		return res;
	}

	public int nroRepeatAlt(ArrayList<Integer> al) {
		int res = 0;
		ArrayList<Integer> rep = new ArrayList<>();

		if (al == null)
			throw new IllegalArgumentException("ArrayList nulo!");
		else {
			for (int i = 0; i < al.size(); i++)
				for (int j = i + 1; j < al.size(); j++)
					if ((al.get(i).equals(al.get(j))) && (!estaNaLista(rep, al.get(j)))) {
						res++;
						rep.add(al.get(j));
					}
		}
		return res;
	}


	public ArrayList<Integer> listRepeat(ArrayList<Integer> al) {
		ArrayList<Integer> res = new ArrayList<>();

		if (al == null)
			throw new IllegalArgumentException("ArrayList nulo!");
		else {
			for (int i = 0; i < al.size(); i++)
				for (int j = i + 1; j < al.size(); j++)
					if ((al.get(i).equals(al.get(j))) && (!estaNaLista(res, al.get(j)))) 
						res.add(al.get(j));
		}
		return res;
	}

	public List<Integer> union(List<Integer> l1, List<Integer> l2) {
		List<Integer> res = new ArrayList<>(l1.size() + l2.size());

		if ((l1 == null) || (l2 == null))
			throw new IllegalArgumentException("ListaArranjos(s) nula(s)!");
		else {

			int j;
			for (int i = 0; i < l1.size(); i++) {
				if (!res.contains(l1.get(i)))
					res.add(l1.get(i));
				//							OU				
				//				for (j = 0; j < res.size(); j++)
				//					if (l1.get(i).equals(res.get(j)))
				//						break;
				//				if (j >= res.size())
				//					res.add(l1.get(i));
			}
			for (int i = 0; i < l2.size(); i++) {
				if (!res.contains(l2.get(i)))
					res.add(l2.get(i));
				//							OU
				//				for (j = 0; j < res.size(); j++)
				//					if (l2.get(i).equals(res.get(j)))
				//						break;
				//				if (j >= res.size())
				//					res.add(l2.get(i));
			}
		}
		return res;
	}

	public List<Integer> intersect(List<Integer> l1, List<Integer> l2) {
		List<Integer> res = null;

		if ((l1 == null) || (l2 == null))
			throw new IllegalArgumentException("ListaArranjos(s) nula(s)!");
		else {
			res = new ArrayList<>(l1.size());

			for (int i = 0; i < l1.size(); i++) {
				if (l2.contains(l1.get(i)) && !res.contains(l1.get(i)))
					res.add(l1.get(i));
			}
		}		
		return res;
	}

}

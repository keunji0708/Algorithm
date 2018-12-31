package Sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class QuickSort {
	public static void main(String args[]) throws IOException{
		ArrayList<Integer> list = new ArrayList<Integer>();		
		BufferedReader br = new BufferedReader(new FileReader("data04.txt"));
		String line = br.readLine();
		
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line, ",");
			while (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				list.add(num);
			}
			line = br.readLine();
		}
		quickSort(list, 0, list.size() - 1);
		
		for(int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + ",");
			}
		}
		
		br.close();
	}
	
	public static void quickSort(ArrayList<Integer> list, int p, int r) {
		if (p < r) {
			int q = partition(list, p, r);
			quickSort(list, p, q - 1);
			quickSort(list, q + 1, r);
		}
	}
	
	public static int partition(ArrayList<Integer> list, int p, int r) {
		int x = list.get(r);
		int i = p - 1;
		for (int j = p; j <= r - 1; j++) {
			if (list.get(j) <= x) {
				i = i + 1;
				int temp = list.get(i); 
				list.set(i, list.get(j));
				list.set(j, temp);
			}
		}
		i = i + 1;
		int temp = list.get(i); 
		list.set(i, list.get(r));
		list.set(r, temp);
		return i; 
	
	}
}

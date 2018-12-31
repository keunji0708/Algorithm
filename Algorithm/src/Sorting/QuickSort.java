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
		//quickSort();
		
		for(int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + ",");
			}
		}
	}
}

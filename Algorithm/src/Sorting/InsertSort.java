package Sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InsertSort {
	public static void main(String args[]) throws IOException{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("data02.txt"));
			String line = br.readLine();
			
			while(line != null) {
				StringTokenizer st = new StringTokenizer(line,",");
				while(st.hasMoreTokens()) {
					int temp = Integer.parseInt(st.nextToken());
					list.add(temp);
				}
				line = br.readLine();
			}
	
			insertSort(list);

			int count = 0;
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%6d,", list.get(i));
				count++;
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}
			
			br.close();
			
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertSort(ArrayList<Integer> list) {
		int i = 0;
		int j = 0;
		int key = 0;
		
		for (j = 1; j < list.size(); j++) {
			key = list.get(j);
			i = j - 1;
			for ( ; i >= 0 && list.get(i) > key ; i--) {
				list.set(i+1, list.get(i));
			}
			list.set(i+1, key);
		}
	}
}

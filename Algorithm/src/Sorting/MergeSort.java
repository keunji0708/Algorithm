package Sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MergeSort {
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
			
		//	long start = System.nanoTime();
		//	mergeSort(list);
		//	long end = System.nanoTime();
		//	long term = end - start;
			
			int count = 0;
			for (int i = 0; i < list.size(); i++) {
				System.out.printf("%6d,", list.get(i));
				count++;
				if (count == 10) {
					System.out.println();
					count = 0;
				}
			}
			
		//	System.out.println("Merge time : " + term/1000000.0);
			
			br.close();
			
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

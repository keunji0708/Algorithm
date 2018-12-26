package Sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class InsertionSort {
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
			
			long start = System.nanoTime();
			insertionSort(list);
			long end = System.nanoTime();
			long term = end - start;
			
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + ",");
			}
			
			System.out.println("Inserting time : " + term/1000000.0);
			
			br.close();
			
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertionSort(ArrayList<Integer> list) {
		int i = 0;
		int j = 0;
		int key = 0;
	}
}

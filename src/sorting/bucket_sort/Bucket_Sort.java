package sorting.bucket_sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bucket_Sort {

	public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
		
		int[] arr = new int[100];
		Random rand = new Random();
		for(int i = 0; i < 100; i++) {
			arr[i] = rand.nextInt(100) + 100;
		}
		
		printArray(arr);
		bucket_sort(arr);

	}

	public static void bucket_sort(int[] arr) {
		
		int no_of_buckets = (int) Math.floor(Math.sqrt(arr.length));
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		for(int value:arr) {
			if(value > max) {
				max = value;
			}else if(value < min) {
				min = value;
			}
		}
		
		ArrayList<Integer>[] buckets = new ArrayList[no_of_buckets];
		
		//initialize the empty buckets
		for(int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		
		for(int value:arr) {
			int bucket_number = (int)Math.ceil((value * no_of_buckets) / max);
			System.out.println("Bucket Number: " + bucket_number);
			buckets[bucket_number-1].add(value);
		}
		
		
		//sort buckets
		for(ArrayList<Integer> bucket: buckets) {
			Collections.sort(bucket);
		}
		
		//concatenate buckets
		int index = 0;
		for(ArrayList<Integer>bucket: buckets) {
			for(int value:bucket) {
				arr[index] = value;
				index++;
			}
		}
		
	}
	
	public static void printArray(int[] arr) {
		int tmp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
			tmp++;
			if(tmp == 20) {
				System.out.println();
				tmp = 0;
			}
		}	
	}

}

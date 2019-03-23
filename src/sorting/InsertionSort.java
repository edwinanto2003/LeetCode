package sorting;

public class InsertionSort {

	public void Sort(int[] seq){
		int j;
		int key;
				
		for(int i = 1; i < seq.length; i++ ){			
			key = seq[i];
			
			 j = i-1;
			while(j >= 0 && seq[j] > key){
				seq[j+1] = seq[j];
				j--;
			}
			seq[j+1] = key;
		}
		
		for(int i = 0; i < seq.length; i++)
			System.out.println(seq[i]);
		
	}
}

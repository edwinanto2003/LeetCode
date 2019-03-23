package sorting;

/**
 * A class to demonstrate the merge sort program
 * 
 * @author edwin
 */

public class MergeSort{	
	
	public void Sort(int[] seq,int first,int last){
		int middle;
		if(first<last){
			middle = (int)Math.floor((first+last)/2);
			
			Sort(seq,first,middle);
			Sort(seq,middle+1,last);
			Merge(seq,first,middle,last);			
		}		
	}	

	/**
	 * 
	 * @param seq
	 * @param first
	 * @param middle
	 * @param last
	 */
	private void Merge(int[] seq, int first, int middle, int last) {
		
		int n1 = middle - first +1;
		int n2 = last - middle;
		
		int[] Left = new int[n1+1];
		int[] Right = new int[n2+1];
		
		for(int i = 0; i < n1; i++)
			Left[i] = seq[first + i];
		Left[n1] = Integer.MAX_VALUE; 
		
		for(int i = 0; i < n2; i++)
			Right[i] = seq[middle + i + 1];
		Right[n2] = Integer.MAX_VALUE;
		
		int i =0;
		int j =0;
		
		for(int k = first;k<=last;k++)
		{
			if(Left[i]<=Right[j])
				{ seq[k] = Left[i];i++;}
			else 
				{ seq[k] = Right[j];j++;}
		}
	}
}

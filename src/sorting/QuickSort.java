package sorting;

public class QuickSort {	
	
	public void Sort(int[] seq, int first, int last){
		int middle;
		if(first < last)
		{
			middle = Partition(seq,first,last);
			Sort(seq,first, middle -1);
			Sort(seq,middle+1,last);
		}
	}
	
	public int Partition(int[] seq,int first, int last){
		int i, pivot;
		
		i = first - 1;
		pivot = seq[last];
		int temp;
		for(int j= first; j<last;j++)
		{
			if(seq[j]<=pivot)
			{
				i++;
				temp = seq[i];
				seq[i] = seq[j];
				seq[j] = temp;
			}
		}
		seq[last] = seq[i+1];
		seq[i+1] = pivot;
		
		return i+1;
	}
}

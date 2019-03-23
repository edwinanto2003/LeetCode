package sorting;

public class BubbleSort {

	public void SortAsc(int[] seq){
		int temp;
		for(int i = 0 ; i <seq.length-1;i++)
			for(int j = seq.length - 1;j>i;j--){
				if(seq[j]<seq[j-1]){
					temp = seq[j-1];
					seq[j-1] = seq[j];
					seq[j] = temp;
				}
			}
	}
	
	public void SortDesc(int[] seq){
		int temp;
		
			for(int i = seq.length - 1;i>=0;i--)
				for(int j = 0 ; j < i;j++){
				if(seq[j+1]>seq[j]){
					temp = seq[j+1];
					seq[j+1] = seq[j];
					seq[j] = temp;
				}
			}
	}


	public int SortnewWay(int[] seq,int k){

		for(int i=seq.length-1;i>(seq.length-k);i--)
			for(int j = 0;j<i;j++){
				if(seq[j]>seq[j+1]){
					seq[j]^= seq[j+1];
					seq[j+1]^=seq[j];
					seq[j]^=seq[j+1];
				}
			}
		
		return seq[seq.length-k];
	}
}

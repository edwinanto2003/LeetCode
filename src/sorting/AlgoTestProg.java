package sorting;

public class AlgoTestProg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] values = new int[10];
		int i=0;
		for(int k =0; k<10;k++)		
		{	
			values[k] = (int) (Math.random()*10);// Integer.parseInt(s);
			System.out.print(values[k]+ " ");
		//	i++;

		}		

		//		InsertionSort _Is = new InsertionSort();
		//	_Is.Sort(values);

				MergeSort _Ms = new MergeSort();

				_Ms.Sort(values, 0, values.length -1);

	//	BubbleSort _Bb = new BubbleSort();
		System.out.println();
		//int val = 
	//	_Bb.SortDesc(values);
		System.out.println(values[values.length-3]);
		for(int j: values)
			System.out.print(j+ " ");

		//	QuickSort _Qs= new QuickSort();
		//	_Qs.Sort(values, 0, values.length -1);

		//	for(int j: values)
		//		System.out.println(j);

		//		BinarySearch _Bs = new BinarySearch();		
		//	System.out.println(_Bs.Search(values, 1));

		//	BinarySearchRecursive _BsR = new BinarySearchRecursive();
		//	System.out.println(_BsR.Search(values, 0, values.length -1 , 1));

		//	ConstructorExample _Ce = new ConstructorExample();
	}
}

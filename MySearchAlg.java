public abstract class MySearchAlg {
	//Methods
//	abstract int search(int[] array, int num);
	abstract int binSearch(int[] array, int num, int left, int right);
	
	//Print method
	public void printArray(int[] array) {
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("]");
	}
	
}
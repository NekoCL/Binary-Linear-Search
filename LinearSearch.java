public class LinearSearch extends MySearchAlg {
	//Linear search method
	public int search(int[] array, int num) {
		int n = array.length;
		
		//Loop through array and return the index if num is found
		for (int i = 0; i < n; i++) {
			if (array[i] == num) {
				return i;
			}
		}
		//Return -1 if num is not found in the array
		return -1;
	}
}
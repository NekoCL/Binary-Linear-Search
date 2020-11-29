public class BinarySearch extends MySearchAlg {
	//Binary search method
	public int binSearch(int[] array, int num, int left, int right) {
		int n = array.length;
		boolean sorted = false;
		
		//Sort array
		if (!sorted) {
			for (int i = 1; i < n; i++) {
				int key = array[i];
					
				//Find position to insert from left
				int j = i-1;
				//Sort the array
				while (j >= 0 && array[j] > key) {
					//Move element to the right to make space for key
					array[j+1] = array[j];
					j--;
				}
				//Insert key
				array[j+1] = key;
			}
			sorted = true;;
		}

		
		//Base case, no item found
		if (left < right) {
			return -1;
		}
		
		//Find mid
		int mid = left + (right - left)/2;
		
		//If num is found at mid
		if (array[mid] == num) {
			return mid;
		}
		
		//If num is smaller than mid
		if (array[mid] > num) {
			return binSearch(array, num, left, mid-1);
		} else { //num is larger than mid
			return binSearch(array, num, mid+1, right);
		}
		
	}
}
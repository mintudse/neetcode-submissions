class Solution {
	public int[] sortArray(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return nums;
        }
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    private void mergeSort(int[] nums, int l, int r) {
        if (l >= r) { // if split size is 1 -- left = right
            return;
        }
        int mid = (l + r) / 2;
        // split into sub probs -- left and right sub parts
        mergeSort(nums, l, mid);
        mergeSort(nums, mid+1, r);
        merge(nums, l, mid, r); // at each curr step
    
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        ArrayList<Integer> aux = new ArrayList<>();
    
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                aux.add(arr[i]);
                i++;
            }
            else {
                aux.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            aux.add(arr[i]);
            i++;
        }
        while (j <= r) {
            aux.add(arr[j]);
            j++;
        }

        int k = 0;
        for (i = l; i <= r; i++) { // not i = 0 because arr[0], etc could've alr been filled
            arr[i] = aux.get(k);
            k++;
        } 
    }


	
}

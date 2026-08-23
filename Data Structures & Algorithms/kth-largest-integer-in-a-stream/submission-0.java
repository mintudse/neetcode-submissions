class KthLargest {
    private int k;
    private int[] nums;
    private int size;

    public KthLargest(int k, int[] nums) throws IllegalArgumentException{
        this.k = k;
        this.nums = nums;
        size = nums.length;
    }
    
    public int add(int val) {
        // maintain sorted order
        // find kth --> go from end of array, go back kth steps
        // from last index, go to index length - kth

        if (size == nums.length){ // full array
            growIfFull();
        } 
        nums[size++] = val;

        Arrays.sort(nums);
        // System.out.println(size);

        // System.out.println("nums val" + nums[size - k]);
        // System.out.println("at 0" + nums[0]);
        // System.out.println(nums[1]);
        // System.out.println(nums[2]);
        // System.out.println("at 3" + nums[3]);


        return nums[size - k];
//[1, 2, 3, 3, 4], k = 2 
        //test case/include - if ie:array size = 1
        // then if when finding kth, if null/outofbounds,
        // return..? - assume valid actually, not happening

    }

    private void growIfFull(){
        int[] temp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++){
            temp[i] = nums[i];
        }
        nums = temp;
        // System.out.println("at 0" + nums[0]);

    }
}

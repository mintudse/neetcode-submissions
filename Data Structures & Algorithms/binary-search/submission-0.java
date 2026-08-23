/*
DISTINCT - means unique?
nums[] - ints
sorted in ascending order (low --> high)
int target
-- search for target in nums
if exists, return index
else, return -1

if represent array as a heap:
start at head
if head < target{
    if left child: is left child < target
}
// could make a binary search tree
// traverse left right to find target
  0 1 2 3 4 5
[-1,0,2,4,6,8]
  ^ L R
4 - 1 = 5 % 2 (odd)
4-0 = 4 (even) - go to next even index
4-2 = 2 (even) - go to next even index

i wonder if we can go backwards.. 
worst case... not going to be great if target is at the start.

thinking about left and right.

HINT: compare target with middle - oh that makes sense. (i tried using the ends)
^ so thats how we make decision go left right

array length - 1 + 0 (index of "left")/ 2 = index of middle
if target > mid{
    go right --> take the middle again  //recurse?
    from (mid + 1 to the end (arraylength-1):
        arraylength-1 + mid +1 / 2 = middle

    
}
else{
    go left:
    from (0 to mid)--> 0 + mid index / 2 = new middle
}

CASE:
if the value at index (i) is > target, and 
we didnt find the target beforehand, then return -1 because
we know, target isn't in the array (bc sorted).


could maybe see if go to even indices, or odd indices
^ make that choice at each choice we made. (so remake choice)

*/

class Solution {
    public int search(int[] nums, int target) {
        // target = 4
        // 2
        int mid = (nums.length - 1) / 2;
        // 4 > 2
        if (target > nums[mid]){
            // 4 > 6
            for (int i = 0; i < nums.length / 2; i++){
                // 4
                mid = ((nums.length - 1) + (mid + 1)) / 2;  // new mid
                if (target < nums[mid]){
                    mid--;
                }
            }
        }
        else if (target < nums[mid]){
            for (int i = 0; i < nums.length / 2; i++){
                mid = (0 + mid) / 2;    // new middle
                if (target > nums[mid]){
                    mid++;
                }
            }
        }
        if (target == nums[mid]){
            return mid;
        }
        return -1;
        


        /*
        
array length - 1 + 0 (index of "left")/ 2 = index of middle
if target > mid{
    go right --> take the middle again  //recurse?
    from (mid + 1 to the end (arraylength-1):
        arraylength-1 + mid +1 / 2 = middle

    
}
else{
    go left:
    from (0 to mid)--> 0 + mid index / 2 = new middle
}
        */
    }
}

class Solution {
    public int[] searchRange(int[] array, int target) {
        int[] ans = {-1,-1};
        int start = search(array, target,true);


        int end = search(array, target,false);
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    int search( int array [], int target, boolean findStartIndex){
     int ans = -1;
     int start =0;
     int end = array.length-1;
     while (start <= end ){
        int mid = start +(end - start) /2;
        if(target < array[mid]){end = mid -1;}
        else if(target > array[mid]){ start = mid+1;}
        else { // potential answer is found
        ans = mid ;
        if(findStartIndex){
            end = mid -1;
        }
        else{
            start = mid +1;
        }
        }
     }    
     return ans;
    }
}
public class array3practicequestion{

    public static boolean twicedistinct(int[] nums){
        for(int i = 0; i<nums.length-1; i++){
            for(int j = 0 ; j<nums.length;j++){
                if(nums[i] == nums[j]){
                    return true ;

                }
            }
            
        }
        return false ;

    
    
    }
    // public static void main(String[] args) {
    //     int nums [] = {1,5};
    //     System.out.println(twicedistinct(nums));

    // }


    // question 2 


     
    public static int search(int[] nums, int target) {
            int n = nums.length;
            int left = 0, right = n - 1;
    
            // Find the pivot where the array is rotated
            int pivot = 0;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    pivot = i + 1;
                    break;
                }
        }
    
            // Perform binary search in the two sorted halves
            int result = binarySearch(nums, target, 0, pivot - 1); // Left half
            if (result == -1) {
                result = binarySearch(nums, target, pivot, n - 1); // Right half
            }
    
            return result;
        }
    
    public static int binarySearch(int[] nums, int target, int start, int end) {
            for (int i = start; i <= end; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            return -1;
    }
    public static int trappedrainwater(int hieght[]){
            // calculate to left max boundary -array
            int n = hieght.length;  
            int leftmax[] = new int[n];
            leftmax[0] = hieght[0];
            for(int i = 1; i<n;i++){
                leftmax[i] = Math.max(hieght[i], leftmax[i-1]);
    
        }
            // calculate right max boundary - array
    
            int rightmax[ ] = new int[n];
            rightmax[n-1] = hieght[n-1];
            for(int i = n-2; i>=0;i--){
                rightmax[i] = Math.max(hieght[i], rightmax[i+1]);
    
            }
    
            int trappedwater = 0 ;
            for(int i = 0 ; i<n ; i++){
                int waterlevel = Math.min(leftmax[i], rightmax[i]);
                trappedwater += waterlevel - hieght[i];
    
            }
            return trappedwater;
    
            // loop
            //  watelevel = min(leftmax bound, rightmax bound )
            // trapped water = waterlevel -hieght[i]
    }
    
            public static int trap(int[] height) {
                if (height == null || height.length == 0) {
                    return 0;
                }
        
                int left = 0, right = height.length - 1;
                int leftMax = 0, rightMax = 0;
                int waterTrapped = 0;
        
                while (left < right) {
                    if (height[left] <= height[right]) {
                        if (height[left] > leftMax) {
                            leftMax = height[left];
                        } else {
                            waterTrapped += leftMax - height[left];
                        }
                        left++;
                    } else {
                        if (height[right] > rightMax) {
                            rightMax = height[right];
                        } else {
                            waterTrapped += rightMax - height[right];
                        }
                        right--;
                    }
                }
        
                return waterTrapped;
            }
        
            public static void main(String[] args) {
                int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
                System.out.println("Water trapped: " + trap(height));
            }



}
        
 
    
    
        
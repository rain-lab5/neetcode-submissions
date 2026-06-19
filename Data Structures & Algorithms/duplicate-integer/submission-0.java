class Solution {
    public static boolean hasDuplicate(int[] nums)
     {
        
     if(nums == null || nums.length == 0) return false;
     Arrays.sort(nums);
     for(int i =0;i<nums.length - 1;i++)
     {
        if(nums[i] == nums[i+1]) return true;
     }
     return false;
    }
    public static void main(String[] argc)
    {
        int[] nums = {1,2,2,3};
        

        boolean result = hasDuplicate(nums);
    }
}
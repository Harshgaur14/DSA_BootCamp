public class Arraymaxindex {
    
    
    
    public static void main(String[] args) {
        int[] nums={1,5,44,8,9};
        System.out.println(maxelementindex(nums));
    }
   static int maxelementindex(int[] nums)
   {
    int max=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[max]<nums[i])
        {
            max=i;
        }
    }
    return max;
   }

}

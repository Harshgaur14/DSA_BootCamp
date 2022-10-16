public class Arraymax {
    public static void main(String[] args) {
        int[] nums={1,5,44,8,9};
    System.out.println(maxelement(nums));

    }
    static int maxelement(int[] nums)
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        return max;
    }
}

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] nums={99,34,2,78,5,14};
        selection(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            int last=nums.length-i-1;
            int maxindex=getMaxindex(nums,0,last);
            swapped(nums,maxindex,last);
        }
    }

    static void swapped(int[] nums,int first,int last)
    {
        int temp=nums[first];
        nums[first]=nums[last];
        nums[last]=temp;
    }
    static int getMaxindex(int[] nums,int first,int last)
    {
        int max=first;
        for(int i=first;i<=last;i++)
        {
            if(nums[max]<nums[i])
            {
                max=i;
            }
        }
        return max;

    }


}

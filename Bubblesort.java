import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] nums={99,3,56,1,10,5};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
    }


    static void bubble(int[] nums)
    {
        boolean swapped;
        for(int i=0;i<nums.length;i++)
        {
            swapped=false;
            for(int j=1;j<=nums.length-1-i;j++)
            {
                if(nums[j-1]>nums[j])
                {
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                break;
            }
        }
       
    }
}

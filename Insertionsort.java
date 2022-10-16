import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] nums={44,2,5,14,9,64};
        insertionn(nums);
        System.out.println(Arrays.toString(nums));

    }
    static int[] insertionn(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                    if(nums[j]<nums[j-1])
                    {
                        int temp=nums[j-1];
                        nums[j-1]=nums[j];
                        nums[j]=temp;
                    }
                    else{
                        break;
                    }
            }
        }
        return nums;
    }
}

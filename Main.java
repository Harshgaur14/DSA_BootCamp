import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] nums={2,3,4,5};
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void change(int[] arr)
    {
        arr[0]=99;
    }
}
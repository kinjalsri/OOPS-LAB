public class nonzero 
{
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        int n= nums.length;
        int[] newarr = new int[n];

        int index = 0;
        for(int i=0; i<nums.length;i++)
        {
           if(nums[i]!=0)
             {
                newarr[index++]=nums[i];
             }
            }
             while (index < nums.length) {
                newarr[index++] = 0;
            }
        
        for(int i=0; i<nums.length;i++)
        {
            System.out.print(newarr[i]);
        }
}
}
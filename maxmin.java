public class maxmin 
{
    public static void main(String args[])
    {
        int[] nums = {1, 5, 7, 2, 9, 3};
        int max= 0;
        int min=1;
        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]>max)
            {
             max= nums[i];
            }
             else if(nums[i]<min)
             {
             min= nums[i];
             }

             else
             continue;
        }

        System.out.println("max element is"+ max);
        System.out.println("min element is"+ min);
        




    }
    











    

}

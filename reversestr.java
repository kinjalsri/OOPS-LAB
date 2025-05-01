public class reversestr
{
    public static void main(String[] args) 
    {
        String s = "This is decent";
        String[] words = s.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) 
        {
            result += words[i];
            if (i > 0) result += " "; 

        System.out.println(result); 
    }
}
}
  public class CheckPalindrome{
     public static void main(String[] args){
         Palindrome p=new Palindrome();
         for(int num=100;num<=300;num++)
         {
             if(p.ispal(num)==true)
             System.out.println(num);
        }
    }
    public static class Palindrome{
    public static boolean ispal(int n)
    {
        int copy=n;
        int r=0;
        while(n!=0)
        {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if (r==copy)
        return true;
        else
        return false;
    }
}
}
    
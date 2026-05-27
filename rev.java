public class rev{
    public static void main(String[] args){
        int digits=0,rev=0,n=321;
        while(n>0)
    {
    digits=n%10;
    rev=rev*10+digits;
    n=n/10;
    }
    System.out.println("reverse is: "+rev);
}}
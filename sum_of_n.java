import java.util.*;
class sum_of_n
{
    void sum(int n)
    {
        int i=1;
        int ans=0;
        while(i<=n)
        {
            ans=ans+i;
            i++;
        }
        System.out.println(ans);


    }
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        sum_of_n t=new sum_of_n();
        t.sum(n);
    }

    
}

import java.util.*;
class add
{
    void sum(int a,int b)
    {
        System.out.println(a+b);
    }
    public static void main(String[] args)
    {
        int x;
        int y;
        
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        add a=new add();
        a.sum(x,y);
        
    } 
  }

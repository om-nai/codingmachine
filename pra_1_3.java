import java.util.Scanner;
public class pra_1_3
{
    public static void main(String[] args)
    {
        int c=0;
        int d=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lastdigit(a,b));
    }
    public static boolean lastdigit(int a,int b)
    {
        int c,d;
        c = a % 10;
        d = b % 10;
        return c==d;//return value ine either true or false
    }
}


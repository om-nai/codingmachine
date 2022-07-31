import java.util.Scanner;
public class pra_1_7 {
    public static void main(String[] args) {

        for(int i=1;i<=8;i++) // loop of number of raws
        {
            for(int j=8;j>i;j--) // first empty triangle
            {
                System.out.print("    ");

            }
            int k=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+"    ");
                k = k * 2;
            }
            k=k/4;
            for (int j=1;j<i;j++)
            {
                System.out.print(k+"    ");
                k = k / 2;
            }
                System.out.println();
        }
    }
}


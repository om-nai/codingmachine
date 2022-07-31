import java.util.Scanner;
public class pra_1_5
 {
    public static void main(String[] args) {
        String a="xxcaazz";
        String b="xxbaaz";
        int c = stringMatch(a,b);
        System.out.println(c);
    }
    public static int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String aSub = a.substring(i, i + 2);
           // System.out.println("asub : " + aSub);
            String bSub = b.substring(i, i + 2);
            if (aSub.equals(bSub))
                count++;
        }
        return count;
    }
}

import java.util.*;
public class pra_1_9 {

    public static void main(String args[]) {

        int a[][] = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
        // ansswer of phsudocode

        System.out.println(check(a));
    }

    public static boolean check(int arr[][]) {
        int i, j;
        int count[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int count1[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        boolean b = true;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {

                if (count[arr[j][i]] > i) {
                    b = false;
                    return b;
                }
                if (count1[arr[i][j]] > i) {
                    b = false;
                    return b;
                }
                count1[arr[i][j]]++;
                count[arr[j][i]]++;
            }

        }
        return b;
    }

}

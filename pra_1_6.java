import java.util.*;
public class pra_1_6
 {
    public static void main(String[] args) {
        String[] s= {"a","b","c","a"};
        String a = "a";
        int cout =0;
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals(a))
            {
                cout++;
            }
        }
        int j=0;
        String[] sc = new String[s.length - cout];
        for(int i=0;i<s.length;i++) {
            if (!s[i].equals(a)) {
                sc[j] = s[i];
                j++;
            }
        }
            System.out.println(sc);

    }
}

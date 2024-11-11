package Map;

import java.util.HashSet;
import java.util.Iterator;

public class Q2 {
    public static void main(String[] args) {
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(107);
        s1.add(106);
        s1.add(105);
        s1.add(104);
        s1.add(103);
        s1.add(103);

        System.out.println(s1);
        Iterator<Integer> i=s1.iterator();  
        
        while (i.hasNext()) {
            System.out.println(i.next());            
        }
        
    }
}


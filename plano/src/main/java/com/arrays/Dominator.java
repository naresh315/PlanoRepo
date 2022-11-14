
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/
import java.util.*;

public class Dominator
{
    public static  int solution(int A[]) {
         int max =A.length;
          Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int half = max/2;
        for(int i=0;i<max;i++) {
            if(hm.containsKey(A[i])) {
                int occur = hm.get(A[i])+1;
                System.out.println(occur);
                System.out.println(half);
                if(occur>(half)) {
                    return A[i];
                }
                hm.put(A[i],occur);
            } else {
                hm.put(A[i],1);
            }
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int A[] ={5,5,5,1,2,1,1};
        
        System.out.println(" dominator element "+solution(A));
    }
}

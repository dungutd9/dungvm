package repeatexercise;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dungvmde130031
 */
public class RepeatExercise {

    /**
     * @param args the command line arguments
     */
    public static String repeat(String s) {
        String[] s1 = s.split("\\s");
        ArrayList<String> s2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String word : s1) {
            s2.add(word);
        }
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 0; i < s2.size(); i++) {
            for (int j = i + 1; j < s2.size(); j++) {
                if (s2.get(i).equals(s2.get(j))) {
                    arrayList.add(j);
                    s2.set(i, "REPEAT");
                } else {
                    break;
                }
            }
        }
        for (Integer integer : arrayList) {
            s2.set(integer, "");
        }
        for (String string : s2) {
            if (!string.equals("")) {
                result = result + string + " ";
            }
        }
        result = result.replace("\\s+", "");
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Case 1: I want to to go to the the the zoo");
        System.out.println("Expect output: I want REPEAT go to REPEAT zoo");
        System.out.println("Real output: " + repeat("I want go go to the the the zoo"));
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Case 2: I want to go go to the zoo zoo zoo");
        System.out.println("Expect output: I want to REPEAT to the REPEAT");
        System.out.println("Real output: " + repeat("I want to REPEAT to the REPEAT"));
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Case 3: I I I want want want to go to the zoo");
        System.out.println("Expect output: I want REPEAT go to REPEAT zoo");
        System.out.println("Real output: " + repeat("I want REPEAT go to REPEAT zoo"));
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Case 4: I want to to go go to to the zoo");
        System.out.println("Expect output: I want REPEAT REPEAT REPEAT the zoo");
        System.out.println("Real output: " + repeat("I want REPEAT REPEAT REPEAT the zoo"));
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Case 5: I want to go go go go to the the the the zoo");
        System.out.println("Expect output: I want to REPEAT to REPEAT zoo");
        System.out.println("Real output: " + repeat("I want to REPEAT to REPEAT zoo"));
        ///////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Case 6: I want to 1 1 to  2 2 2 the zoo zoo");
        System.out.println("Expect output: I want to REPEAT to REPEAT the REPEAT");
        System.out.println("Real output: " + repeat("I want to REPEAT to REPEAT the REPEAT"));
        
        // test
        System.out.println(repeat("Enter the string you want here to test it!"));    
    }

}

package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static List<String> calPermutations(String input) {
        if(input.length()==2){
            List<String> permutations  = new ArrayList<>();
            permutations.add(input);
            permutations.add(input.substring(1,2)+input.substring(0,1));
            return permutations;
        }
        if(input.length()==3){
            List<String> permutations  = new ArrayList<>();
            List<String> tempPermutations = calPermutations(removeOne(input,0));
            permutations.add(input.charAt(0)+tempPermutations.get(0));
            permutations.add(input.charAt(0)+tempPermutations.get(1));
            tempPermutations = calPermutations(removeOne(input,1));
            permutations.add(input.charAt(1)+tempPermutations.get(0));
            permutations.add(input.charAt(1)+tempPermutations.get(1));
            tempPermutations = calPermutations(removeOne(input,2));
            permutations.add(input.charAt(2)+tempPermutations.get(0));
            permutations.add(input.charAt(2)+tempPermutations.get(1));
            return permutations;
        }
        return Arrays.asList(input);
    }

    private static String removeOne(String input,int index) {
        return input.substring(0,index)+input.substring(index+1);
    }
}

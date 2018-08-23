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
        return Arrays.asList(input);
    }
}

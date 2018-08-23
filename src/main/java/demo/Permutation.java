package demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Permutation {
    static List<String> calPermutations(String input) {
        if (input.length() == 1) {
            return Collections.singletonList(input);
        }
        List<String> permutations = new ArrayList<>();
        for (int index = 0; index < input.length(); index++) {
            List<String> tempPermutations = calPermutations(removeOne(input, index));
            for (String tempPermutation : tempPermutations) {
                permutations.add(input.charAt(index) + tempPermutation);
            }
        }
        return permutations;
    }

    private static String removeOne(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1);
    }
}

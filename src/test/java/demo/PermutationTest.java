package demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class PermutationTest {
    @Test
    public void should_return_a_when_chars_is_a(){
        //given
        String input = "a";
        //when
        List<String> permutations = Permutation.calPermutations(input);
        //then
        assertThat(permutations,is(Arrays.asList("a")));
    }
    @Test
    public void should_return_ab_ba_when_chars_is_ab(){
        //given
        String input = "ab";
        //when
        List<String> permutations = Permutation.calPermutations(input);
        //then
        assertThat(permutations,is(Arrays.asList("ab","ba")));
    }
    @Test
    public void should_return_abc_acb_bac_bca_cab_cba_when_chars_is_abc(){
        //given
        String input = "abc";
        //when
        List<String> permutations = Permutation.calPermutations(input);
        //then
        assertThat(permutations,is(Arrays.asList("abc","acb","bac","bca","cab","cba")));
    }
    @Test
    public void should_return_size_is_24_when_chars_is_abcd(){
        //given
        String input = "abcd";
        //when
        List<String> permutations = Permutation.calPermutations(input);
        //then
        assertThat(permutations.size(),is(24));
    }

}

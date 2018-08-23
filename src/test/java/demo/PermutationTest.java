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
}

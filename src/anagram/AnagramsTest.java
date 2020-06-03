package anagram;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class AnagramsTest {

	private Anagrams anagram;

	@Before
	public void setUp() {
		anagram = new Anagrams();
	}

	@Test
	public void return_false_when_inputs_are_of_different_length() {
		final boolean isLengthMatch = anagrams("input", "inpu");

		assertFalse(isLengthMatch);
	}

	@Test
	public void return_true_when_inputs_are_of_same_length() {
		final boolean isLengthMatch = anagrams("input", "input");

		assertTrue(isLengthMatch);
	}

	@Test
	public void return_false_when_any_input_null() {
		final boolean isAnagram = anagrams(null, "tushar");

		assertFalse(isAnagram);
	}

	@Test
	public void return_false_when_all_input_null() {
		final boolean isAnagram = anagrams(null, null);

		assertFalse(isAnagram);
	}

	@Test
	public void return_false_when_input_does_not_have_alphabets_only() {
		final boolean isAnagram = anagrams("alpa", "1231");

		assertFalse(isAnagram);
	}

	@Test
	public void return_false_when_input_is_alphanumeric() {
		final boolean isAnagram = anagrams("alpa", "123A");

		assertFalse(isAnagram);
	}

	@Test
	public void return_false_when_characters_are_not_same_in_inputs() {
		boolean isAnagram = anagrams("alpa", "albh");

		assertFalse(isAnagram);
	}

	private boolean anagrams(final String input1, final String input2) {
		return anagram.isAnagram(input1, input2);
	}

	@Test
	public void positiveTestcase1() {
		assertTrue(anagram.isAnagram("word", "wrdo"));
	}

	@Test
	public void positiveTestcase2() {
		assertTrue(anagram.isAnagram("mary", "army"));
	}

	@Test
	public void positiveTestcase3() {
		assertTrue(anagram.isAnagram("stop", "tops"));
	}

	@Test
	public void positiveTestcase4() {
		assertTrue(anagram.isAnagram("boat", "btoa"));
	}

}
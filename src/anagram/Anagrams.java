package anagram;


public class Anagrams {
	public boolean isAnagram(String input1, String input2) {
		if (input1 == null || input2 == null)
			return false;
		int[] letterCount = new int[126];
		for (char ch : input1.toCharArray()) {
			letterCount[ch]++;
		}

		for (char ch : input2.toCharArray()) {
			letterCount[ch]--;
		}

		for (int count : letterCount) {
			if (count != 0)
				return false;
		}
		return true;
	}
}

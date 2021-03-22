package Lab8_4;

import java.util.Arrays;
import java.util.List;

public class CountWords {
	public static void main(final String[] args) {
		CountWords countWords = new CountWords();

		List<String> words = Arrays.asList("Cat", "Cad", "Dad", "Card", "Car", "Cast", "Cash");

		int count = countWords.countWords(words, 'C', 'd', 4);
		System.out.println(count);

	}

	public boolean starts(String word, char ch) {
		return word.startsWith(Character.toString(ch));
	}

	public boolean contains(String word, char ch) {
		return word.contains(Character.toString(ch));
	}

	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream() // convert list to stream
				.filter(word -> word.startsWith(Character.toString(c)) && !word.contains(Character.toString(d))
						&& word.length() == len)
				.count();
	}
}

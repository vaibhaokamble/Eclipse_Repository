package vaibhao.vk;

import java.util.*;

public class StringApplication5 {
	public static void main(String[] args) {
		ArrayList<String> alStopWord = new ArrayList<String>();
		String stopWords[] = { "is", "was", "then", "a", "that", "where", "are", "but", "am", "like", "my", "i" };
		for (String s : stopWords) {
			alStopWord.add(s);
		}
		String steam[] = new String[] { "ing", "noon", "ry" };
		ArrayList<String> streamColl = new ArrayList<String>();
		for (String s : steam) {
			streamColl.add(s);
		}
		String[] str = new String[] { "good morning india", "good afternoon india", "inida is my contry", "i am indian",
				"i like india" };

		ArrayList<String> newArrList = new ArrayList<String>();

		for (String s : str) {
			String words[] = s.split(" ");
			String w = "";
			for (int i = 0; i < words.length; i++) {
				if (!(alStopWord.contains(words[i]))) {
					w = w + words[i] + " ";
				}

			}

			newArrList.add(w);
		}

		System.out.println("After remove stopword");
		for (String data : newArrList) {
			System.out.println(data);

		}
	}
}// good morn india , good after india ,india county , indian india

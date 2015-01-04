package reverseWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		String line;
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		while ((line = br.readLine()) != null) {
			Scanner in = new Scanner(line);
			Stack<String> wordStack = new Stack<String>();
			while (in.hasNext()) {
				wordStack.push(in.next());
			}
			while (wordStack.size() > 1) {
				System.out.print(wordStack.pop() + " ");
			}
			System.out.println(wordStack.pop());

		}

	}
}
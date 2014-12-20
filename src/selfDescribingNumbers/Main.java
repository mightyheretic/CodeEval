package selfDescribingNumbers;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		String in;
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(args[0]));
			while ((in = br.readLine()) != null) {
				boolean pass = true;
				char[] nums = in.toCharArray();
				int[] count = new int[10];
				int[] pattern = new int[10];
				if (nums.length > 89 || nums.length == 0)
					pass = false;
				for (int i = 0; i < nums.length; i++) {
					int current = Character.getNumericValue(nums[i]);
					count[current]++;
					if (i < 10) {
						if (!pass)
							break;
						pattern[i] = current;
					} else if (count[current] > pattern[current]) {
						pass = false;
						break;
					}
				}
				if (pass) {
					if (count[0] == pattern[0] && count[1] == pattern[1]
							&& count[2] == pattern[2] && count[3] == pattern[3]
							&& count[4] == pattern[4] && count[5] == pattern[5]
							&& count[6] == pattern[6] && count[7] == pattern[7]
							&& count[8] == pattern[8] && count[9] == pattern[9])
						System.out.println("1");
					else
						System.out.println("0");
				} else
					System.out.println("0");
			}
		} catch (Exception e) {
		}
	}
}

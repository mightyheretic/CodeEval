package jugglingWithZeros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		StringBuffer preOut;
		int length = 0;
		String line;
		Scanner in = null;
		while ((line = br.readLine()) != null) {
			preOut = new StringBuffer(30);
			in = new Scanner(line);
			boolean begin = true;
			while (in.hasNext()) {
				if (in.next().length() > 1) {
					begin = false;
					length = in.next().length();
					while (length > 0) {
						preOut.append("1");
						length--;
					}
				} else if (!begin) {
					length = in.next().length();
					while (length > 0) {
						preOut.append("0");
						length--;
					}
				} else {
					in.next();
				}

			}
			if (begin)
				preOut.append("0");
			BigInteger big = new BigInteger(preOut.toString(), 2);
			System.out.println(big.toString());
		}
	}
}
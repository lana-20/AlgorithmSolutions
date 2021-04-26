import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the stepPerms function below.
	static int stepPerms(int n) {
		if (n < 0) {
			return 0;
		} else if (n <= 1) {
			return 1;
		}
		int[] perms = new int[n + 1];
		perms[0] = 1;
		perms[1] = 1;
		perms[2] = 2;
		for (int i = 3; i <= n; i++) {
			perms[i] = perms[i - 1] + perms[i - 2] + perms[i - 3];
		}
		return perms[n];
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int s = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int sItr = 0; sItr < s; sItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int res = stepPerms(n);

			bufferedWriter.write(String.valueOf(res));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}

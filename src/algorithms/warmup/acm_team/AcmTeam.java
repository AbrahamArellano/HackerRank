package algorithms.warmup.acm_team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AcmTeam {

	public static void main(String[] args) {
		Data data = reader();

		processor(data);
		// if (data.data != null) {
		// for (int i = 0; i < data.N; i++) {
		// for (int j = 0; j < data.M; j++) {
		// System.out.print(data.data[i][j] + " ");
		// }
		// System.out.println();
		// }
		// }
	}

	private static void processor(Data data) {
		List<Integer> maxCombination = new ArrayList<>();
		for (int i = 0; i < data.N; i++) {
			for (int j = i+1; j < data.N; j++) {
				int amountTopics = 0;
				for (int h = 0; h < data.M; h++) {
					if (data.data[i][h] == 1 || data.data[j][h] == 1) {
						amountTopics++;
					}
				}
				maxCombination.add(amountTopics);
			}
		}
		int maxTopics = 0;
		int amountTeams = 0;
		for (int i = 0; i < maxCombination.size(); i++) {
			if (maxTopics < maxCombination.get(i)) {
				maxTopics = maxCombination.get(i);
				amountTeams = 1;
			} else if (maxTopics == maxCombination.get(i)) {
				amountTeams++;
			}
		}
		System.out.println(maxTopics);
		System.out.println(amountTeams);
	}

	/**
	 * @return
	 */
	private static Data reader() {
		Scanner scan = new Scanner(System.in);
		final String nextLine = scan.nextLine();
		final String[] split = nextLine.split(" ");
		int n = Integer.valueOf(split[0]);
		int m = Integer.valueOf(split[1]);
		Data data = new Data(n, m);
		for (int i = 0; i < n; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < m; j++) {
				data.data[i][j] = line.charAt(j) - 48;
			}
		}
		scan.close();
		return data;
	}

}

class Data {
	public int N;
	public int M;
	public int[][] data;

	public Data(int n, int m) {
		N = n;
		M = m;
		data = new int[N][M];
	}
}
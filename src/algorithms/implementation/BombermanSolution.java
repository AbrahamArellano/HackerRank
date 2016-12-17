package algorithms.implementation;

import java.util.LinkedList;
import java.util.Scanner;

public class BombermanSolution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		String firstLine = scan.nextLine();
		String[] line = firstLine.split(" ");
		int r = Integer.valueOf(line[0]);
		int c = Integer.valueOf(line[1]);
		int seconds = Integer.valueOf(line[2]);
		LinkedList<Cell> toExplode = new LinkedList<>();
		LinkedList<Cell> emptyList = new LinkedList<>();

		Cell[][] matrix = new Cell[r][c];

		for (int i = 0; i < r; i++) {
			String matLine = scan.nextLine();
			char[] lineofMatrix = matLine.toCharArray();
			for (int j = 0; j < c; j++) {
				Cell cell = new Cell(i, j);
				if (lineofMatrix[j] == 'O') {
					cell.time = 3;
					toExplode.add(cell);
				} else {
					cell.time = -1;
					emptyList.add(cell);
				}
				matrix[i][j] = cell;
			}
		}

		int time = 1;

		boolean wait = false;

		if (seconds % 2 == 0) {
			seconds = 2;
		} else {
			// reduction.
			int tmpTime = seconds;
			while (seconds > 4) {
				tmpTime = seconds;
				seconds -= 4;
			}
			if (tmpTime == 5) {
				seconds = 5;
			} else if (tmpTime == 7) {
				seconds = 7;
			}
		}

		while (time < seconds) {
			time++;
			if (!wait) {
				// plant bombs. No explosion.
				int size = emptyList.size();
				for (int i = 0; i < size; i++) {
					Cell cellToExplode = emptyList.removeFirst();
					cellToExplode.time = time + 3;
					toExplode.add(cellToExplode);
				}

				wait = true;
			} else {
				// check bomb
				while (toExplode.size() > 0
						&& ((toExplode.getFirst().time - time <= 0) || (toExplode.getFirst().time == -1))) {
					if (toExplode.getFirst().time > 0) {
						// explode all like this.
						Cell bomb = toExplode.removeFirst();
						bomb.time = -1;
						emptyList.add(bomb);
						// explode surroundings.
						// i -1
						int iu = bomb.i - 1;
						if (iu >= 0) {
							// if there is a bomb. Deactivate
							if (matrix[iu][bomb.j].time >= 0 && matrix[iu][bomb.j].time != time) {
								matrix[iu][bomb.j].time = -1;
								// int pos =
								// toExplode.indexOf(matrix[iu][bomb.j]);
								// toExplode.remove(pos);
								emptyList.add(matrix[iu][bomb.j]);
							}
						}
						// i +1
						int id = bomb.i + 1;
						if (id < r) {
							// if there is a bomb. Deactivate
							if (matrix[id][bomb.j].time >= 0 && matrix[id][bomb.j].time != time) {
								matrix[id][bomb.j].time = -1;
								// int pos =
								// toExplode.indexOf(matrix[id][bomb.j]);
								// toExplode.remove(pos);
								emptyList.add(matrix[id][bomb.j]);
							}
						}
						// j -1
						int ju = bomb.j - 1;
						if (ju >= 0) {
							// if there is a bomb. Deactivate
							if (matrix[bomb.i][ju].time >= 0 && matrix[bomb.i][ju].time != time) {
								matrix[bomb.i][ju].time = -1;
								// int pos =
								// toExplode.indexOf(matrix[bomb.i][ju]);
								// toExplode.remove(pos);
								emptyList.add(matrix[bomb.i][ju]);
							}
						}
						// j +1
						int jd = bomb.j + 1;
						if (jd < c) {
							// if there is a bomb. Deactivate
							if (matrix[bomb.i][jd].time >= 0 && matrix[bomb.i][jd].time != time) {
								matrix[bomb.i][jd].time = -1;
								// int pos =
								// toExplode.indexOf(matrix[bomb.i][jd]);
								// toExplode.remove(pos);
								emptyList.add(matrix[bomb.i][jd]);
							}
						}
					} else {
						toExplode.removeFirst();
					}
				}
				// clean up
				int siz = toExplode.size();
				LinkedList<Cell> tmp = new LinkedList<>();
				for (int i = 0; i < siz; i++) {
					Cell tmpCell = toExplode.removeFirst();
					if (tmpCell.time >= 0) {
						tmp.add(tmpCell);
					}
				}
				toExplode = tmp;
				wait = false;
			}
		}

		scan.close();

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (matrix[i][j].time < 0) {
					System.out.print(".");
				} else {
					System.out.print("O");
				}
			}
			System.out.print("\n");
		}
	}

	static void printMatrix(Cell[][] matrix, int r, int c) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (matrix[i][j].time < 0) {
					System.out.print(".");
				} else {
					System.out.print("O");
				}
			}
			System.out.print("\n");
		}
	}

	static class Cell {
		int i;
		int j;
		int time;

		public Cell(int i, int j) {
			this.i = i;
			this.j = j;
		}

		public Cell(int i, int j, int time) {
			this.i = i;
			this.j = j;
			this.time = time;
		}

		@Override
		public boolean equals(Object b) {
			return this.i == ((Cell) b).i && this.j == ((Cell) b).j;
		}

		@Override
		public int hashCode() {
			return new String(i + "-" + j).hashCode();
		}
	}

}

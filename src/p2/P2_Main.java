package p2;

import java.util.Arrays;

public class P2_Main {
	public static int[][] grid = {{0,-1,0},{0,0,-1},{0,0,-1}}; 
	
	public static void main(String[] args) {
		benachbart();
		System.out.println(Arrays.toString(grid[0]));
		System.out.println(Arrays.toString(grid[1]));
		System.out.println(Arrays.toString(grid[2]));
	}
	
	public static void benachbart() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if(grid[i][j] != -1) {
					int sum = nachbarSumme(i,j);
					grid[i][j] = sum;
				}
			}
		}
	}
	
	public static int nachbarSumme(int i, int j) {
		int sum = 0;
		for(int a = i - 1; a <= i + 1; a++) {
			for(int b = j - 1; b <= j + 1; b++) {
				if(a != i || b != j) {
					try {
						if(grid[a][b] == -1) {
							sum += 1;
						}
					}catch(ArrayIndexOutOfBoundsException e) {
						sum += 0;
					}
				}
			}
		}
		return sum;
	}
}

//2016110056 박승원
import java.util.Scanner;

public class problem1 {
	private static int[][] transpose(int[][] arr) {
		int y = arr.length;
		int x = arr[0].length;
		int[][] ar = new int[x][y];
		for(int j=0; j<y; j++) for(int i=0; i<x; i++) ar[i][j] = arr[j][i];
		return ar;
	}
	private static void print_array(int[][] arr) {
		int y = arr.length;
		int x = arr[0].length;
		for(int j=0; j<y; j++) {
			for(int i=0; i<x; i++) System.out.print(arr[j][i] + " ");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] ar = {{1,2,3},{4,5,6}};//new int[2][3];
		print_array(ar);
		int[][] result = transpose(ar);
		print_array(result);
	}
}


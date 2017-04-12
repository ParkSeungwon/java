//2016110056 박승원

class Matrix {
	private int row = 0;
	private int col = 0;
	public int[][] array = null;
	static public int array_number=0;
	
	void setRow(int row) { this.row = row; }
	int getRow() { return row; }
	void setCol(int col) { this.col = col; }
	int getCol() { return col; }
	static void getArrayNumber() {
		System.out.println("총 행렬의 갯수는 " + array_number + "입니다.");
	}

	Matrix(int col, int row) {
		this.col = col;
		this.row = row;
		array = new int[col][row];
		array_number++;
	}
	private int rowXcol(int[][] a, int[][] b, int r, int c, int n) {
		int sum = 0;
		for(int i=0; i<n; i++) sum += a[i][r] * b[c][i];
		return sum;
	}
	public void show() {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) System.out.print(array[j][i] + " ");
			System.out.println();
		}
		getArrayNumber();
	}

	Matrix multiply(Matrix r) {
		Matrix m = new Matrix(r.col, row);
		for(int i=0; i<r.col; i++) for(int j=0; j<row; j++) 
			m.array[j][i] = rowXcol(array, r.array, i, j, col);
		return m;
	}
	Matrix multiply(int n) {
		Matrix m = new Matrix(col, row);
		for(int i=0; i<col; i++) for(int j=0; j<row; j++) 
			m.array[i][j] = n * array[i][j];
		return m;
	}
	Matrix summation(Matrix r) {
		Matrix m = new Matrix(col, row);
		for(int i=0; i<col; i++) for(int j=0; j<row; j++) 
			m.array[i][j] = array[i][j] + r.array[i][j];
		return m;
	}
	Matrix transpose() {
		Matrix m = new Matrix(row, col);
		for(int i=0; i<col; i++) for(int j=0; j<row; j++) 
			m.array[j][i] = array[i][j];
		return m;
	}
}

public class problem4 {
	public static void main(String[] args) {
		Matrix m1 = new Matrix(3,2);
		for(int i=0,k=0; i<3; i++) for(int j=0; j<2; j++) m1.array[i][j] = k++;
		m1.show();
		Matrix m2 = new Matrix(2,3);
		for(int i=0,k=0; i<2; i++) for(int j=0; j<3; j++) m2.array[i][j] = k++;
		m2.show();
		Matrix m3 = m1.multiply(m2);
		System.out.println("곱");
		m3.show();
		Matrix m4 = m3.transpose();
		System.out.println("전치행렬");
		m4.show();
		Matrix m5 = m4.multiply(4);
		System.out.println("상수배");
		m5.show();
		Matrix m6 = m5.summation(m4);
		System.out.println("덧셈");
		m6.show();
		System.out.println("행렬을 입력하세요.");
		System.out.println("가로의 크기를 입력하세요.");
		int w = JavaUtil.getInt();
		System.out.println("세로의 크기를 입력하세요.");
		int h = JavaUtil.getInt();
		System.out.println("행렬을 입력하세요.");
		Matrix m7 = new Matrix(w, h);
		for(int i=0; i<h; i++) for(int j=0; j<w; j++) 
			m7.array[j][i] = JavaUtil.getInt();
		m7.show();
	}
}


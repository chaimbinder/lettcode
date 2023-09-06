/**
 * Rotate
 */
public class Rotate {

  public static void rotate(int[][] matrix) {
    int n = matrix.length;
    int[][] newMatrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        newMatrix[j][n - 1 - i] = matrix[i][j];
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        matrix[i][j] = newMatrix[i][j];
      }
    }
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    rotate(matrix);
    int numRows = matrix.length;
    int numCols = matrix[0].length;
    for (int i = 0; i < numRows; i++) {
      for (int j = 0; j < numCols; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}

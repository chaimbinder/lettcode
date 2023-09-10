/**
 * IsValidSudoku
 */
public class IsValidSudoku {

    public static boolean isValidSudoku(char[][] board) {
      int n = 9;
      char[] temp = new char[n];
  
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          temp[j] = board[i][j];
        }
  
        boolean bol1 = isValid(temp);
        if (bol1 == false) {
          return false;
        }
      }
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          temp[j] = board[j][n - 1 - i];
        }
  
        boolean bol1 = isValid(temp);
        if (bol1 == false) {
          return false;
        }
      }
  
      int __i = 0;
      int __j = 0;
      int I = 0;
      int x = 0;
      int y = 0;
      int J = 0;
      for (int k = 0; k < 9; k++) {
        int corrent = 0;
        for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
            temp[corrent] = board[i + __i][j + __j];
            corrent++;
            I = i;
            J = j;
          }
          System.out.println();
        }
        if (I == 2 && __j == 6 && J == 2) {
          __i += 3;
          System.out.println("============================================");
        }
        __j += 3;
        if (__i == 3 && x == 0) {
          __j = 0;
          x++;
        }
        if (__i == 6 && x == 1 && y == 0) {
          __j = 0;
          System.out.println("*************************");
          y++;
        }
        boolean bol1 = isValid(temp);
        if (bol1 == false) {
          return false;
        }
      }
      return true;
    }
  
    public static boolean isValid(char[] line) {
      for (int i = 0; i < line.length; i++) {
      System.out.print(line[i]);
      }
      System.out.println();
      int[] ch = new int[line.length];
      for (int i = 0; i < line.length; i++) {
        int temp = (int) line[i];
        temp = temp - '0';
        // System.out.println(temp);
        if (temp != -2) {
          ch[temp - 1]++;
        }
      }
  
      for (int i = 0; i < ch.length; i++) {
        // System.out.println("ch[1] " + ch[i]);
        if (ch[i] > 1) {
          return false;
        }
      }
      // System.out.println();
      return true;
    }
  
    public static void main(String[] args) {
      char[][] board = {
          { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
          { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
          { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
          { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
          { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
          { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
          { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
          { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
          { '.', '.', '.', '.', '8', '.', '.', '7', '9' },
      };
      isValidSudoku(board);
      // System.out.println(isValidSudoku(board));
      // int numRows = board.length;
      // int numCols = board[0].length;
      // for (int i = 0; i < 3; i++) {
      // for (int j = 0; j < 3; j++) {
      // System.out.print(board[i][j] + " ");
      // }
      // System.out.println();
      // }
    }
  }
  
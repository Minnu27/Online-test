import java.util.*;

public class SpiralPathOf2DArray {

    public static void spiralPrint(int[][] matrix, int n, int m) {
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        int dir = 0;
        List<Integer> spiralPath = new ArrayList<>();

        while (rowStart <= rowEnd && colStart <= colEnd) {
            if (dir == 0) {
                for (int i = colStart; i <= colEnd; i++) {
                    spiralPath.add(matrix[rowStart][i]);
                }
                rowStart++;
            } else if (dir == 1) {
                for (int i = rowStart; i <= rowEnd; i++) {
                    spiralPath.add(matrix[i][colEnd]);
                }
                colEnd--;
            } else if (dir == 2) {
                for (int i = colEnd; i >= colStart; i--) {
                    spiralPath.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            } else {
                for (int i = rowEnd; i >= rowStart; i--) {
                    spiralPath.add(matrix[i][colStart]);
                }
                colStart++;
            }

            dir = (dir + 1) % 4;
        }

        System.out.println(spiralPath);
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;
        int m = matrix[0].length;

        spiralPrint(matrix, n, m);
    }
}

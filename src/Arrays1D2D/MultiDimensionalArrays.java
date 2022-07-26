package Arrays1D2D;

public class MultiDimensionalArrays {

  public static void main(String[] args) {
    int[][] array2D = new int[4][4];

    // int[][][] array3D = new int[4][4][4];
    // int[][][][] array4D = new int[4][4][4][4];

    // matrix[0][0]
    for (int i=0; i<4; i++) {
      for(int j=0; j<4; j++) {
        System.out.print(array2D[i][j] + " ");
      }
      System.out.println();
    }
  }
}

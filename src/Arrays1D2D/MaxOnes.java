package Arrays1D2D;

public class MaxOnes {

  public static int rowWithMaxOnes(int[][] binary2D) {
    int maxCount=0, maxRow=0;
    for(int i=0; i< binary2D.length; i++) {
      int rowCount = 0;
      for (int j=0; j<binary2D[i].length; j++) {
        rowCount += binary2D[i][j];
      }

      if (rowCount>maxCount) {
        maxCount = rowCount;
        maxRow = i;
      }
    }
    return maxRow;
  }

  public static void main(String[] args) {
    int[][] binary2D = new int[][] {
        {0,1,1,0},
        {1,0,0,0},
        {1,0,1,0},
        {1,1,0,1}
    };
    int row = rowWithMaxOnes(binary2D);
    System.out.println(row);
  }
}

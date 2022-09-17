package Arrays1D2D;

public class SpiralPrinting {

    public static void printSpiralMatrix(int[][] matrix) {
        int d=0; // 0->right 1->down 2->left 3->up
        int sr=0, er=matrix.length-1;
        int sc=0, ec=matrix[0].length-1;
        int count=(er+1)*(ec+1);

        while (count>0)
            switch (d) {
                case 0:
                    for (int i=sc; i<=ec; i++) {
                        System.out.print(matrix[sr][i]+" ");
                        count--;
                    }
                    sr++;
                    d=1;
                    break;
                case 1:
                    for (int i=sr; i<=er; i++) {
                        System.out.print(matrix[i][ec]+" ");
                        count--;
                    }
                    ec--;
                    d=2;
                    break;
                case 2:
                    for (int i=ec; i>=sc; i--) {
                        System.out.print(matrix[er][i]+" ");
                        count--;
                    }
                    er--;
                    d=3;
                    break;
                case 3:
                    for (int i=er; i>=sr; i--) {
                        System.out.print(matrix[i][sc]+" ");
                        count--;
                    }
                    sc++;
                    d=0;
                    break;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSpiralMatrix(matrix);
    }
}

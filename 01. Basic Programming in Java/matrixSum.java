import java.util.Scanner;
public class matrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Enter the number of rows and cols");
        r = sc.nextInt();
        c = sc.nextInt();

        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("Enter the elemnts of matrix 1: ");
        for( int i = 0; i < r; i++){
            for( int j = 0; j < c; j++){
                m1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elemnts of matrix 2: ");
        for( int i = 0; i < r; i++){
            for( int j = 0; j < c; j++){
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix 1");
        for( int i = 0; i < r; i++){
            for( int j = 0; j < c; j++){
                System.out.print(m1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2");
        for( int i = 0; i < r; i++){
            for( int j = 0; j < c; j++){
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }

        for( int i = 0; i < r; i++){
            for( int j = 0; j < c; j++){
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        System.out.println("Matrix Sum Is");
        for( int i = 0; i < r; i++){
            for( int j = 0; j < c; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

    }
}

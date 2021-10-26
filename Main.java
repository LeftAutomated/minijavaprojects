import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = sc.nextInt();
        char mat[][] = new char[size][size];

        for(int r = 0; r < size; r++){
            for(int c = 0; c < size; c++){
                if(r == 0 || r == size - 1 || c == 0 || c == size -1 || r == c || size-1 - r == c || r == size-1 -c){
                    mat[r][c] = 'X';
                }
            }
        }

        for(int r = 0; r < size; r++){
            for(int c = 0; c < size; c++)
                System.out.print(mat[r][c]);
            System.out.println();
        }

    }
}
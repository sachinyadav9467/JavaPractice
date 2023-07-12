import java.util.Scanner;
public class Loops{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int rowLen,colLen;
        System.out.println("enter number of rows");
        rowLen=scanner.nextInt();
        System.out.println("enter number of columns");
        scanner.nextLine();
        colLen=scanner.nextInt();
        int[][] matrix=new int[rowLen][colLen];
        for(int i=0;i<rowLen;i++)
        {
            for(int j=0;j<colLen;j++)
            {
                scanner.nextLine();
                matrix[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<rowLen;i++)
        {
            for(int j=0;j<colLen;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
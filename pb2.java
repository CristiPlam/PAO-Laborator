import java.util.Scanner;

public class pb2
{
    public static boolean transpusa (int [][]matrice, int dim)
    {
        for(int i=0;i<dim;i++)
            for(int j=0;j<dim;j++)
                if(matrice[i][j] != matrice[j][i])
                    return false;
        return true;
    }

    public static void main (String []args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Dimensiunea matricei: ");
        int dim = in.nextInt();
        int [][]matrice = new int[dim][dim];
        System.out.println("Matricea: ");
        for(int i=0;i<dim;i++)
            for(int j=0;j<dim;j++)
                matrice[i][j] = in.nextInt();
        System.out.println(pb2.transpusa(matrice, dim));
    }
}

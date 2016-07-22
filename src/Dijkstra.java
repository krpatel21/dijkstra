import java.util.ArrayList;
import java.util.List;

public class Dijkstra
{
    public static final int[][] W = {
            {0, 7, 4, 6, 1},
            {999, 0, 999, 999, 999},
            {999, 2, 0, 5, 999},
            {999, 3, 999, 0, 999},
            {999, 999, 999, 1, 0}
    };

    public static List<Edge> f = new ArrayList<>();

    public static void dij(int n, int w[][])
    {
        int vnear = 0;
        Edge e;
        int[] touch = new int[n];
        int[] length = new int[n];

        for (int i = 1; i < n; i++)
        {
            touch[i] = 0;
            length[i] = W[0][i];
        }
        int count = 0;
        while (count < n)
        {
            int min = 999;
            count++;
            for (int i = 1; i < n; i++)
            {
                if (length[i] > 0 && length[i] < min)
                {
                    min = length[i];
                    vnear = i;
                }
            }

            e = new Edge(touch[vnear], vnear);
            f.add(e);

            for (int i = 1; i < n; i++)
            {
                if (length[vnear] + W[vnear][i] < length[i])
                {
                    length[i] = length[vnear] + W[vnear][i];
                    touch[i] = vnear;
                }
            }
            length[vnear] = -1;
        }
    }

    public static void main(String[] args)
    {
        dij(5, W);

        System.out.println(f);
    }
}

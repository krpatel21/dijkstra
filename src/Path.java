import java.util.List;
import java.util.ArrayList;

public class Path
{
    public List<EdgeItemType> f = new ArrayList<>();
    public int totalLength = 0;


    public void dij(int n, int w[][])
    {
        int vnear = 0;
        EdgeItemType e;
        int[] touch = new int[n];
        int[] length = new int[n];

        for (int i = 1; i < n; i++)
        {
            touch[i] = 0;
            length[i] = w[0][i];
        }

        int count = 0;
        while (count < n-1)
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

            totalLength += w[touch[vnear]][vnear];

            e = new EdgeItemType(touch[vnear], vnear);
            f.add(e);

            for (int i = 1; i < n; i++)
            {
                if (length[vnear] + w[vnear][i] < length[i])
                {
                    length[i] = length[vnear] + w[vnear][i];
                    touch[i] = vnear;
                }
            }
            length[vnear] = -1;
        }
    }
}

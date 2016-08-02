public class Patel072316DijkstraApp
{
    public static void main(String[] args)
    {
        Path.dij(5, Graph.W);

        System.out.println(Path.f);
        System.out.println("The total cost is " + Path.totalLength + ".");
    }
}

public class Patel072316DijkstraApp
{
    public static void main(String[] args)
    {
        Path p = new Path();
        p.dij(5, Graph.W);

        System.out.println(p.f);
        System.out.println("The total cost is " + p.totalLength + ".");

        Path p2 = new Path();
        p2.dij(8, Graph.W2);
        System.out.println(p2.f);
        System.out.println("The total cost is " + p2.totalLength + ".");
    }
}

public class Edge
{
    private int vertexa;
    private int vertexb;

    public Edge(int vertexa, int vertexb)
    {
        this.vertexa = vertexa;
        this.vertexb = vertexb;
    }

    public int getVertexa()
    {
        return vertexa;
    }

    public void setVertexa(int vertexa)
    {
        this.vertexa = vertexa;
    }

    public int getVertexb()
    {
        return vertexb;
    }

    public void setVertexb(int vertexb)
    {
        this.vertexb = vertexb;
    }

    @Override
    public String toString()
    {
        return "(v" + vertexa + ", v"+ vertexb +")";
    }
}

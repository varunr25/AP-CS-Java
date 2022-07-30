
public class Prism extends Rectangle 
{
    private int height;
    
    public Prism()
    {
        super();
        this.height = 1;
    }

    public Prism(int length, int width, int height)
    {
        super(length, width);
        if (height > 0)
        {
            this.height = height;
        }
        else
        {
            this.height = 1;
        }
    }

    public Prism(Prism other)
    {
        super(other);
        this.height = other.height;
    }

    public int getHeight()
    {
        return this.height;
    }

    public int getLength()
    {
        return this.length;
    }
    
    public int getWidth()
    {
        return this.width;
    }
    public int area()
    {
        int area = ;
        return area;
    }

    public int volume()
    {
        int volume = this.height * super.getLength() * super.getWidth();
        return volume;
    }
}

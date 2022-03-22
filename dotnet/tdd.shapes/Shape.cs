namespace tdd.shapes;

public class Shape
{
    public int Area => CalculateArea();

    public int Perimeter => CalculatePerimeter();

    protected virtual int CalculateArea()
    {
        throw new NotImplementedException();
    }

    protected virtual int CalculatePerimeter()
    {
        throw new NotImplementedException();
    }
}

public class Square extends GeometricObject 
{
    private double length;
    public Square(String name,double length) {
        this.name=name;
        this.length = length;
    }

    public double getperimeter() {
        return 4*length;
    }

    public double  getarea()
    {
        return length*length;
    }
}

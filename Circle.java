public  class Circle extends GeometricObject 
{
    private double radius;
    public Circle(String name,double radius) {
        this.name=name;
        this.radius = radius;
    }

    public double getperimeter() {
        return 2 * radius*Math.PI;
    }

    public double getarea()
    {
        return radius*radius*Math.PI;
    }
}

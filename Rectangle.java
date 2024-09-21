class Rectangle extends GeometricObject 
{
    private  double height;
    private double width;
    public Rectangle(String name,double height, double width) {
        this.name=name;
        this.width = width;
        this.height = height;
    }

    public double getarea()
    {
        return width*height;
    }

    public double getperimeter() {
        return 2 * (width + height);
    }
}

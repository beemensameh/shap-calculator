public class Triangle extends GeometricObject 
{
    private double s1;
    private double s2;
    private double s3;
    public Triangle(String name,double s1,double s2,double s3) {
        this.name=name;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public double getperimeter()
    {
        return s1+s2+s3;
    }

    public double getarea()
    {
        return Math.sqrt(getperimeter()*(getperimeter()-s1)*(getperimeter()-s2)*(getperimeter()-s3));
    }
}

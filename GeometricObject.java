public abstract class GeometricObject 
{
    protected String name;
    protected GeometricObject(){
        name="null";
    }
    
    public String showdetails()
    {
        return name+"\t"+"Area: "+getarea();
    }

    public abstract double  getarea();

    public abstract double getperimeter();
}

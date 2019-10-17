public class Cylinder extends Circle 
{
    private double height = 1.0;

    public Cylinder() {}

    public Cylinder(double radius)
    {
        this.setRadius(radius);
    }

    public Cylinder(double radius, double height, String color)
    {
        this.setRadius(radius);
        this.height = height;
        this.setColor(color);
    }

    public Cylinder(double radius, double height)
    {
        this.setRadius(radius);
        this.height = height;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getVolume()
    {
        double Volume = this.getRadius()*this.getRadius()*PI*this.getHeight();
        return Volume;
    }

    public String toString()
    {
        String s = new String();
        s += ("Cylinder[" + super.toString() + ",height=" + this.getHeight() + "]");
        return s;
    }

    public double getArea()
    {
        double area = 2*super.getArea() + 2*PI*super.getRadius()*this.getHeight();
        return area;
    }

    // public static void main(String[] args)
    // {
    //     Cylinder cy = new Cylinder(5.,6.);
    //     Cylinder cy1 = new Cylinder(6.,7.,"red");
    //     System.out.print(cy1.toString());
    // }
}
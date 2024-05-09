package shape_project;

public class Triangle extends TwoDShape {
	double a;
	double b;
	double c;
	double h;
	Triangle()
	{
		
	}
	Triangle(double a,double b,double c,double h)
	{
		System.out.println("Triangle Object is Created");
		this.a=a;
		this.b=b;
		this.c=c;
		this.h=h;
		
	}
	 @Override
	   public double getArea()
	   {
		   double area=1/2*b*h;
		   System.out.println("Area of Triangle is:"+area+"Sq.unit");
		   return area;
	   }
	   @Override
	   public double getPerameter()
	   {
		   double perameter=a+b+c;
		   System.out.println("Perameter of Triangle is:"+perameter+"Unit");
		   return perameter;
	   }
}

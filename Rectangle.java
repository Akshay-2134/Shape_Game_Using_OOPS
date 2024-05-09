package shape_project;

public class Rectangle extends TwoDShape {
	double l;
	double w;
	Rectangle()
	{
		
	}
	Rectangle(double l,double w)
	{
		System.out.println("Rectangle Object is Created");
		this.l=l;
		this.w=w;
	}
	 @Override
	   public double getArea()
	   {
		   double area=l*w;
		   System.out.println("Area of  Rectangle is:"+area+"Sq.unit");
		   return area;
	   }
	   @Override
	   public double getPerameter()
	   {
		   double perameter=2*(l+w);
		   System.out.println("Perameter of  Rectangle  is:"+perameter+"Unit");
		   return perameter;
	   }
}

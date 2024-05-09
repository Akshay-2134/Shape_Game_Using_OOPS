package shape_project;

public class Square extends TwoDShape {
	double l;
	Square()
	{
		
	}
	Square(double l)
	{
		System.out.println("Square Object is Created");
		this.l=l;
		
	}
	 @Override
	   public double getArea()
	   {
		   double area=l*l;
		   System.out.println("Area of Square is:"+area+"Sq.unit");
		   return area;
	   }
	   @Override
	   public double getPerameter()
	   {
		   double perameter=4*l;
		   System.out.println("Perameter of Square is:"+perameter+"Unit");
		   return perameter;
	   }
}

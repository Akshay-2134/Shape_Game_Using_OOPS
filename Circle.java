package shape_project;

public class Circle extends TwoDShape {
   double r;
   Circle()
   {
	   
   }
   Circle(double r)
   {
	   System.out.println("Circle Object is Created");
	   this.r=r;
   }
   @Override
   public double getArea()
   {
	   double area=3.14*r*r;
	   System.out.println("Area of Circle is:"+area+"Sq.unit");
	   return area;
   }
   @Override
   public double getPerameter()
   {
	   double perameter=2*3.14*r;
	   System.out.println("Area of Perameter is:"+perameter+"Unit");
	   return perameter;
   }
   
}

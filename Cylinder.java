package shape_project;

public class Cylinder extends ThreeDShape {
  double r;
  double h;
  Cylinder()
  {
	  
  }
  Cylinder(double r,double h)
  {
	  System.out.println("Cylinder Object is Created");
	  this.r=r;
	  this.h=h;
  }
  @Override
  public double getVolume()
  {
	   double volume=3.14*r*r*h;
	   System.out.println("Volume of Cylinder is:"+volume+"Cube.unit");
	   return volume;
  }
  @Override
  public double getLateralSurfaceArea()
  {
	   double lsa=2*3.14*r*h;
	   System.out.println("LateralSurfaceArea of Cylinder is:"+lsa+"Sq.unit");
	   return lsa;
  }
  @Override
  public double getTotalSurfaceArea()
  {
	   double tsa=2*3.14*r*(r+h); 
	   System.out.println("TotalSurfaceArea of Cylinder"+tsa+"Sq.unit");
	   return tsa;
  }
}

package shape_project;

public class Sphere extends ThreeDShape {
  double r;	
  Sphere()
  {
	  
  }
  Sphere(double r)
  {
	  System.out.println("Sphere Object is Created");
	  this.r=r;
  }
  @Override
  public double getVolume()
  {
	   double volume=4/3*3.14*r*r*r;
	   System.out.println("Volume of Sphere is:"+volume+"Cube.unit");
	   return volume;
  }
  @Override
  public double getLateralSurfaceArea()
  {
	   double lsa=4*3.14*r*r;
	   System.out.println("LateralSurfaceArea of Sphere is:"+lsa+"Sq.unit");
	   return lsa;
  }
  @Override
  public double getTotalSurfaceArea()
  {
	   double tsa=4*3.14*r*r; 
	   System.out.println("TotalSurfaceArea of Sphere is:"+tsa+"Sq.unit");
	   return tsa;
  }
}

package shape_project;

public class Cone extends ThreeDShape {
	double r;
	double h;
	double l;
   Cone()
   {
	   
   }
   Cone(double r,double h,double l)
   {
	   System.out.println("Cone Object is Created");
	   this.r=r;
	   this.h=h;
	   this.l=l;
   }
   @Override
   public double getVolume()
   {
 	   double volume=1/3*3.14*r*r*h;
 	   System.out.println("Volume of Cone is:"+volume+"Cube.unit");
 	   return volume;
   }
   @Override
   public double getLateralSurfaceArea()
   {
 	   double lsa=3.14*r*l;
 	   System.out.println("LateralSurfaceArea of Cone is:"+lsa+"Sq.unit");
 	   return lsa;
   }
   @Override
   public double getTotalSurfaceArea()
   {
 	   double tsa=3.14*r*(r+l); 
 	   System.out.println("TotalSurfaceArea of Cone is:"+tsa+"Sq.unit");
 	   return tsa;
   }
}

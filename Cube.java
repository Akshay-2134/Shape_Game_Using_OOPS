package shape_project;

public class Cube extends ThreeDShape {
	double a;
   Cube()
   {
	   
   }
   Cube(double a)
   {
	   System.out.println("Cube Object is Created");
	   this.a=a;
   }
   @Override
   public double getVolume()
   {
 	   double volume=a*a*a;
 	   System.out.println("Volume of Cube is:"+volume+"Cube.unit");
 	   return volume;
   }
   @Override
   public double getLateralSurfaceArea()
   {
 	   double lsa=4*a*a;
 	   System.out.println("LateralSurfaceArea of Cone is:"+lsa+"Sq.unit");
 	   return lsa;
   }
   @Override
   public double getTotalSurfaceArea()
   {
 	   double tsa=6*a*a; 
 	   System.out.println("TotalSurfaceArea of Cone is:"+tsa+"Sq.unit");
 	   return tsa;
   }
}

package shape_project;
import java.util.*;
public class Game {
 public int selectShape()
 {
	 Scanner sc=new Scanner(System.in);
	 int x;
	 do {
		 System.out.println("!!====Enter 1==>TwoDShape and 2==>ThreeDShape===");
		 x=sc.nextInt();
		 if(x<1 || x>2)
			 System.out.println("This is not a Valid Choice");
	 }while(x<1 || x>2);
	 return x;
 }
 public TwoDShape getTwoDShape()
 {
	 Scanner sc=new Scanner(System.in);
	 int twodchoice=getTwoDChoice();
	 if(twodchoice==1)
	 {
		 System.out.println("You have selected Circle");
		 System.out.println("Now Enter the Radius");
		 double r=sc.nextDouble();
//		 TwoDShape td=new Circle(r); my doubt ...where is the parent reference varibale
		 return new Circle(r);
	 }
	 else if(twodchoice==2)
	 {
		 System.out.println("You have selected Rectangle");
		 System.out.println("Now Enter the length");
		 double l=sc.nextDouble();
		 System.out.println("Now Enter the width");
		 double w=sc.nextDouble();
		 return new Rectangle(l,w);
	 }
	 else if(twodchoice==3)
	 {
		 System.out.println("You have selected Square");
		 System.out.println("Now Enter the Side");
		 double l=sc.nextDouble();
		 return new Square(l);
	 }
	 else 
	 {
		 System.out.println("You have selected triangle");
		 System.out.println("Now Enter the one side");
		 double a=sc.nextDouble();
		 System.out.println("Now Enter the Second side");
		 double b=sc.nextDouble();
		 System.out.println("Now Enter the Third side");
		 double c=sc.nextDouble();
		 System.out.println("Now Enter the Height");
		 double h=sc.nextDouble();
		 return new Triangle(a,b,c,h);
	 }

	 
 }
 
 public ThreeDShape getThreeDShape()
 {
	 Scanner sc=new Scanner(System.in);
	 int threedchoice=getThreeDChoice();
	 if(threedchoice==1)
	 {
		 System.out.println("You have selected Cylinder");
		 System.out.println("Now Enter the Radius");
		 double r=sc.nextDouble();
		 System.out.println("Now Enter the Height");
		 double h=sc.nextDouble();
		 return new Cylinder(r,h);
	 }
	 else if(threedchoice==2)
	 {
		 System.out.println("You have selected Sphere");
		 System.out.println("Now Enter the Radius");
		 double l=sc.nextDouble();
		 return new Sphere(l);
	 }
	 else if(threedchoice==3)
	 {
		 System.out.println("You have selected Cone");
		 System.out.println("Now Enter the Radius");
		 double r=sc.nextDouble();
		 System.out.println("Now Enter the Height");
		 double h=sc.nextDouble();
		 System.out.println("Now Enter the Slant Height");
		 double l=sc.nextDouble();
		 return new Cone(r,h,l);
	 }
	 else 
	 {
		 System.out.println("You have selected Cube");
		 System.out.println("Now Enter the side");
		 double a=sc.nextDouble();
		 return new Cube(a);
	 }
	
	 
 }
 
 public int getTwoDChoice()
 {
	 int twodchoice;
	 do{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter from Below Option");
		 System.out.println("1===>for Circle");
		 System.out.println("2===>for Rectangle");
		 System.out.println("3===>for Square");
		 System.out.println("4===>for Triangle");
		 twodchoice=sc.nextInt();
		 if(twodchoice<1 || twodchoice>4)
			 System.out.println("Invalid Option");
	 }while(twodchoice<1 || twodchoice>4);
	 return twodchoice;
 }
 
 public int getThreeDChoice()
 {
	 int threedchoice;
	 do{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter from Below Option");
		 System.out.println("1===>for Cylinder");
		 System.out.println("2===>for Sphere");
		 System.out.println("3===>for Cone");
		 System.out.println("4===>for Cube");
		 threedchoice=sc.nextInt();
		 if(threedchoice<1 || threedchoice>4)
			 System.out.println("Invalid Option");
	 }while(threedchoice<1 || threedchoice>4);
	 return threedchoice;
 }
 
 
}

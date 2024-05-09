package shape_project;
import java.util.*;
public class Driver {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	Game g=new Game();
	char c;
	
	do {
		int choice=g.selectShape();	
		switch(choice)
		{
		case 1:
			System.out.println("You have selected TwoDShape");
			TwoDShape two_d_shape=g.getTwoDShape();
     		two_d_shape.getArea();
			two_d_shape.getPerameter();		
			break;
		case 2:
			System.out.println("You have selected ThreeDShape");
			ThreeDShape three_d_shape=g.getThreeDShape();
			three_d_shape.getVolume();
			three_d_shape.getLateralSurfaceArea();
			three_d_shape.getTotalSurfaceArea();
			break;
		}
		System.out.println("Press Y/y to Restart the Game to any other character to Exit");
		c=sc.next().charAt(0);
	}while(c=='Y' || c=='y');
	System.out.println("Happy Learning!Have A Good Day!");
}
}

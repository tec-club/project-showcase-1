/*This program takes a number from the user to which
 * calculator they want. Cone, Pyramid, and Rectangular
 * Prism surface area calculators, and regular polygon
 * area calculators.
 */
import acm.program.*;
import java.lang.Math;
import java.util.Scanner;


public class FormulaCalculator extends ConsoleProgram {
		public FormulaCalculator()
		{
			run();
		}
	public void run() {
			int polygon=1;
			Scanner input= new Scanner(System.in);
			
			int prism=2;
			int cone=3;
			int cylinder=4;
			int pyramid=5;
			int sphere=6;
			System.out.println("This program has several different formula calculators.");
			System.out.println(" ");
			System.out.println("1. Polygon area Calculator ");
			System.out.println("2. Rectangular Prism Calculator ");
			System.out.println("3. Cone Calculator ");
			System.out.println("4. Cylinder Calculator ");
			System.out.println("5. Pyramid Calculator ");
			System.out.println("6. Sphere Calculator ");
			System.out.println(" ");
			int loop=1;
			while(loop==1)  {
				System.out.println();
				System.out.println();
				System.out.printf("		Enter the number of that which corresponds with the calculator you want: ");
			int calcnumb= input.nextInt();
			
			if(calcnumb== polygon)  {
				System.out.println("This program calculates the area");
				System.out.println("of a regular polygon");
				System.out.printf("Enter the number of sides(it must be more than two ");
			double sides= input.nextDouble();
			System.out.printf("Enter the length of the radii: ");
			double radii= input.nextDouble();
			double degrees= (360/sides/2);
			double radians= (degrees*pi) /180;
			double apothem= Math.sin(radians)*radii;
			double perimeter=((Math.cos(radians))*2*radii*sides);
			double area= apothem*perimeter/2;
			System.out.println("When there are a bunch of .9's round to the nearest whole number");
			System.out.println("The perimeter is:"+perimeter+"");
			System.out.println("The apothem is:"+apothem+"");
			System.out.println("The area is:"+area+"");
				} else if(calcnumb==prism)   {
					System.out.println("This program calculates the volume");
					System.out.println("and surface area of a rectangular prism");
					System.out.println("S.A= perimeter*height+ two base ");
					System.out.println("Volume= base area times the height");
					System.out.printf("Enter the base length: ");
					double base_length= input.nextDouble();
					System.out.printf("Enter the other base length: ");
					double other_base_length= input.nextDouble();
					System.out.printf("Enter the height: ");
					double height= input.nextDouble();
					double base_area= base_length* other_base_length;
					double perimeter= base_length*2+ other_base_length*2;
					double LA= perimeter* height;
					double two_base= base_area*2;
					double SA= LA+ two_base;
					double volume= base_area* height;
					System.out.println("The lateral area is:"+LA+ "");
					System.out.println("The surface area is:"+SA+"");
					System.out.println("The volume is:"+volume+ "");
				} else if (calcnumb==cone) {
					System.out.println("This program calculates the volume and surface area of a cone.");
					System.out.println("S.A= pi*radius*slant height+ base");
					System.out.println("Volume = base area* height/3");
					System.out.printf("Enter the Radius: ");
					double radius= input.nextDouble();
					System.out.println("If you have the slant height enter it,");
					System.out.println("but if you have the height enter the number 0");
					System.out.printf("Enter the slant height or 0: ");
					double l= input.nextDouble();
						if(l==0)  {
					System.out.printf("Enter the height: ");
					double height= input.nextDouble();
					double base_area= pi*radius*radius;
					double volume= base_area*height /3;
					double slant_height= Math.sqrt(radius*radius+height*height);
					double surface_area= pi*radius*slant_height+base_area;
					System.out.println("The surface area is:"+surface_area+ "");
					System.out.println("The volume is:"+volume+ "");
					System.out.println("The slant height is:"+slant_height+ "");
					System.out.println("In terms of pi the volume is: "+volume/pi+"");
					System.out.println("The lateral area is: "+pi*radius*slant_height+"");
					System.out.println("The surface area in terms of pi is:"+surface_area/pi+ "");
						} else if(l!=0)  {
							double height= Math.sqrt(l*l-radius*radius);
							double base_area= pi*radius*radius;
							double volume= base_area*height /3;
							double surface_area= pi*radius*l+base_area;
							System.out.println("The surface area is:"+surface_area+ "");
							System.out.println("The volume is:"+volume+ "");
							System.out.println("The height is:"+height+ "");
							System.out.println("In terms of pi the volume is:"+volume/pi+"");
							System.out.println("The lateral area is: "+pi*radius*l+"");
							System.out.println("The surface area in terms of pi is:"+surface_area/pi+ "");
							} 
						} else if (calcnumb==cylinder) {
							System.out.println("This program calculates the surface area");
							System.out.println("and the volume of a cylinder");
							System.out.println("S.A=circumference*height+two base");
							System.out.printf("Enter the length of the radius: ");
							double radii= input.nextDouble();
							System.out.printf("Enter the length of the height: ");
							double height= input.nextDouble();
							double circum= radii*2*pi;
							double base_area= radii*radii* pi;
							double volume= base_area*height;
							double surface_area= circum*height+ 2*base_area;
							System.out.println("The surface area is "+surface_area+"");
							System.out.println("The volume is "+volume+"");
							System.out.println("The volume in terms of pi is: "+volume/pi+"");
							System.out.println("The lateral area is:"+circum*height+" ");
							System.out.println("The surface area in terms of pi is:"+surface_area/pi+ "");
							
								} else if (calcnumb==pyramid)  {
									System.out.println("This program calculates the volume");
									System.out.println("and the surface area of a pyramid");
									System.out.println("S.A=perim*l/2+base");
									System.out.printf("Enter the length of the base: ");
									double base_length= input.nextDouble();
									System.out.printf("Enter the width of the base: ");
									double base_width= input.nextDouble();
									System.out.println("If you have the slant height enter it,");
									System.out.println("but if you have the height enter the number 0");
									System.out.printf("Enter the slant height or 0: ");
									double l= input.nextDouble();
										if(l==0)  {
											System.out.printf("Enter the height: ");
											double height= input.nextDouble();
											double base_area= base_width*base_length;
											double volume= base_area*height /3;
											double perimeter= base_width*2+base_length*2;
											double apothem= base_length/2;
											double slant_height= Math.sqrt(apothem*apothem+height*height);
											double surface_area=perimeter*slant_height/2 +base_area;
											System.out.println("The surface area is:"+surface_area+ "");
											System.out.println("The volume is:"+volume+ "");
											System.out.println("The slant height is:"+slant_height+ "");
						
										} else if(l!=0)    {
											double base_area= base_width*base_length;
											double apothem= base_length/2;
											double height= Math.sqrt(l*l-apothem*apothem);
											double perimeter= base_width*2+base_length*2;
											double volume= base_area*height /3;
											double surface_area=perimeter*l/2 +base_area;
											System.out.println("The surface area is:"+surface_area+ "");
											System.out.println("The volume is:"+volume+ "");
											System.out.println("The height is:"+height+ "");
											
										} 
								}   else if (calcnumb==sphere)  {
									System.out.println("This program calculates the volume");
									System.out.println("and the surface area of a sphere");
											System.out.printf("Enter the length of the radius: ");
											double radius= input.nextDouble();
											double volume= (4.0/3.0)*pi*(radius*radius*radius);
											double surface_area= 4*pi*radius*radius;
											System.out.println("The surface area is: "+surface_area+"");
											System.out.println("The volume is: "+volume+"");
											System.out.println("The volume in terms of pi is: "+volume/pi+"");
											System.out.println("The surface area in terms of pi is:"+surface_area/pi+ " ");
								}
											}
			 
									}
	 
		private static final double pi= 3.141592653589794246433;

		public static void main(String args[]) {
	        FormulaCalculator fc = new FormulaCalculator();
					fc.run();		}	
			}
		
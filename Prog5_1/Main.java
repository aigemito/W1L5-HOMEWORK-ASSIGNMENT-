package Prog5_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[6];
		
		Rectangle purpleRectangle = new Rectangle("Purple", 10, 20);
		shapes[0] = purpleRectangle;
		
		Rectangle redRectangle = new Rectangle("Red", 12, 15);
		shapes[1] = redRectangle;
		
		Circle whiteCircle = new Circle("White", 5);
		shapes[2] = whiteCircle;
		
		Circle blueCircle = new Circle("Blue", 1);
		shapes[3] = blueCircle;
		
		Square greenSquare = new Square("Green", 10);
		shapes[4] = greenSquare;
		
		Square greySquare = new Square("Grey", 8);
		shapes[5] = greySquare;
		
		printTotal(shapes);
	}
	
	public static void printTotal(Shape[] shapes){
		double totalArea = 0, totalPerimeter = 0;
		for(Shape s: shapes) {
			totalArea += s.calcualteArea();
			totalPerimeter += s.calculatePerimeter();
		}
		System.out.println("Total Area of all the Shapes     : "+totalArea);
		System.out.println("Total Perimeter of all the Shapes: "+totalPerimeter);
	}

}


public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle box1 = new Rectangle();
		box1.printBasicInfo();
		System.out.println("The perimeter of box1 is " + box1.findPerimeter());
		System.out.println("The diagonal of box1 is " + box1.findDiagonal());
		System.out.println("The perimeter of box1 is " + box1.findPerimeter());
		if (box1.isSquare() == true)
			System.out.println("It is a square box.");
		else
			System.out.println("It is not a square box.");
		
		Rectangle box2 = new Rectangle(3,4);
		box2.printBasicInfo();
		System.out.println("The perimeter of box1 is " + box2.findPerimeter());
		System.out.println("The diagonal of box1 is " + box2.findDiagonal());
		System.out.println("The perimeter of box1 is " + box2.findPerimeter());
		if (box2.isSquare() == true)
			System.out.println("It is a square box.");
		else
			System.out.println("It is not a square box.");
			

	}

}
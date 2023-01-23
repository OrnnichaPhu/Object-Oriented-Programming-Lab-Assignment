class Rectangle{
	double width;
	double lenght;
	
	Rectangle(){
		width = 1;
		lenght = 1;
	}
	Rectangle(double x,double y){
		width = x;
		lenght = y;
	}
	
	double findArea() {
		return (width*lenght);
	}
	
	double findPerimeter() {
		return (width*2 + lenght*2);
	}
	double findDiagonal() {
		return Math.sqrt(width*width + lenght*lenght);		
	}
	boolean isSquare() {
		if (width == lenght)
			return true;
		else
			return false;
		
		
	}
	void printBasicInfo() {
		System.out.println("This width is " + width);
		System.out.println("This lenght is " + lenght);
	}

}

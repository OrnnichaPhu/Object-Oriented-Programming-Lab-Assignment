class RT{
	double a;
	double b;
	RT(){
		a = 3;
		b = 4;
	}
	RT(double x, double y){
		a = x;
		b = y;
	}
	double findhypo() {
		return Math.sqrt(a*a + b*b);
	}
	double findarea() {
		return (a*b)/2;
	}
}

//

class name{
	String name;
	String id;
	String position;
	double salary;
	int DateofBirth;
	int monthofBirth;
	int yearofBirth;
}
class cs extends RT{
	double c;
	cs(int a,int b){
		super(a,b);
		c = 1.0;
		
	}
	double findarea() {
		return super.findarea()*c + findhypo();
	
		
	}
	
}
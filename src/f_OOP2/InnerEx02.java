package f_OOP2;

public class InnerEx02 {
	public static void main(String[] args) {
		
		Outer o =new Outer();
		Outer.Inner oa = o.new Inner();
		
		System.out.println(oa.value);
		oa.method(30);

	}
}

class Outer{
	
	int value=10;
	
	class Inner{
		int value=20;
		
		void method(int value){
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer.this.value);
		}
		
		
	}
	
	
	
	
	
}
package e_OOP;

public class RecursiveCall {
	public static void main(String[] args) {
			
		RecursiveCall call=new RecursiveCall();
		long result1=call.factorial(4);
		System.out.println(result1);
	}
	
	long factorial(int num){
		long result=0;
		if(num==1){
			result = 1;
		}else{
			result = num*factorial(num-1);
		}
		return result;
	}
}

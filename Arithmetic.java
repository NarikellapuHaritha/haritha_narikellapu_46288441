package LambdaAssignment;
interface Arithmetic1
{
	public  int basicArithmetic(int a,int b);

}
public class Arithmetic {
	public int add(int a ,  int b) {
		Arithmetic1 addition=(int n1, int n2)->n1+n2;
		return addition.basicArithmetic(a,b);
	}
	public int sub(int a , int b) {
		Arithmetic1 subtraction=(int n1, int n2)->n1-n2;
		return subtraction.basicArithmetic(a,b);
		
	}
	public int mul(int a ,int b) {
		Arithmetic1 multiplication=(int n1, int n2)->n1*n2;
		return multiplication.basicArithmetic(a,b);
	}
	public int div(int a ,int b) {
		
		Arithmetic1 division=(int n1, int n2)->n1/n2;
		return division.basicArithmetic(a,b);
	}
	public static void main(String[]args) {
		Arithmetic arm=new Arithmetic();
		System.out.println(arm.add(30,20));
		System.out.println(arm.sub(30 ,15));
		System.out.println(arm.mul(10 ,10));
		System.out.println(arm.div(100,5));
	}
	}


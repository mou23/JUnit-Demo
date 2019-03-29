package calculator;

public class ScientificCalculator {
	public int sum(int a,int b){
		return a+b;
	}

	public int substract(int a,int b){
		return a-b;
	}

	public int multiplication(int a,int b){
		return a*b;
	}

	public int division(int a,int b){
		return a/b;
	}

	public int power(int a,int b){
		int total=1;
		for(int i=0;i<b;i++){
			total=total*a;
		}
		return total;
	}
	
	public double squareRoot(int a){
		return Math.sqrt(a);
	}
	
	public int factorial(int a){
		int total=1;
		for(int i=1;i<=a;i++){
			total=total*i;
		}
		return total;
	}

	public double ln(int a){
		return Math.log(a);
	}
	
	public double log(int a){
		return Math.log10(a);
	}
	
	public double sin(int a){
		return Math.sin(a);
	}
	
	public double cos(int a){
		return Math.cos(a);
	}
	
	public double tan(int a){
		return Math.tan(a);
	}
	
	public long nPr(int n,int r){
		return (factorial(n)/factorial(n-r));
	}
	
	public long nCr(int n,int r){
		return (nPr(n,r)/(factorial(r)));
	}
	
	public String convertToBinary(int a){
		return Integer.toBinaryString(a);
	}
	
	public String convertToOctal(int a){
		return Integer.toOctalString(a);
	}
	
	public String convertToHex(int a){
		return Integer.toHexString(a);
	}
	
	public double exponential(double a){
		return Math.exp(a);
	}
}

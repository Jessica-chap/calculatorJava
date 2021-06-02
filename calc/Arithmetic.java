package calc;
import java.lang.Math;
import java.util.Random;

public class Arithmetic {
	public static float add(float num1, float num2) {
		return (num1+num2);
	}

	public static float subtract(float num1, float num2) {
		return (num1-num2);
	}

	public static float multiply(float num1, float num2) {
		return (num1*num2);
	}

	public static float divide(float num1, float num2) {
		return (num1/num2);
	}

	public static float square(float num1) {
		return (num1 * num1);
	}

	public static float cube(float num1) {
		return (num1*num1*num1);
	}

	public static float power(float num1, float num2) {
		double s=Math.pow(num1,num2);

		return (float)s;
	}

	public static float mod(float num1, float num2) {
		return (num1%num2);
	}

	public static float random(float num1,float num2) {
		float max;
		float min;
		// Random rand = new Random();
		if (num1 > num2){
			max = num1;
			min = num2;
		}else{
			max = num2;
			min = num1;
		}

		double rNum = (Math.random()* ((max - min))+1)+min;
		
		return (int)rNum;

		// float rNum=rand.nextInt((int)num2-(int)num1)+(int)num1;
		// int rNum2= rand.nextInt(num1,num2);
	
	}


}
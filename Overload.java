public class Overload {

	//Overloading allows for two methods of the same name, but different values / operations DEPENDING ON THE INPUT
	//it might have to return the same type (?)

	public static double getAverage(float first, float second) {
		return (first + second) / 2.0;
	}

	public static double getAverage(double first, double second, double third) {
		return (first + second) / 3.0;
	}

	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		System.out.println(getAverage(3.0F, 3.5F));
		System.out.println(getAverage(2.0, 3.5, 4.0));
	}
}

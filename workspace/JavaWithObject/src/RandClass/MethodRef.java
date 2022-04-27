package RandClass;

import java.util.function.DoubleUnaryOperator;
import java.util.function.ToIntFunction;


public class MethodRef {

	public static void main(String[] args) {
		test(x -> Math.sqrt(x));
		test(Math :: sqrt);
		
		test1((String s) -> s.length());
		test1(String::length);
	}
	
	public static void test(DoubleUnaryOperator duo) {
		double ans = duo.applyAsDouble(5.0);
		System.out.println(ans);
	}
	
	public static void test1(ToIntFunction<String> f) {
		int length = f.applyAsInt("Hello");
		System.out.println(length);
	}

}

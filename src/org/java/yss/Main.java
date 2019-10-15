package org.java.yss;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		BigDecimal first = new BigDecimal(Float.toString(80.88f));
		BigDecimal secord = new BigDecimal(Float.toString(80.88f));
		BigDecimal result = first.add(secord);
		System.out.println(result.doubleValue());
		System.out.println("-------------------");
		float f1 = 80.88f;
		float f2 = 80.88f;
		System.out.println(f1+f2);
	}
}

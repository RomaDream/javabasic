package org.java.yss;
/**
 * 位运算符
 * @author Administrator
 *
 */
public class Chart_02 {
	public static void main(String[] args) {
		int a = 12;
		int b = 10;
		String s1 = Integer.toBinaryString(a);
		String s2 = Integer.toBinaryString(b);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(Integer.toBinaryString(a^b));
	}
}

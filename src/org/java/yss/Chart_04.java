package org.java.yss;
/**
 * 排序
 * @author Administrator
 *
 */
public class Chart_04 {
	public static void main(String[] args) {
		int arr[] = {12,3,5,6,54,32,467,67,33,3,5};
		Chart_04.maopao(arr);
		System.out.println();
		Chart_04.xuanze(arr);
	}
	//冒泡:比较相邻两个元素的大小，满足条件就互调
	public static void maopao(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		show(arr);
	}
	
	//选择
	public static void xuanze(int[] arr) {
		int index;
		for(int i=1;i<arr.length;i++) {
			index = 0;
			for(int j=1;j<=arr.length-i;j++) {
				if(arr[j] > arr[index]) {
					index = j;
				}
			}
			int temp = arr[arr.length-i];
			arr[arr.length-i] = arr[index];
			arr[index] = temp;
		}
		show(arr);
	}
	
	
	public static void show(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(">"+arr[i]);
		}
	}
}

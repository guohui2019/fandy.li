package com.sl.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	
	public static List<Double> split(Double number) {
		if(null==number) {
			return null;
		}
		List<Double> result = new ArrayList<Double>();
		result.add( number*0.2);
		result.add( number*0.3);
		result.add( number*0.5);
		return result;
	}
	
	public static Double merge(Double number) {
		if(null==number) {
			return null;
		}
		List<Double> list = new ArrayList<Double>();
		list.add( number*0.2);
		list.add( number*0.3);
		list.add( number*0.5);
		Double result = list.get(1) + list.get(2);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("100²ğÏä");
		System.out.println(split(100.00));
		System.out.println("100×°Ïä");
		System.out.println(merge(100.00));
		System.out.println();
		System.out.println("200²ğÏä");
		System.out.println(split(200.00));
		System.out.println("100×°Ïä");
		System.out.println(merge(200.00));
		System.out.println();
		System.out.println("50²ğÏä");
		System.out.println(split(50.00));
		System.out.println("×°Ïä");
		System.out.println(merge(50.00));
	}

}

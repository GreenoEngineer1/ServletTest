package com;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSample {
	public static Comparator sampleComparator = new Comparator() {

		@Override
		public int compare(Object o1, Object o2) {
			// TODO Auto-generated method stub
			int age1 = (Integer) o1;
			int age2 = (Integer) o2;
			
			if (o1.equals(o2)) {
				System.out.println("objects are equal");
			} else {
				System.out.println("objects are not equal");
			}
			return 0;
		}
	};
	
	public static int sortOrder(){
		
		new Comparable() {

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		return 0;
		
	}
	
	public static void main(String[] args) {
		sampleComparator.compare(15, 20);

	}
}

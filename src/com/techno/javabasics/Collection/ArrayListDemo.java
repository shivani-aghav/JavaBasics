package com.techno.javabasics.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);

		System.out.println("Iterator");
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("ListIterator");

		ListIterator listIterator = arrayList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("ListIterator previous");
		
		ListIterator listIterator1 = arrayList.listIterator(arrayList.size());
		
		while (listIterator1.hasPrevious()) {
			System.out.println(listIterator1.previous());
		}
		System.out.println("For Each");

		for (Integer integer : arrayList) {
			System.out.println(integer);
		}
		System.out.println("For");

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
	}
}

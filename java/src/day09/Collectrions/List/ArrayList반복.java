package day09.Collectrions.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList반복 {

	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();
		
		System.out.println("가지고 싶은 물건 5가지 입력하기");
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			String product = sc.nextLine();
			cart.add(product);
		}
		
		//반복 -for
		for (int i=0; i<cart.size();i++) {
			System.out.print(cart.get(i)+" ");
		}
		//배열의 length 같은 역할임!! length == size()
		System.out.println();
		System.out.println("----------------------");
		
		for(String product : cart) {
			System.out.print(product + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		
		
		//반복3 -Iterator (for)
		for (Iterator iterator = cart.iterator(); iterator.hasNext();) {
			String product = (String) iterator.next();
			System.out.print(product + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		//반복4 -Iterator (While)
		Iterator<String> it = cart.iterator();
		while (it.hasNext()) {
			String product = (String) it.next();
			System.out.print(product + " ");
		}
		System.out.println();
		System.out.println("----------------------");
		
		sc.close();
	}
	/*
	 * iterate : 반복하다.
	 */
}

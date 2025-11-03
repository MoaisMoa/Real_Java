package day09.Collectrions.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetRx {
public static void main(String[] args) {
	Set<Integer> set = new HashSet<Integer>();
	
	System.out.println(set.add(1));
	System.out.println(set.add(2));
	System.out.println(set.add(3));
	System.out.println(set.add(4));
	System.out.println(set.add(5));
	System.out.println(set.add(6));
	
	for(Integer item : set) {
		System.out.print(item + " ");
	}
	System.out.println();
	
	/*
	 * Set컬렉션은 중복된 요소를 저장하지 않는다. == 중복 불가
	 * 만약 이미 존재하는 2,4을 추가하면 저장되지 않고 false를 반환한다.
	 * 
	 */
	
	System.out.println(set.add(2));
	System.out.println(set.add(4));
	System.out.println(set);
	System.out.println("size(개수) : "+set.size());
	
	/*
	 * 삭제 : Set에는 순서(index)가 없으므로 인스턴스 자체로 삭제한다.
	 */
	
	set.remove(3);
	set.remove(5);
	System.out.println("size(개수) : "+set.size());
	System.out.println(set.remove(10));
}
}

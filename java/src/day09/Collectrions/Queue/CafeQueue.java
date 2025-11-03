package day09.Collectrions.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CafeQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		
		//손님 줄서기
		queue.add("마동석");
		queue.add("최민식");
		queue.add("하정우");
		
		System.out.println("현재 대기줄 : "+ queue);
		
		while(!queue.isEmpty()) {
			String customer = (queue.peek()+"님 안녕하세요!"); //맨 앞사람 응대
			//String customer = queue.poll();
			System.out.println(customer + "님 주문 완료!");
			System.out.println("남은 대기줄 : "+queue);
		}
		System.out.println("업무가 종료 되었습니다.");
	}
}

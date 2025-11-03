package day09.Collectrions.Set;

//import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSet {

	public static void main(String[] args) {
		//중복제거
		Set<Integer> lottoSet = new HashSet<Integer>();
		Random random = new Random();
		
		while(lottoSet.size()<6) {
			int num = random.nextInt(45)+1;
			boolean check = lottoSet.add(num);
			if(!check) {
				System.out.println(num+"번이 중복되어서 다시 뽑습니다.");
			}
		}
		System.out.println("로또 번호 : "+ lottoSet);
		
		/* 정렬 :
		 * Set 컬렉션 자체는 순서가 없으므로..
		 * 순서가 있는 List 컬렉션으로 변환하여 정렬할 수 있다.
		 * Hash --> ArrayList로 변환한다.
		 */
		
		//오름차순 정렬시킴
		ArrayList<Integer> lottoList = new ArrayList<Integer>(lottoSet);
		Collections.sort(lottoList);
		
		System.out.println("로또 번호 : "+ lottoList);
	}
}

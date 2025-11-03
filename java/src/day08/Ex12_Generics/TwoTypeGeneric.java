package day08.Ex12_Generics;

/*
 * 제네릭 기법으로 타입 매개변수 2개 지정
 */

class KeyValue <K,V>{
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
}

public class TwoTypeGeneric<K, V> {

	public static void main(String[] args) {
		/*
		 * 제네릭 객체 생성 :
		 * 클래스타입<타입1, 타입2> 객체명=new 클래스<타입1, 타입2>();
		 * -객체 생성하는 클래스명 뒤의 타입은 생략 가능하다.
		 * -new 클래스<> <-- 요거 생략 가능!!) ();
		 */
		KeyValue <String,Integer> kv = new KeyValue<>();
		kv.setKey("Java");
		kv.setValue(100);
		
		KeyValue<Integer, String> kv2 = new KeyValue<>();
		kv2.setKey(100);
		kv2.setValue("Java");
		
		System.out.println("kv-key : "+kv.getKey());
		System.out.println("kv-value : "+kv.getValue());
		
		System.out.println("kv2-key : "+kv2.getKey());
		System.out.println("kv2-value : "+kv2.getValue());
		
		//앞 매개변수는 지정하고 뒤는 지정 안하고 싶다면..
		KeyValue<String, Void> kv3 = new KeyValue<>();
		kv3.setKey("Key만 지정할래! 이건 문자열이니까 자동으로 String으로 되겠지!");
		String key3 = kv3.getKey();
		System.out.println("key3 : "+key3);
	}
	
}

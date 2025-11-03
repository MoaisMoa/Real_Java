package day08.Ex12_Generics;

class X {}

class A extends X {}
class B extends A {}
class C extends A {}

/*
 * 타입 매개변수 A클래스와 그 하위 클래스로만 가능하도록 제한한다.
 * 아래처럼 하면..ABC만 타입 범위를 정해주는거지!
 */
class D<T extends A>{
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

/*
 * Number 클래스 타입 매개변수로 사용 가능하도록 제한한다.
 * (Integer, Double등 숫자타입 클래스만 사용 가능하도록 제한한다.)
 */
class E <T extends Number> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}

public class BoundedTypeClass {

	public static void main(String[] args) {
		// D<X> d0 = new D<X>(); -> ABC까지만으로 제한 했기 때문에 안되겠지!
		D<A> d1 = new D<A>();
		D<B> d2 = new D<B>();
		D<C> d3 = new D<C>();
		
		d1.setT(new A());
		d2.setT(new B());
		d3.setT(new C());
		
		d1.setT(new B()); //B를 A로 업캐스팅 하고 있는거지
		d1.setT(new C()); //C를 A로 업캐스팅
				
		/*
		 * d2.setT(new A());
		 * d3.setT(new A());
		 * d2<B>, d3<C> => 부모 객체인 A 대입 불가
		 * 다운캐스팅 상황인데 업캐스팅이 전제되지 않아서 불가능!
		 * 
		 * 업캐스팅 한 후 다운캐스팅 하게 되면..
		 * A a = new B(); 이게 업캐스팅! 업캐스팅 먼저!
		 * B b = (B) a; 이게 다운캐스팅
		 */
		
		/*
		 * E <T extends Number>
		 * Number 클래스로 제한해서 숫자 타입인 클래스만 타입지정 가능하다.
		 */
		
		E<Integer> e1 = new E<Integer>();
		E<Double> e2 = new E<Double>();
		E<Byte> e3 = new E<Byte>();
		
		e1.setT(100);
		System.out.println(e1.getT());
		
		e2.setT(12.34);
		System.out.println(e2.getT());
		/*
		 * 그냥 쓴 정수는(127) => int 타입으로 인식되겠지
		 * 이건 4byte인데..
		 * 
		 * e3 객체에 지정한 타입은 Byte(byte) => 1byte 이기 때문에
		 * 강제 형 변환이 필요하다.
		 */
		
		
		e3.setT((byte)127);
		System.out.println(e3.getT());
		
	}
}

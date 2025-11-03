package lombok.basic;
import lombok.Data;
import lombok.Builder;

@Data //import lombok.Data; 필요
@Builder

public class Pikachu {

	final int energy; //final로 선언하면 반드시 값을 필요로함.
	String type;
	int level;
	/*
	 * 필수 생성자로 지정하려면 @NonNull 또는 final 선언하면 된다.
	 * final 지정 안하면 기본 생성자 되는거임
	 */
}

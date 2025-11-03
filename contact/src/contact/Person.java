package contact;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder


public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int no;
	private String name;
	private String phone;
	private String memo;

}

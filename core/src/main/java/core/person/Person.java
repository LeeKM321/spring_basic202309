package core.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든 파라미터 생성자
@EqualsAndHashCode
public class Person {
	
	private String nickname;
	private String address;
	private int age;
	
	
	

}

package StudentClass;

import java.time.LocalDate;

public class ExecMember {
	
	public static void main(String[] args) {
		StudentMember stmem = new StudentMember(100, "äwê∂ÇP", LocalDate.of(2010, 7, 30));
		Member men = stmem;
		System.out.println(men.getId());
		System.out.println(men.getName());
		
	}

}

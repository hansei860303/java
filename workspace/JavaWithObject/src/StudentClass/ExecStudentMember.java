package StudentClass;

import java.time.LocalDate;

public class ExecStudentMember {
	
	public static void main(String[] args) {
		
		StudentMember stmem = new StudentMember(100, "äwê∂ÇP", LocalDate.of(2010, 7, 30));
		System.out.println(stmem.getId());
		System.out.println(stmem.getName());
		System.out.println(stmem.getBirthday());
		System.out.println(stmem.exprationDate());
	}
	
	
}

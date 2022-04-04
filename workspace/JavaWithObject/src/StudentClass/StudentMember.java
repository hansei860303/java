package StudentClass;

import java.time.LocalDate;

public class StudentMember extends Member {

	private LocalDate birthday;
	
	public StudentMember(int id, String name, LocalDate birthday) {
		super(id, name);
		this.birthday = birthday;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public LocalDate exprationDate() {  //—LŒøŠúŒÀ
		return birthday.plusYears(18);
		
	}

}

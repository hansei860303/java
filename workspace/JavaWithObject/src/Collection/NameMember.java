package Collection;

import java.util.Comparator;

public class NameMember implements Comparator<Member>{
	
	private int id;
	private String name;
	
	public NameMember(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compare(Member o1, Member o2) {
        String s1=o1.getName(),s2 = o2.getName();
		return s1.compareTo(s2);
	}

}

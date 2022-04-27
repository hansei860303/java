package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		Set<String> ids = new HashSet<>();
		ids.add("�A���p���}��");
		ids.add("�X�[�p�[�}��");
		ids.add("�o�b�h�}��");
		ids.add("�X�p�C�_�[�}��");
		ids.add("�o�b�h�}��");
		System.out.println("HashSet");
		for(String id : ids) {
			System.out.println(id);
		}
		
		Set<String> ids1 = new TreeSet<>();
		ids1.add("�A���p���}��");
		ids1.add("�X�[�p�[�}��");
		ids1.add("�o�b�h�}��");
		ids1.add("�X�p�C�_�[�}��");
		ids1.add("�o�b�h�}��");
		System.out.println("TreeSet");
		for(String id : ids1) {
			System.out.println(id);
		}
	}

}

package StreamClass;

import java.util.List;

public class Department {

		private String name;
		private String manager;
		private List<String> employees;
		
		public Department(String name, String manager, List<String> employees) {
			this.name = name;
			this.manager = manager;
			this.employees = employees;
		}

		public String getName() {
			return name;
		}

		public String getManager() {
			return manager;
		}

		public List<String> getEmployees() {
			return employees;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setManager(String manager) {
			this.manager = manager;
		}

		public void setEmployees(List<String> employees) {
			this.employees = employees;
		}

		@Override
		public String toString() {
			return "Department [name=" + name + ", manager=" + manager + ", employees=" + employees + "]";
		}
		
		


}

package RandClass;

public class GenSample1 {

	public static void main(String[] args) {
		
		System.out.println("サンプル1");
		Gen gen = new Gen();
		gen.display("aaa");
		gen.display(111);
		
		System.out.println("サンプル2");
		MyGen gen1= new MyGen();
		gen1.display("bbb");
		gen1.display(222);

	}

}

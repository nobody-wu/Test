package top.annwz.test;

/**
 * Created by Wuhuahui on 2017/1/3.
 */
//: SweetShop.java
// Examination of the way the class loader works
class Candy {
	static {
		System.out.println("Loading Candy");
	}
}
class Gum {
	static {
		System.out.println("Loading Gum");
	}
}
class Cookie {
	static {
		System.out.println("Loading Cookie");
	}
}
public class Classs {
	public static void main(String[] args) {
		System.out.println("inside main");
		Candy candy = new Candy();
		Candy candy1 = new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("top.annwz.test.Gum");//需要全路径
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(
				"After Class.forName(\"Gum\")");
		Cookie cookie = new Cookie();
		System.out.println("After creating Cookie");
		Class[] classes = Classs.class.getInterfaces();

	}
} ///:~
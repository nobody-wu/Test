package top.annwz.test;

/**
 * Created by huahui.wu on 2017/3/7.
 */
public class StringTest1 {

	private static void add(String t) {
		t = t + "world";

	}

	public static void main(String[] args) {
		String t = "Hello ";
		add(t);
		System.out.println(t);

	}


}

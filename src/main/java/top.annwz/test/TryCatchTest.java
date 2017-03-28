package top.annwz.test;

/**
 * Created by Wuhuahui on 2016/12/29.
 */
public class TryCatchTest {
	public int  tryTest() {
		int[] arr = new int[]{1, 2, 3, 4, 5};
		int i = 0;
		try {
			System.out.println("try");
//			return "try";
			i = 10;
		} catch (Exception e) {
			System.out.println("catch");
//			return "catch";
			i = 20;
		} finally {

			System.out.println("finally");
			i = 30;
			return 2;
		}
//		return i;
	}

	public static void main(String[] args) {
		TryCatchTest test = new TryCatchTest();
		System.out.println("sout:" + test.tryTest());
	}
}

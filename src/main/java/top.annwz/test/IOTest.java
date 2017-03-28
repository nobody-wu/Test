package top.annwz.test;

import java.io.*;

/**
 * Created by Wuhuahui on 2016/12/29.
 */
public class IOTest {

	public void test() throws IOException {
		File file = new File("d://1.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		byte[] b = new byte[1024];
		int ch = 0;
		while ((ch = fileInputStream.read(b)) != -1) {

		}
	}

	public void test2() throws IOException{
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
	                new FileOutputStream(""), "utf-8"));
	        writer.write("");


	}

	public void test3(){
		String path = "d://test.txt";

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(new FileInputStream(path), "utf-8"));
			System.out.println(reader.readLine());
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void test4() {
		File file = new File("d://test.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fileInputStream);
//			byte[] b = new byt e[1024];
//			int ch = 0;
//			while ((ch = fileInputStream.read(b)) != -1){
//				System.out.println(fileInputStream.read(b));
//			}
			System.out.println(bis.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		IOTest ioTest = new IOTest();

		ioTest.test4();
	}
 }

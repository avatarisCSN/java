package test5;

public class TestMetodaSubstring {

	public static void main(String[] args) {
		String start = "*/";
		 int index= start.indexOf("*");
			System.out.println(index);
		String res = start.substring(1);
		System.out.println(res);
		String end = start.substring(0,1);
		System.out.println(end);
		
System.out.println();

	}

}

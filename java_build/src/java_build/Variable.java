package java_build;

public class Variable {

	public static void main(String[] args) {
		
		byte b;
		short s;
		int i;
		long l;
		char c;
		String str;
		
		b=Byte.MAX_VALUE;
		s=Short.MAX_VALUE;
		i=Integer.MAX_VALUE;
		l=Long.MAX_VALUE;
		str="\"�ȳ�ȳ�ȳ�\"\t�ȳ�κ�\n�Ͻ�����";
		c='A';
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println("���� : "+ c);
		System.out.println("���� : "+ (int)c);
		System.out.println(str);

	}

}

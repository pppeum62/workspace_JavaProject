
public class StringEx {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(", C++");
		
		System.out.println("���� : "+a.length());
		System.out.println(a.contains("#"));
		
		a = a.concat(b); //���ڿ� ����
		System.out.println(a);
		
		a=a.trim(); //���� ����
		System.out.println(a);
		
		a=a.replace("C#", "JAVA"); //��ġ
		System.out.println(a);
		
		String s[] = a.split(","); //�и�
		for(int i = 0; i < s.length; i++)
			System.out.println("�и��� ���ڿ�"+s[i]);
		
		a=a.substring(5);
		System.out.println(a);
		
		char c = a.charAt(2);
		System.out.println(c);
	}
}

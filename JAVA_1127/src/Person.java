
public class Person {
	
	int age;
	
	public static void main(String ar[]) {
		Person pa[] = new Person[10];
		
		int a = 30;
		
		for(int i = 0; i < pa.length; i++) {
			pa[i] = new Person();
			pa[i].age = a;
			a++;
			System.out.print(pa[i].age+" ");
		}
	}
}
import java.util.*;
import java.io.*;

public class Phone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String info;
		System.out.println("전화번호 입력프로그램입니다.");
		
		try {
			//FileOutputStream file = new FileOutputStream("Phone.txt");
			FileWriter fw = new FileWriter("Phone.txt");
			while(true) {
				System.out.print("name PhoneNumber >> ");
				info = sc.nextLine();
				if(info.equals("그만"))
					break;
				//file.write(info.getBytes());
				fw.write(info + "\r\n");
			}
			
			sc.close();
			fw.close();
		}catch(IOException e) {
			System.out.println("Phone.txt에 저장할 수 없었습니다.");
			return;
		}
		
		System.out.println("Phone.txt에 저장되었습니다.");
	}
}

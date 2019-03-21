
public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	public static void main(String ar[]) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 6;
		tv.onOff = true;
		System.out.println("TV_1의 채널은 "+tv.channel+"이고, 볼륨은 "+tv.volume+"입니다.");
		
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		System.out.println("TV_2의 채널은 "+yourTv.channel+"이고, 볼륨은 "+yourTv.volume+"입니다.");
		
		Television tv1 = new Television();
		Television tv2 = tv1;
	}

}

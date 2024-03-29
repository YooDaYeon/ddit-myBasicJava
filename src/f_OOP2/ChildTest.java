package f_OOP2;

public class ChildTest {
	public static void main(String[] args) {
		//1. Child의 객체를 만들라 변수ci
		Child ci = new Child();
		//2. ci의 volume을 15로 변경
		ci.volume=15;
		//3. ci의 volume을 하나 증가
		ci.volumeUp();
		//4. ci의 volume을 출력
		System.out.println(ci.volume );
		//5. ci의 channel을 5로 변경
		ci.channel=5;
		//6. ci의 channel을 출력
		System.out.println(ci.channel );
		//7. ci의 channel을 하나 증가
		ci.channelUp();
		//8. ci의 channel을 출력
		System.out.println(ci.channel );
	}
}

class Parent{
	int channel;
	void channelUp(){
		channel++;
	}
}

class Child extends Parent{
	int volume;
	int channel;
	void volumeUp(){
		volume++;
	}
}
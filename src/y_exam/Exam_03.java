package y_exam;

public class Exam_03 {
	public static void main(String[] args){
	
		//[3-1] 다음 연산의 결과를 적으시오.
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		//1+2<<33 => 3<<33 => int는 32비트라서 32비트를 한바퀴 돌면 원래대로임
		// 그래서 32비트 돌고 나머지 값인 1만 쉬프트 하면 됨
		// 3 << 1 => 3*2^1 => 6
		System.out.println(y >= 5 || x < 0 && x > 2);
		// true || false && false => false, &&가 ||보다 우선순위 높음 => true || false => true 
		System.out.println(y += 10 - x++);
		// y + 10 = 15, 15 - 2 = 13 여기서 x는 3이 됨
		System.out.println(x+=2);
		// 3+2 = 5
		System.out.println( !('A' <= c && c <='Z') );
		// !true => false
		System.out.println('C'-c);
		// 67 - 65 = 2
		System.out.println('5'-'0');
		// 53 - 48 = 5
		System.out.println(c+1);
		// 65 + 1 = 66
		System.out.println(++c);
		// ++은 이항연산자와 달리 형변환 발생 안함, 그래서 1증가하면 'B' 출력
		System.out.println(c++);
		// ++이 뒤에 있기 때문에 B출력 후 c에는 C값 들어감
		System.out.println(c);
		// C 출력
		/*
		[3-2] 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다. 만일
		사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면, 13개의 바구니
		가 필요할 것이다. (1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_2.java
		
		class Exercise3_2 {
		public static void main(String[] args) { 
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket = ( * (1) * ); // 모든 사과를 담는데 필요한 바구니의 수
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
			}
		}
		[실행결과]
			13	 
		*/		
		
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		int numOfBucket =(numOfApples % sizeOfBucket != 0 ? (numOfApples/sizeOfBucket) + 1 : numOfApples/sizeOfBucket) ; // 모든 사과를 담는데 필요한 바구니의 수
		//나머지 값을 이용해서 나머지 값이 있으면 바구니를 하나 더 증가시켜 개수를 만들고 0으로 떨어진다면 몫 값만큼의 바구니 개수만 주도록 함
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
			
		/*
		[3-3] 아래는 변수 num의 값에 따라 ‘양수’, ‘음수’, ‘0’을 출력하는 코드이다. 삼항 연산
		자를 이용해서 (1)에 알맞은 코드를 넣으시오.
		[Hint] 삼항 연산자를 두 번 사용하라.
		[연습문제]/ch3/Exercise3_3.java
		class Exercise3_3 {
		public static void main(String[] args) {
		int num = 10;
		System.out.println( * (1) * );
			}
		}
		*/
		int num=10;
		System.out.println(num<0 ? "음수" : num > 0 ? "양수" : 0	);	
		// 숫자가 0보다 작으면 음수를 주고 다른 조건들 중 숫자가 0보다 크면 양수를 주고 그 나머지는 0을 출력하게 함
		
		/*
		[3-4] 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num
		의 값이 ‘456’이라면 ‘400’이 되고, ‘111’이라면 ‘100’이 된다. (1)에 알맞은 코드를 넣으
		시오.
		[연습문제]/ch3/Exercise3_4.java
		class Exercise3_4 {
		public static void main(String[] args) {
		int num = 456;
		System.out.println( * (1) * );
		}
		}
		*/
		int num1=111;
		System.out.println("4번: " + (num1 - num1%100));
		// 100이하의 자리를 버리는 것이기에 100을 나눈값의 나머지 값을 이용해서 원래 값에서 나머지 값을 빼면 됨
		
		/*
		[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
		값이 333이라면 331이 되고, 777이라면 771이 된다. (1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_5.java
		class Exercise3_5 {
		public static void main(String[] args) {
		int num = 333;
		System.out.println( * (1) * );
		}
		}
		[실행결과]
		양수
		[실행결과]
		400
		[실행결과]
		331
		
		*/
		int num2 = 333;
		System.out.println((num2/10)*10 + 1);
		// (num2/10) => 33, (num2/10)*10 => 330, (num2/10)*10 + 1 => 331
		
		/*
		[3-6] 아래는 변수 num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을
		뺀 나머지를 구하는 코드이다. 예를 들어, 24의 크면서도 가장 가까운 10의 배수는 30이
		다. 19의 경우 20이고, 81의 경우 90이 된다. 30에서 24를 뺀 나머지는 6이기 때문에 변
		수 num의 값이 24라면 6을 결과로 얻어야 한다. (1)에 알맞은 코드를 넣으시오.
		[Hint] 나머지 연산자를 사용하라.
		[연습문제]/ch3/Exercise3_6.java
		class Exercise3_6 {
		public static void main(String[] args) {
		int num = 24;
		System.out.println( * (1) * );
		}
		}
		*/
		int num3 = 24;
		System.out.println("6번: " +((num3/10 +1 )*10 - num3));
		// num3/10 => 2, num3/10 +1 => 3, (num3/10 +1 )*10 =>30
		// (num3/10 +1 )*10 - num3 => 30 - 24 =6
		/*
		[3-7] 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 'C =
		5/9 ×(F - 32)'라고 할 때, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점
		셋째자리에서 반올림해야한다.(Math.round()를 사용하지 않고 처리할 것)
		
		[연습문제]/ch3/Exercise3_7.java
		class Exercise3_7 {
		public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = ( * (1) * );
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		}
		}
		[실행결과]
		6
		[실행결과]
		Fahrenheit:100
		Celcius:37.78
		*/
		
		int fahrenheit = 100;
		float celcius = (int)(((float)5/9*(fahrenheit-32)+0.005f)*100)/100f;
		
		// (float)5/9*(fahrenheit-32) => 37.77778, (float)5/9*(fahrenheit-32)+0.005f => 37.78278
		// ((float)5/9*(fahrenheit-32)+0.005f)*100 => 3778.278
		// (int)(((float)5/9*(fahrenheit-32)+0.005f)*100) => 3778
		// (int)(((float)5/9*(fahrenheit-32)+0.005f)*100)/100f => 37.78
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
		
		/*
		[3-8] 아래 코드의 문제점을 수정해서 실행결과와 같은 결과를 얻도록 하시오.
		[연습문제]/ch3/Exercise3_8.java
		class Exercise3_8 {
		public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = a + b;
		char ch = 'A';
		ch = ch + 2;
		float f = 3 / 2;
		long l = 3000 * 3000 * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2;
		System.out.println("c="+c);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		}
		}
		
		[실행결과]
		c=30
		ch=C
		f=1.5
		l=27000000000
		result=true
		*/
		
		byte a = 10;
		byte b = 20;
		byte c1 = (byte)(a + b);// a+b를 캐스트 하지 않으면 계산할 때 int로 변경해 계산하기 때문에 c1이 byte인데 더 큰
								// int값을 넣으려면 되지 않는다. a+b를 캐스트 하던지, c1을 int로 바꾸던지 둘 중하나 해야함
		char ch = 'A';
		ch = (char)(ch + 2); //char가 계산을 하면서 int형으로 바꾸어 계산하기 때문에 캐스트를 해야 함 
		float f = (float)3 / 2; // 3/2로만 하면 정수형끼리  계산해서 1.0이 나온다. 실수형으로 캐스트 해주면 소숫점까지 나오게 됨
		long l = 3000 * 3000 * 3000l;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = d==f2; // 2의 n승으로 나뉘어 지는 것만 같음, 정밀도가 달라서
		System.out.println("c="+c1);
		System.out.println("ch="+ch);
		System.out.println("f="+f);
		System.out.println("l="+l);
		System.out.println("result="+result);
		
		/*
		[3-9] 다음은 문자형 변수 ch가 영문자(대문자 또는 소문자)이거나 숫자일 때만 변수 b
		의 값이 true가 되도록 하는 코드이다. (1)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_9.java
		class Exercise3_9 {
		public static void main(String[] args) {
		char ch = 'z';
		boolean b = ( * (1) * );
		System.out.println(b);
		}
		}
		[실행결과]
		c=30
		ch=C
		f=1.5
		l=27000000000
		result=true
		[실행결과]
		true
		*/
		
		char ch1 = 'z';
		boolean b1 = ('A' <= ch1 && ch1 <= 'Z' || 'a' <= ch1 && ch1 <= 'z' || '0' <= ch1 && ch1 <= '9');
		// 대문자 || 소문자 || 숫자형
		System.out.println("9번: " +b1);
		
		/*
		[3-10] 다음은 대문자를 소문자로 변경하는 코드인데, 문자 ch에 저장된 문자가 대문자
		인 경우에만 소문자로 변경한다. 문자코드는 소문자가 대문자보다 32만큼 더 크다. 예를
		들어 'A‘의 코드는 65이고 ’a'의 코드는 97이다. (1)~(2)에 알맞은 코드를 넣으시오.
		[연습문제]/ch3/Exercise3_10.java
		class Exercise3_10 {
		public static void main(String[] args) {
		char ch = 'A';
		char lowerCase = ( * (1) * ) ? ( * (2) * ) : ch;
		System.out.println("ch:"+ch);
		System.out.println("ch to lowerCase:"+lowerCase);
		}
		}
		[실행결과]
		ch:A
		ch to lowerCase:a
		*/
		
		char ch2 = 'A';
		char lowerCase = ('A' <= ch2 && ch2 <= 'Z') ? (char)(ch2+32) : ch2;
		// 'A'에서 'Z'일 때 소문자가 대문자보다 32가 크기에 32를 더하는데 계산 시 int형으로 변경해서 계산을 하기에
		// cast를 해서 char형의 소문자 형을 출력
		System.out.println("ch:"+ch2);
		System.out.println("ch to lowerCase:"+lowerCase);
	}
}
